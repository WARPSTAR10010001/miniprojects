//Boo!!

import java.util.Scanner;

public class CharCounter {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String line = scanner.nextLine();

        System.out.print("Count character: ");
        String character = scanner.nextLine();

        int pos = 0;
        int count = 0;

        if(line.indexOf(character) == -1){
            System.out.println("No occurence");
        } else {
            while ((pos = line.indexOf(character, pos)) != -1) {
                count++;
                pos++;  // Move past the current character
            }
        }
        System.out.println("Total count: " + count);
    }
}
