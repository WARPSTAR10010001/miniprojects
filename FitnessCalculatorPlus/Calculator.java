//Boo!!

package FitnessCalculatorPlus;

import java.util.Scanner;

public class Calculator {

	//Global variables
	static String divider = "----------------------------------------";
	static Scanner scanner = new Scanner(System.in);

	//User variables
	static boolean setWeight;
	static double weight;
	static boolean setHeight;
	static double height;
	static boolean setHip;
	static double hip;
	static boolean setWaist;
	static double waist;
	static boolean setChest;
	static double chest;

	public static void selection(boolean isFirstRun) {
		System.out.println(divider + "\n");
		System.out.println("Please select a calculator:");
		if(!isFirstRun){
			System.out.println("[0]: Exit");
		}
		System.out.println("[1]: Body-Mass-Index Calculator");
		System.out.println("[2]: Optimal Weight Calculator (to be implemented)");
		System.out.println("[3]: Waist-Hip-Ratio Calculator");
		System.out.println("[4]: Waist-Chest-Ratio Calculator");
		System.out.println("[x]: Turbo Calculator (to be implemented)");

		System.out.println();

		System.out.print("Selection: ");
		int selection = scanner.nextInt();

		if(selection >= 1 || selection <= 4){
			System.out.println("\n" + divider + "\n");
		}

        switch(selection){
            case 0 -> {
                if(!isFirstRun){
                    exit(false, 0);
                } else {
                    exit(true, 1);
                }
            }
            case 1 -> bmi();
			case 2 -> owc();
			case 3 -> whr();
            case 4 -> wcr();
            default -> exit(true, 1);
        }
	}

	public static void continueSelection() {
		System.out.println("\n\n" + divider);
		System.out.print("\nCalculate another value? [Y/N]: ");
		scanner.nextLine();
		char restart = scanner.nextLine().charAt(0);

            switch (restart) {
                case 89, 121 -> {
                    System.out.print("Reset all values? [Y/N]: ");
                    char reset = scanner.nextLine().charAt(0);
                    switch (reset) {
                        case 89, 121 -> resetValues();
                        case 78, 110 -> {
                        }
                        default -> exit(true, 1);
                    }       System.out.println();
                    selection(false);
                }
                case 78, 110 -> exit(false, 0);
                default -> exit(true, 1);
            }
	}

	public static void bmi() {
		System.out.println("Body-Mass-Index Calculator:");

		if(!setHeight){
			System.out.print("Height [cm]: ");
			height = scanner.nextDouble() / 100.;
			setHeight = true;
		}

		if(!setWeight){
			System.out.print("Weight [kg]: ");
			weight = scanner.nextDouble();
			setWeight = true;
		}

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

	public static void owc(){
		//...
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

	public static void resetValues(){
		setWeight = false;
		setHeight = false;
		setChest = false;
		setHip = false;
		setWaist = false;
	}

	public static void exit(boolean isError, int errorCode){
		if(isError){
			String reason;
			switch (errorCode) {
				case 1:
				reason = "Invalid User Input.";
				break;
				case 2:
				reason = "";
				break;
				default:
				reason = "General Error.";
				break;
			}
			System.out.print("Error Code: " + errorCode + " / Reason: "+ reason);
		} else {
			System.out.print("Session terminated.");
		}
		System.exit(0);
	}
}