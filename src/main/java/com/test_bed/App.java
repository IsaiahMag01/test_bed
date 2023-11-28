package com.test_bed;
/**
 * Write a test bed program which test if java is working in a slightly more advanced way then the simple hello world program
 * @author(IsaiahM)
 * 
 * App.java
 */

public class App 
{
    /**
     * Generate a dashed line with an extra space at the start and end of the word
     * @param word
     */
    public static void dashLine(String word) {
        for (int i = 0; i < word.length() + 2; i++) { //Generate top row
            System.out.print("-");
        }
        System.out.println();
    }
    /** 
     * Method which wraps a box around any user input
     * @param string word you are wrapping around the word
     */
    public static void wordBox(String word) {
        dashLine(word);
        dashLine(word);
       
        System.out.printf("|%s|%n", word);      //Output the word

        
        dashLine(word);
        dashLine(word);
    }
    /**
     * Main method to run the program
     * @param args
     */
    public static void main( String[] args )
    {
        wordBox("Hello World");
    }
}
