package com.spring.project.codewars;

import java.util.ArrayList;
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

        if (recipe.isEmpty() || available.isEmpty() || available.size() < recipe.size()) {

            return recetas;

        } else {

            for (Map.Entry<String, Integer> entry : recipe.entrySet()) {

                for (Map.Entry<String, Integer> entry2 : available.entrySet()) {

                    if (entry.getKey() == entry2.getKey()) {

                        ArrayList<Integer> valor = new ArrayList<>();
                                valor.add(entry2.getValue() / entry.getValue());

                                System.out.println();

                    }
                }
            }
            return recetas;
        }
    }
}

class Prueba {

    public static void main(String[] args) {

        Map<String, Integer> recipe = Map.of(
                "harina", 200,
                "azúcar", 100,
                "huevos", 300
        );

        Map<String, Integer> available = Map.of(
                "harina", 2000,
                "azúcar", 2000,
                "leche", 3000
        );

        System.out.println(PeteBaker.cakes(recipe, available));
    }
}