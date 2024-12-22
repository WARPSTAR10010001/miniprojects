//Boo!!

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        System.out.println("+++GUESSING GAME+++\n");
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 11);
        int guess = Integer.MIN_VALUE;
        int guessCount = 1;

        String[] affirmation = affirmations();

        while(guess != randomNum){
            if(guessCount > 10){
                System.out.print("Your " + guessCount + "th dumbass guess: ");
            } else {
                System.out.print("Guess " + guessCount + ": ");
            }
            guess = scanner.nextInt();
            if(guess != randomNum){
                System.out.print(affirmation[(int) (Math.random() * 6)] + "\n");
            }
            guessCount++;
        }

        if(guess == randomNum){
            System.out.print("You are chickering!!");
        } else {
            System.out.print("take a shower plz, FUCKER");
        }
    }

    public static String[] affirmations(){
        String[] affirmations = new String [6];

        affirmations[0] = "ur getting close~~~!!! :P";
        affirmations[1] = "if u beat this in less than " + Integer.MIN_VALUE + " tries, ill give u a prize >:3";
        affirmations[2] = "make this coding worth it!!";
        affirmations[3] = "creative quote goes here";
        affirmations[4] = "the peenar is almost over";
        affirmations[5] = "ur on a timer, hurry up...........";

        return affirmations;
    }
}