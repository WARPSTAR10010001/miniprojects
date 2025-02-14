//Boo!!

import java.util.ArrayList;
import java.util.Scanner;

public class Listify {
    //Global objects:
    static Scanner scanner = new Scanner(System.in);

    //Final variables:
    static final String LASTUPDATE = "10.02.2025";
    static final String VERSION = "1.1 Alpha";
    static final String DIVIDER = "\n--------------------------------------------\n";

    //Global variables:
    static String[] option = new String[5];
    static boolean isAdmin = false;
    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Integer> priority = new ArrayList<>();

    public static void main(String[] args) {
        init();

        System.out.println("++++++++++ LISTIFY ++++++++++");
        System.out.println("Version: " + VERSION + " / Last Updated: " + LASTUPDATE);

        System.out.println();
        
        tasks.add("Tu irgendwas oder so");
        priority.add(4);

        menu();
    }

    public static void menu(){
        printList();
    }

    public static void printList(){
        for(int i = 0; i < tasks.size(); i++){
            System.out.println("[" + (i + 1) + "]: " + tasks.get(i) + " [Priority: " + priorityConversion(priority.get(i)) + "]");
        }
    }

    public static String priorityConversion(Integer i){
        return switch(i){
            case 0 -> "LOW";
            case 1 -> "MIDDLE";
            case 2 -> "HIGH";
            case 3 -> "VERY HIGH";
            default -> "UNDEFINED";
        };
    }

    public static void init(){
        //Initiate options menu
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