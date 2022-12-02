/*
A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either
direction. Examples of strict palindromes include “ABBA”, “madam”, “radar”, “kayak”, and “step on no pets”.
Write a program that reads a text and detects whether the text is a strict palindrome
*/

class Main {
    public static void main(String[] args) {
        System.out.println("enter your word: ");
        String word = System.console().readLine();

        int length = word.length() - 1;
        int counter = 0;
        boolean endProgram = false;

        while (endProgram == false) {
            if (counter != length) {
                if (word.charAt(counter) == word.charAt(length)) {

                    counter++;
                    length--;
                    System.out.println("letter matched");
                }

                else {
                    endProgram = true;
                    System.out.println("not a palindrome");
                }
            }
            if (counter == length) {
                System.out.println("PALINDROME!!!!!!");
            }

        }

        // if (counter == length && endProgram == false) {
        // System.out.println("PALINDROME!!!!!!");
        // }

    }
}