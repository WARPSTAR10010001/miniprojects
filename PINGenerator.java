//Boo!!

import java.util.Random;
import java.util.Scanner;

public class PINGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PIN length: ");
        long length = scanner.nextLong();
        scanner.close();

        String pin = generator(length);

        System.out.println("\nGenerated PIN: " + pin);
    }

    public static String generator(long length) {
        StringBuilder pin = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10);
            pin.append(digit);
        }
        return pin.toString();
    }
}