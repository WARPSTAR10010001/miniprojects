//Boo!!

package #FitnessCalculatorPlus;

public class Main {
    static Information info = new Information();
	static UserData data = new UserData();

    public static void main(String[] args) {
        System.out.println("++++FITNESS CALCULATOR++++");
		System.out.println("Version: " + info.getVersion() + " / Last Updated: " + info.getLastUpdate() + "\n");

		selection(true);
    }

    public static void selection(boolean isFirstRun) {
		System.out.println(info.getDivider() + "\n");
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
		int selection = info.scanner.nextInt();

		if(selection >= 1 || selection <= 4){
			System.out.println("\n" + info.getDivider() + "\n");
		}

        switch(selection){
            case 0 -> {
                if(!isFirstRun){
                    exit(false, 0);
                } else {
                    exit(true, 1);
                }
            }
            case 1 -> Calculator.bmi();
			case 2 -> Calculator.owc();
			case 3 -> Calculator.whr();
            case 4 -> Calculator.wcr();
            default -> exit(true, 1);
        }
	}

    public static void continueSelection() {
		System.out.println("\n\n" + info.getDivider());
		System.out.print("\nCalculate another value? [Y/N]: ");
		info.scanner.nextLine();
		char restart = info.scanner.nextLine().charAt(0);

            switch (restart) {
                case 89, 121 -> {
                    System.out.print("Reset all values? [Y/N]: ");
                    char reset = info.scanner.nextLine().charAt(0);
                    switch (reset) {
                        case 89, 121 -> data.resetAvailability();
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

    //Add selection, continueSelection and exit functions in the Main.java class
    //Remove local storage of user information in the Calculator.java class and use UserData.java instead, also transfer the resetValues function
    //Add boolean control to calculators in Calculator.java
    //Implement the optimalWeight and turboCalculator functions in the Calculator.java class
}