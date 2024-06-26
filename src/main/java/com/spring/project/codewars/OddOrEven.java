package com.spring.project.codewars;

public class OddOrEven {

    public static String oddOrEven(int[] array) {
        // your code

        int resultado;

        String result = "";

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                resultado = array[i] + array[j];

                if (array[i] <= 0) {
                    result = "even";
                }else if (resultado % 2 == 0) {

                    result = "odd";
                } else {

                    result = "even";
                }
            }
        }
    return result;
    }
}
