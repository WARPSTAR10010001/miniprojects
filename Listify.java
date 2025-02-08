//Boo!!

import java.util.ArrayList;
import java.util.Scanner;

public class Listify {
    //Global objects:
    static Scanner scanner = new Scanner(System.in);

    //Final variables:
    static final String LASTUPDATE = "08.02.2025";
    static final String VERSION = "1.0 Alpha";
    static final String DIVIDER = "\n--------------------------------------------\n";

    //Global variables:
    static String[] option = new String[5];
    static boolean isAdmin = false;
    static ArrayList<String> tasks = new ArrayList<>();


    public static void main(String[] args) {
        init();

        System.out.println("++++++++++ LISTIFY ++++++++++");
        System.out.println("Version: " + VERSION + " / Last Updated: " + LASTUPDATE);

        menu();
    }

    public static void menu(){
        
    }

    public static void printList(){

    }

    public static void init(){
        //initiate options menu
        option[0] = "Admin Mode";
        option[1] = "Print list";
        option[2] = "Add task";
        option[3] = "Finish task";
        option[4] = "Delete task";
    }

    public static void exit(boolean isError, int errorCode){
        if(isError){
            String msg = "Error " + errorCode + ": ";
            switch (errorCode){
                case 0 -> msg += "Internal System Error";
                case 1 -> msg += "Input mismatch";
                //Add other error messages if needed
                default -> {}
            }

            System.out.println(msg);
        } else {
            System.out.println("Session terminated");
        }
    }
}