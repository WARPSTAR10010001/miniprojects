//Boo!!

import java.util.Scanner;

public class Geforce {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Weight [kg]: ");
        double weight = scanner.nextDouble();

        System.out.print("Geforce [g]: ");
        double geforce = scanner.nextDouble();

        System.out.println("\n\nWeight with " + geforce + " gs: " + calc(weight, geforce) + " kgs");
    }

    public static double calc(double weight, double geforce){
        if(geforce > 1){
            return weight * geforce;
        } else if (geforce == 1){
            return weight;
        } else if (geforce == 0){
            return 0;
        } else {
            return weight / (geforce * 2);
        }
    }
}