package com.github.zipcodewilmington;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    //randomly select string (word)
    //separate String into single 'char' (a separate type)
    //
    public static void main(String[] args) {
        //Array random String word ~randomWord
        //separate selected word into charAt() ~separated
        //guess chances = ~separated word length ~chance
        //User entry subtracts ~chance and compares to ~separated index ~
        //Display underscores equal to length of word
        //Replace underscores with matched characters

        String[] words = {"block", "street", "city", "alley"};
        Random random = new Random();
        String secretWord = words[random.nextInt(words.length)];
        char[] userGuess = new char[secretWord.length()];
        int chances = words.length;


        System.out.println("Let's play a game =)");
        System.out.println("H  A   N   G   M   A   N");

        for (int i = 0; i < secretWord.length(); i++) {
            userGuess[i] = '_';
        }
        Scanner input = new Scanner(System.in);

        while (chances > 0) {
            System.out.println("Total guesses: " + Arrays.toString(userGuess));
            System.out.println(" ");

            System.out.println(chances + " chances left!");
            System.out.println(" ");

            System.out.print("Enter a letter to get started: ");
            System.out.println(" ");
            System.out.println(" ");

            char guess = input.next().charAt(0);

            boolean rightGuess = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    userGuess[i] = guess;
                    rightGuess = true;
                }
            }
            if (!rightGuess) {
                chances--;
                System.out.println("Sorry. Umm well you just lost.");
                System.out.println(" ");
                System.out.println(" ");


            } else if (new String(userGuess).equals(secretWord))
            {
                System.out.println(" ");
                System.out.println(" ");

                    System.out.println("Wow, look at you. You actually guessed the word! " + secretWord.toUpperCase());

                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Would you like to play again??");
                break;
            }
        }
    }
}


