//Boo!!

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("+++GUESSING GAME+++\n");
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 101);
        int guess = Integer.MIN_VALUE;
        int guessCount = 1;
        boolean isHardmode = false;
        boolean isFreaky = false;

        System.out.print("Do you want to enable the hard mode for big boyo boykissers? [1/0]: ");
        int temp = scanner.nextInt();

        switch (temp) {
            case 1:
                isHardmode = true;
                System.out.print("Hardmode: " + isHardmode + "\n\n");
                break;
            case 0:
                isHardmode = false;
                System.out.print("Hardmode: " + isHardmode + "\n\n");
                break;
            case 69420:
                isFreaky = true;
                System.out.print("FREAKY mode enabled~~ :P :3\n\n");
                break;
            default:
                exit(false, "fucking dumbass read the instructions.");
                break;
        }

        String[] affirmation = affirmations();
        if (!isHardmode && !isFreaky) {
            while (guess != randomNum) {
                if (guessCount > 100) {
                    System.out.print("Your " + guessCount + "th dumbass guess: ");
                } else {
                    System.out.print("Guess " + guessCount + ": ");
                }
                guess = scanner.nextInt();
                if (guess != randomNum) {
                    System.out.print(affirmation[(int) (Math.random() * 6)] + "\n");
                    if (guess > randomNum) {
                        System.out.println("nuh uh, give me a lower number");
                    } else {
                        System.out.println("sigma sigma boy. give me a larger number");
                    }
                }
                System.out.println();
                guessCount++;
            }
        } else if (isHardmode && !isFreaky) {
            while (guess != randomNum) {
                if (guessCount > 100) {
                    System.out.print("Your " + guessCount + "th dumbass guess: ");
                } else {
                    System.out.print("Guess " + guessCount + ": ");
                }
                guess = scanner.nextInt();
                if (guess != randomNum) {
                    System.out.print(affirmation[(int) (Math.random() * 6)] + "\n");
                }
                System.out.println();
                guessCount++;
            }
        } else {
            while (guess != randomNum) {
                String[] freaky = freaky();
                if (guessCount > 100) {
                    System.out.print("Your " + guessCount + "th freaky guess: ");
                } else {
                    System.out.print("freaky Guess nr " + guessCount + ": ");
                }
                guess = scanner.nextInt();
                if (guess != randomNum) {
                    System.out.print(freaky[(int) (Math.random() * 11)] + "\n");
                }
                if (guess > randomNum) {
                    System.out.println("nuh uh, give me a lower number");
                } else {
                    System.out.println("sigma sigma boy. give me a larger number");
                }
                System.out.println();
                guessCount++;
            }
        }

        if (guess == randomNum) {
            System.out.print("You are chickering!!");
        } else {
            System.out.print("take a shower plz, FUCKER");
        }

        scanner.close();
    }

    public static String[] affirmations() {
        String[] affirmations = new String[6];

        affirmations[0] = "ur getting close~~~!!! :P";
        affirmations[1] = "if u beat this in less than " + Integer.MIN_VALUE + " tries, ill give u a prize >:3";
        affirmations[2] = "make this coding worth it!!";
        affirmations[3] = "creative quote goes here";
        affirmations[4] = "the peenar is almost over";
        affirmations[5] = "ur on a timer, hurry up...........";

        return affirmations;
    }

    public static String[] freaky() {
        String[] freaky = new String[10];

        freaky[0] = "not time to get freaky yet :P";
        freaky[1] = "just put the fries in the bag lil bro";
        freaky[2] = "DIDDY ON ME!!";
        freaky[3] = "kendrick just opened his mouth. and im 'bout to put my dick in it rn, then i put it in his ass..";
        freaky[4] = "time to get oiled up~";
        freaky[5] = "u look like u like miners";
        freaky[6] = "*brazilian funk starts playing*";
        freaky[7] = "lemme lick those toes -charli 2024";
        freaky[8] = "FWEHH!";
        freaky[9] = "ermm what the sigma";

        return freaky;
    }

    public static void exit(boolean isError, String reason) {
        if (isError) {
            System.out.print("Error: " + reason);
        } else {
            System.out.print(reason);
        }
        System.exit(0);
    }
}
