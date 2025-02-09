//Boo!!

import java.util.Scanner;

public class GradeFlow {
    //Global objects:
    static Scanner scanner = new Scanner(System.in);
    static String[] options = new String[5];

    //Global variables:
    static final String VERSION = "1.0 Alpha";
    static final String LASTUPDATE = "08.02.25";
    static final String NAME = "GradeFlow";
    static final String DIVIDER = "\n--------------------------------------------\n";
    public static void main(String[] args) {
        init();
        System.out.println("+++++ " + NAME.toUpperCase() + " +++++");
        System.out.println("Version: " + VERSION + " / Last Updated: " + LASTUPDATE);
        menu();
    }

    public static void menu(){
        System.out.print(DIVIDER);

        for(int i = 0; i < options.length; i++){
            System.out.println("[" + (i + 1) + "]: " + options[i]);
        }

    }

    public static void init(){
        options[0] = "Calculate Average Grade";
        options[1] = "";
    }
}