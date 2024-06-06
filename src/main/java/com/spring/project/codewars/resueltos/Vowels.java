package com.spring.project.codewars.resueltos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  RESUELTO

public class Vowels {

/**
 * Return the number (count) of vowels in the given string.
 *
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 *
 * The input string will only consist of lower case letters and/or spaces.*/
    public static int getCount(String str) {

        int count = 0;

        Pattern pattern = Pattern.compile("[aeiouAEIOU]");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            count++;
        }

        return count;
    }
}

