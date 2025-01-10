//Boo!!

package FitnessCalculatorPlus;

public class Main {
    static Information information = new Information();

    public static void main(String[] args) {
        System.out.println("++++FITNESS CALCULATOR++++");
		System.out.println("Version: " + information.getVersion() + " / Last Updated: " + information.getLastUpdate() + "\n");

		Calculator.selection(true);
    }

    //Add selection, continueSelection and exit functions in the Main.java class
    //Remove local storage of user information in the Calculator.java class and use UserInput.java instead, also transfer the resetValues function
    //Add boolean control to calculators in Calculator.java
    //Implement the optimalWeight and turboCalculator functions in the Calculator.java class
}