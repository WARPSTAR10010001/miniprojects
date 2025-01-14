//Boo!!

package FitnessCalculatorPlus;

import java.util.Scanner;

public class Calculator {

	//Global variables
	static Scanner scanner = new Scanner(System.in);
	static UserData data = new UserData();

	public static void bmi() {
		System.out.println("Body-Mass-Index Calculator:");

		if(!data.isHeightAvailable()){
			System.out.print("Height [cm]: ");
			data.setHeight(scanner.nextDouble() / 100.);
			data.setHeightAvailable(true);
		}

		if(!data.isWeightAvailable()){
			System.out.print("Weight [kg]: ");
			data.setWeight(scanner.nextDouble());
			data.setWeightAvailable(true);
		}

		System.out.printf("%n%s%.1f%s%s", "Your BMI is ", bmiCalc(data.getWeight(), data.getHeight()), ". ", bmiResult(bmiCalc(data.getWeight(), data.getHeight())));

		Main.continueSelection();
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

		Main.continueSelection();
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

		Main.continueSelection();
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