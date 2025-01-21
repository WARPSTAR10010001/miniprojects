//Boo!!

import java.util.Scanner;

public class NumberConverter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("+++NUMBER CONVERTER+++\n");
        System.out.println("Available numerical basis: bin, oct, dec, hex\n");

        System.out.print("Enter numerical base of the input: ");
        String inputBasis = (scanner.nextLine()).toLowerCase();
        System.out.print("Enter numerical base of the output: ");
        String outputBasis = (scanner.nextLine()).toLowerCase();

        int cCase = baseCheck(inputBasis, outputBasis);

        if (baseValidation(inputBasis) == false || baseValidation(outputBasis) == false) {
            exit("Invalid Base.");
        } else if (cCase == 0) {
            exit("Base of input and output are the same.");
        }

        System.out.print("\nInput number: ");
        String iNumber = (scanner.nextLine()).toUpperCase();
        String oNumber = null;

        int iBase = convertBase(inputBasis);
        int oBase = convertBase(outputBasis);

        if (iNumber.length() == 0 || numIsValid(iNumber, iBase) == false) {
            exit("Input number is invalid.");
        }

        if (cCase == 1) {
            oNumber = converter(iNumber, iBase, oBase);
        } else if (cCase == 2) {
            oNumber = converter(converter(iNumber, iBase, 10), 10, oBase);
        }

        System.out.print("Output number: " + oNumber);
    }

    public static String converter(String num, int iB, int oB) {
        int decimalValue;
        if (iB == 10) {
            decimalValue = Integer.parseInt(num);
        } else {
            decimalValue = Integer.parseInt(num, iB);
        }

        if (oB == 10) {
            return Integer.toString(decimalValue);
        }

        return Integer.toString(decimalValue, oB).toUpperCase();
    }

    public static boolean baseValidation(String base) {
        return switch (base) {
            case "2", "bin", "8", "oct", "10", "dec", "16", "hex" ->
                true;
            default ->
                false;
        };
    }

    public static int baseCheck(String input, String output) {
        if (output.equals(input) || input.equals(output)) {
            return 0;
        } else if (input.equals("10") || input.equals("dec") || output.equals("10") || output.equals("dec")) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int convertBase(String base) {
        return switch (base) {
            case "2", "bin" ->
                2;
            case "8", "oct" ->
                8;
            case "10", "dec" ->
                10;
            case "16", "hex" ->
                16;
            default ->
                0;
        };
    }

    public static boolean numIsValid(String num, int base) {
        switch (base) {
            case 2 -> {
                for (int i = 0; i < num.length(); i++) {
                    if (num.charAt(i) != '0' && num.charAt(i) != '1') {
                        return false;
                    }
                }
            }
            case 8 -> {
                for (int i = 0; i < num.length(); i++) {
                    if (num.charAt(i) != '0' && num.charAt(i) != '1' && num.charAt(i) != '2' && num.charAt(i) != '3' && num.charAt(i) != '4' && num.charAt(i) != '5' && num.charAt(i) != '6' && num.charAt(i) != '7') {
                        return false;
                    }
                }
            }
            case 10 -> {
                for (int i = 0; i < num.length(); i++) {
                    if (num.charAt(i) != '0' && num.charAt(i) != '1' && num.charAt(i) != '2' && num.charAt(i) != '3' && num.charAt(i) != '4' && num.charAt(i) != '5' && num.charAt(i) != '6' && num.charAt(i) != '7' && num.charAt(i) != '8' && num.charAt(i) != '9') {
                        return false;
                    }
                }
            }
            case 16 -> {
                for (int i = 0; i < num.length(); i++) {
                    if (num.charAt(i) != '0' && num.charAt(i) != '1' && num.charAt(i) != '2' && num.charAt(i) != '3' && num.charAt(i) != '4' && num.charAt(i) != '5' && num.charAt(i) != '6' && num.charAt(i) != '7' && num.charAt(i) != '8' && num.charAt(i) != '9' && num.charAt(i) != 'A' && num.charAt(i) != 'B' && num.charAt(i) != 'C' && num.charAt(i) != 'D' && num.charAt(i) != 'E' && num.charAt(i) != 'F') {
                        return false;
                    }
                }
            }
            default -> {
                return false;
            }
        }
        return true;
    }

    public static void exit(String reason) {
        System.out.print("\nError: " + reason);
        System.exit(0);
    }
}