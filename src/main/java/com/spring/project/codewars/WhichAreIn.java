package com.spring.project.codewars;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * <p>
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns ["arp", "live", "strong"]
 * <p>
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns []
 * <p>
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * Beware: In some languages r must be without duplicates.
 * <p>
 * El orden lexicográfico es el que se utiliza para ordenar caracteres. Normalmente se diferencia entre letras mayúsculas y minúsculas, y además se consideran los números y los signos de puntuación. En los diccionarios se utiliza orden lexicográfico, pero en ellos no se hace diferencia entre mayúsculas y minúsculas.
 */

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                array1[i] = array1[i].toLowerCase();

                array2[j] = array2[i].toLowerCase();
            }
        }
        return array2;
    }
}

