//Boo!!

package FitnessCalculatorPlus;

import java.util.Scanner;

public class Information {
    private final String version = "2.0";
	private final String lastUpdate = "11.01.24";
    private final String divider = "----------------------------------------";
    public Scanner scanner = new Scanner(System.in);

    public String getVersion(){
        return this.version;
    }

    public String getLastUpdate(){
        return this.lastUpdate;
    }

    public String getDivider(){
        return this.divider;
    }
}
