package com.github.zipcodewilmington;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class HangmanTest {
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
        Scanner display = new Scanner(System.in);
        System.out.print("Let's play a game =)");

        for (int i = 0; i < secretWord.length(); i++) {
            userGuess[i] = '_';
        }
        Scanner input = new Scanner(System.in);

        while (chances > 0) {
            System.out.println("Total guesses: " + Arrays.toString(userGuess));
            System.out.println(chances + "chances left!");
            System.out.print("Enter just one character here: ");

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
            } else if (new String(userGuess).equals(secretWord)) ;
            {
                System.out.println("Wow, look at you. You actually guessed the word! " + secretWord.toUpperCase());
            }
            Scanner retry = new Scanner(System.in);
            System.out.println("Would you like to try again? Enter yes or no:");


        }
    }
}