//Boo!!

import java.util.Scanner;

public class SleepTime {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException{
        System.out.println("+++SLEEP TIME TEST+++\n");

        System.out.print("Start test? [0/1]: ");
        if(scanner.nextInt() == 0){
            exit(false, "Test terminated.");
        }

        Thread.sleep(2000);

        System.err.println();
        
        for(int i = 0; i < 101; i++){
            if(i == 100){
                System.out.print(i);
            } else {
                System.out.print(i + "/");
            }
        }

        Thread.sleep(2000);

        System.out.print("\n\nDone!!");
    }

    public static void exit(boolean isError, String reason){
        if(isError){
            System.out.print("\nError: " + reason);
        } else {
            System.out.print("\n" + reason);
        }
    }
}
