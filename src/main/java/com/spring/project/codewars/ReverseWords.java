package com.spring.project.codewars;

/**
* Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.*/

public class ReverseWords {

    /*k++;

                originalChar[k-1] = original.charAt(i);*/

    public static String reverseWords(final String original) {

        //  Variables
        String reversed;
        char[] originalChar = original.toCharArray();
        char aux, first, second;
        int contador = 0;

        //  Bucle
        for (int i = 0; i <= originalChar.length-1; i++) {

            first = originalChar[i];
            second = originalChar[i+1];
            aux = first;

        }

        reversed = new String(originalChar);

        System.out.println(reversed);

        return reversed;
    }
}


class Run {

    public static void main(String[] args) {

        ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog.");

    }
}