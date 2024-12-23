//Boo!!

import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("+++TIC TAC TOE+++\n");
        char[][] court = courtBlueprint();
        printCourt(court);
    }

    public static char[][] courtBlueprint(){
        char[][] court = new char[5][5];

        for(int i = 0; i < court.length; i++){
            if(i % 2 == 1){
                for(int j = 0; j < court[i].length; j++){
                    court[i][j] = '-';
                }
            } else {
                for(int j = 0; j < court[i].length; j++){
                    if(j % 2 == 1){
                        court[i][j] = '|';
                    } else {
                        court[i][j] = ' ';
                    }
                }
            }
        }

        return court;
    }

    public static void printCourt(char[][] court){
        for(int i = 0; i < court.length; i++){
            for(int j = 0; j < court[i].length; j++){
                System.out.print(court[i][j]);
            }
            System.out.println();
        }
    }

    public static void playerO(char[][] court){

    }

    public static void playerX(char[][] court){
        System.out.print("Player X, enter your next move [x, y]: ");
        int xPos = scanner.nextInt();
        int yPos = scanner.nextInt();

        //check if field is full, if not, add move
    }
}