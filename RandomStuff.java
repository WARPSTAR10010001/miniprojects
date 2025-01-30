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
        System.out.println("[4]: Base 2 Calc");
        System.out.println("[5]: Check Prime");

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
            baseTwo();
            case 5:
            System.out.println("\n" + divider);
            checkPrime();
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

    public static void baseTwo(){
        System.out.println("\n2^n:\n");

        System.out.print("Power: ");
        int n = scanner.nextInt();

        System.out.print("Result: " + (int) Math.pow(2, n) + "\n");

        selection(false);
    }
    
    public static void checkPrime() {
        System.out.println("\nCheck Prime:\n");
    
        System.out.print("Number: ");
        int n = scanner.nextInt();
        boolean prime = true;
    
        if (n < 2) {
            prime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
    
        if (prime) {
            System.out.println("\nThe given number is a prime number.");
        } else {
            System.out.println("\nThe given number is not a prime number.");
        }
    
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