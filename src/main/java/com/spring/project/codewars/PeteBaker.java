package com.spring.project.codewars;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PeteBaker {

    /**
     * Pete likes to bake some cakes. He has some recipes and ingredients. Unfortunately he is not good in maths. Can you help him to find out, how many cakes he could bake considering his recipes?
     * <p>
     * Write a function cakes(), which takes the recipe (object) and the available ingredients (also an object) and returns the maximum number of cakes Pete can bake (integer). For simplicity there are no units for the amounts (e.g. 1 lb of flour or 200 g of sugar are simply 1 or 200). Ingredients that are not present in the objects, can be considered as 0.
     * <p>
     * cakes({flour: 500, sugar: 200, eggs: 1}, {flour: 1200, sugar: 1200, eggs: 5, milk: 200});
     */

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        // TODO: Insert Code Here

        int recetas = 0;
        int resultado;
        String keyAvailable;
        String keyRecipe;
        String keyNumRecipe;
        Integer valueAvailable;
        Integer valueRecipe;
        Integer valueNumReceta;

        Map<String, Integer> numRecetas = new TreeMap<>();

        if (recipe.isEmpty() || available.isEmpty() || available.size() < recipe.size()) {

            return recetas;

        } else {

            Map<String, Integer> ordenadoRecipe = new TreeMap<>(recipe);
            Map<String, Integer> ordenadoAvailable = new TreeMap<>(available);

            Iterator<String> itReceta = ordenadoRecipe.keySet().iterator();
            Iterator<String> itAvailable = ordenadoAvailable.keySet().iterator();
            Iterator<String> itNumReceta = ordenadoAvailable.keySet().iterator();

            while (itReceta.hasNext() || itAvailable.hasNext()) {

                keyRecipe = itReceta.next();
                valueRecipe = ordenadoRecipe.get(keyRecipe);

                System.out.println("\nIngrediente de la receta: " + keyRecipe + " y " + "Cantidad: " + valueRecipe);

                keyAvailable = itAvailable.next();
                valueAvailable = ordenadoAvailable.get(keyAvailable);

                System.out.println("\nIngrediente disponible: " + keyAvailable + " y " + "Cantidad: " + valueAvailable);

                if (numRecetas.containsKey(keyRecipe) != numRecetas.containsKey(keyAvailable)) {

                    return recetas;
                }

                resultado = valueAvailable / valueRecipe;

                numRecetas.put(keyRecipe, resultado);

                if (!itReceta.hasNext()) {
                    resultado = valueAvailable / valueRecipe;

                    numRecetas.put(keyRecipe, resultado);

                } else if (!itAvailable.hasNext()) {
                    resultado = valueAvailable / valueRecipe;

                    numRecetas.put(keyRecipe, resultado);
                }
            }

            System.out.println("\nCantidad de recetas: ");

            while (itNumReceta.hasNext()) {

                keyNumRecipe = itNumReceta.next();
                valueNumReceta = numRecetas.get(keyNumRecipe);

                if (valueNumReceta == null) {

                    System.out.println("\n-----> Clave de receta: " + keyNumRecipe + " / " + "Valor receta " + valueNumReceta);

                    return recetas;

                } else {

                    System.out.println("\n-----> Clave de receta: " + keyNumRecipe + " / " + "Valor receta " + valueNumReceta);
                }
            }
        }
        return recetas;
    }
}

class Prueba {

    public static void main(String[] args) {

        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);

        System.out.println(PeteBaker.cakes(recipe, available));
    }
}