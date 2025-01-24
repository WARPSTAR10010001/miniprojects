//Boo!!

import java.util.Scanner;

public class Exception {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Age [1-99]: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if(age > 99 || age < 1){
            throw new IllegalArgumentException("Age cannot be outside of the given interval.");
        } else {
            System.out.println("Test completed.");
        }
    }
}