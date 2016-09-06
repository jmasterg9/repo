package com.mytrails.java.arraysandstrings;

/**
 * Write a program to determine if a String has all unique characters.
 * What if you could not use additional data structures.
 *
 * Created by aagnihot on 9/6/2016.
 */
public class CheckStringUniqueCharacters {
    public static void main(String[] args) {
        String strToTest = "stringhadxcs";
        System.out.println(checkUniqueCharacters(strToTest));
    }

    private static boolean checkUniqueCharacters(String strToTest) {
        boolean isUnique = true;
        // Creating an array to store the characters
        // IMP : Assuming all characters are ASCII characters
        boolean[] chars = new boolean[256];
        for(int i=0; i<strToTest.length(); i++){
            int val = strToTest.charAt(i);
            if(chars[val]){
                return false;
            }

            chars[val] = true; // Flagging that the character exists
        }
        return isUnique;
    }
}
