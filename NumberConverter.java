//Boo!!

import java.util.Scanner;

public class NumberConverter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("+++NUMBER CONVERTER+++\n");
        System.out.println("Available numerical basis: bin, oct, dec, hex\n");

        System.out.print("Enter numerical base of the input: ");
        String inputBasis = scanner.nextLine();
        boolean inputIsValid = baseValidation(inputBasis);
        System.out.print("Enter numerical base of the output: ");
        String outputBasis = scanner.nextLine();
        boolean outputIsValid = baseValidation(outputBasis);
        int cCase = baseCheck(inputBasis, outputBasis);

        if(inputIsValid == false || outputIsValid == false){
            exit("Invalid Base.");
        } else if (cCase == 0){
            exit("Base of input and output are the same.");
        } else {
            int iBase = convertBase(inputBasis);
            int oBase = convertBase(outputBasis);
        }
        

        System.out.print("\nNumber: ");
        String number = scanner.nextLine();
    }

    public static boolean baseValidation(String base){
        return switch (base) {
            case "2", "bin", "8", "oct", "10", "dec", "16", "hex" -> true;
            default -> false;
        };
    }

    public static int baseCheck(String input, String output) {
        if (output.equals(input) || input.equals(output)) {
            return 0;           //0 = base of input & output is the same
        } else if (input.equals("10") || input.equals("dec") || output.equals("10") || output.equals("dec")) {
            return 1;           //1 = base of input / output is decimal
        } else {
            return 2;           //2 = base of input & output is not decimal
        }
    }

    public static int convertBase(String base) {
        return switch (base) {
            case "2", "bin" -> 2;
            case "8", "oct" -> 8;
            case "10", "dec" -> 10;
            case "16", "hex" -> 16;
            default -> 0;
        };
    }

    public static void exit(String reason){
        System.out.print("\nError: " + reason);
        System.exit(0);
    }
}