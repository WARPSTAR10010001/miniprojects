//Boo!!

import java.util.Scanner;

public class RandomStuff {

    static Scanner scanner = new Scanner(System.in);
    static String divider = "----------------------------------------";
    public static void main(String[] args){
        System.out.println("+++RANDOM STUFF+++");
        selection(true);
    }

    public static void selection(boolean firstRun){
        System.out.println("\n" + divider + "\n");
        if(!firstRun){
            System.out.println("[0]: Exit");
        }

        System.out.println("[1]: Even-Or-Odd");
        System.out.println("[2]: Square Root");
        System.out.println("[3]: Power of -1");
        System.out.println("[4]: The glass maze");

        System.out.print("\nSelection: ");

        switch(scanner.nextInt()){
            case 0:
            exit(false, "Program terminated.");
            case 1:
            System.out.println("\n" + divider);
            evenOdd();
            case 2:
            System.out.println("\n" + divider);
            squareRoot();
            case 3:
            System.out.println("\n" + divider);
            powerOfMinusOne();
            case 4:
            System.out.println("\n" + divider);
            glassMaze();
            default:
            exit(true, "Invalid selection.");
        }
    }

    public static void evenOdd(){
        System.out.println("\nEven-Or-Odd:\n");

        System.out.print("Number: ");
        int n = scanner.nextInt();

        if(n % 2 == 0){
            System.out.print("Result: Even\n");
        } else {
            System.out.print("Result: Odd\n");
        }

        selection(false);
    }

    public static void squareRoot(){
        System.out.println("\nSquare Root:\n");

        System.out.print("Number: ");
        int n = scanner.nextInt();

        System.out.print("Result: " + (int) Math.pow(n, 0.5) + "\n");

        selection(false);
    }

    public static void powerOfMinusOne(){
        System.out.println("\nn^-1:\n");

        System.out.print("Number: ");
        int n = scanner.nextInt();

        System.out.print("Result: " + (int) Math.pow(n, -1) + "\n");

        selection(false);
    }

    public static void glassMaze(){
        System.out.println("\nThe glass maze:\n");

        System.out.print("Amount of tiles: ");
        int n = scanner.nextInt();

        System.out.print("Result: " + (int) Math.pow(2, n) + "\n");

        selection(false);
    }

    public static void exit(boolean isError, String reason){
        if(isError){
            System.out.print("\nError: " + reason);
        } else {
            System.out.print("\n" + reason);
        }
        System.exit(0);
    }
}

//ill just fill this program with random af methods bc i can :3