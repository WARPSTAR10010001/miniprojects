//Boo!!

import java.util.Scanner;

public class SquareWithRecursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.print(recursive(n));
    }

    public static int recursive(int n){
        if(n == 1){
            return 1;
        } else {
            return recursive(n-1) + (2*n-1);
        }
    }
}