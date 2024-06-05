package com.spring.project.codewars;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

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

        ArrayList cantidadIngredientes = new ArrayList();

        if (recipe.isEmpty() || available.isEmpty()) {

            return recetas = 0;

        } else if (recipe.size() == available.size()) {

            String ingredienteReceta, ingredienteDisponible;

            for (String ingrediente : recipe.keySet()) {
                ingredienteReceta = ingrediente.toLowerCase(Locale.ROOT).trim();

                for (String ingrediente2 : available.keySet()) {
                    ingredienteDisponible = ingrediente2.toLowerCase(Locale.ROOT).trim();

                    if (!ingredienteReceta.equals(ingredienteDisponible)) {

                        recetas = 0;

                    } else {
                        int resultadoOperacion = available.get(ingredienteDisponible) / recipe.get(ingredienteReceta);
                        /*continuar*/
                    }
                }
            }
        } else {
            recetas = 0;
        }

        return recetas;
    }
}

class Prueba {

    public static void main(String[] args) {

        Map<String, Integer> recipe = Map.of(
                "harina", 2,
                "azúcar", 1,
                "huevos", 3
        );

        Map<String, Integer> available = Map.of(
                "harina", 2,
                "azúcar", 2,
                "leche", 1
        );

        System.out.println(PeteBaker.cakes(recipe, available));
    }
}