//Boo!!

import java.util.Scanner;

public class FitnessCalculator {

	static Scanner scanner = new Scanner(System.in);
	static String divider = "----------------------------------------";
	static String exit = "\nProgram terminated.";

	public static void main(String[] args) {

		System.out.println("FITNESS CALCULATOR\n");

		selection();
	}

	public static void selection() {
		System.out.println(divider + "\n");
		System.out.println("Please select a calculator:");
		System.out.println("[0]: Exit");
		System.out.println("[1]: Body-Mass-Index Calculator");
		System.out.println("[2]: Waist-Hip-Ratio Calculator");
		System.out.println("[3]: Waist-Chest-Ratio Calculator");

		System.out.println();

		System.out.print("Selection: ");
		int selection = scanner.nextInt();

        switch(selection){
            case 0:
            System.out.print(exit);
            System.exit(0);
            case 1:
            System.out.println("\n" + divider + "\n");
            bmi();
            break;
            case 2:
            System.out.println("\n" + divider + "\n");
            whr();
            break;
            case 3:
            System.out.println("\n" + divider + "\n");
            wcr();
            break;
            default:
            System.out.print("\nInvalid selection.");
            System.exit(0);
        }
	}

	public static void continueSelection() {
		System.out.println("\n\n" + divider);
		System.out.print("\nCalculate another value? [Y/N]: ");
		scanner.nextLine();
		String temp = scanner.nextLine();
		char input = temp.charAt(0);

		if (input == 89 || input == 121) {
			System.out.println();
			selection();
		} else {
			System.out.print(exit);
			System.exit(0);
		}
	}

	public static void bmi() {
		System.out.println("Body-Mass-Index Calculator:");

		System.out.print("Height [cm]: ");
		double height = scanner.nextDouble() / 100.;

		System.out.print("Weight [kg]: ");
		double weight = scanner.nextDouble();

		System.out.printf("%n%s%.1f%s%s", "Your BMI is ", bmiCalc(weight, height), ". ", bmiResult(bmiCalc(weight, height)));

		continueSelection();
	}

	public static double bmiCalc(double weight, double height) {
		return (weight / Math.pow(height, 2));
	}

	public static String bmiResult(double bmi) {
		if (bmi < 18.5) {
			return "This is classed as underweight.";
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			return "This is classed as a normal weight.";
		} else if (bmi >= 25 && bmi <= 29.9) {
			return "This is classed as overweight.";
		} else if (bmi >= 30 && bmi <= 34.9) {
			return "This is classed as obese [level I].";
		} else if (bmi >= 35 && bmi <= 39.9) {
			return "This is classed as obese [level II].";
		} else {
			return "This is classed as obese [level III].";
		}
	}

	public static void whr() {
		System.out.println("Waist-Hip-Ratio Calculator:");

		System.out.print("Waistsize [cm]: ");
		double waist = scanner.nextDouble();

		System.out.print("Hipsize [cm]: ");
		double hip = scanner.nextDouble();

		System.out.printf("%n%s%.2f%s%s", "Your WHR is ", whrCalc(waist, hip), ". ", whrResult(whrCalc(waist, hip)));

		continueSelection();
	}

	public static double whrCalc(double waist, double hip) {
		return (waist / hip);
	}

	public static String whrResult(double whr) {
		if (whr > 0.9) {
			return "This is classed as overweight.";
		} else {
			return "This is classed as a normal weight.";
		}
	}

	public static void wcr() {
		System.out.println("Waist-Chest-Ratio Calculator:");

		System.out.print("Waistsize [cm]: ");
		double waist = scanner.nextDouble();

		System.out.print("Chestsize [cm]: ");
		double chest = scanner.nextDouble();

		System.out.printf("%n%s%.2f%s%s", "Your WCR is ", wcrCalc(waist, chest), ". ", wcrResult(wcrCalc(waist, chest)));

		continueSelection();
	}

	public static double wcrCalc(double waist, double chest) {
		return (waist / chest);
	}

	public static String wcrResult(double wcr) {
		if (wcr <= 0.9) {
			return "This is considered athletic/well-trained.";
		} else {
			return "This is considered unathletic.";
		}
	}
}