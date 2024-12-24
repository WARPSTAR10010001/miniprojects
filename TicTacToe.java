//Boo!!

//Maybe include option to play with the program someday?
//Maybe even let player customize the intelligence of the program [n = [1|10]; n/10 chance to make a right move]
import java.util.Scanner;

public class TicTacToe {

    //General static data/objects:
    static Scanner scanner = new Scanner(System.in);
    static int moveCount = 1;
    static String divider = "--------------------------------------------------------------";

    //Settings:
    static char player0 = 'O';
    static char player1 = 'X';
    static boolean startPlayer0 = true;
    static String winningMessage = "You Won! Congrats!";

    public static void main(String[] args){
        System.out.println("+++TIC TAC TOE+++\n");

        System.out.print("Edit settings? [0/1]: ");
        if(scanner.nextInt() == 1){
            editSettings();
        }

        System.out.print("\n" + divider + "\n\n++GAME START++\n\n");

        char[][] court = courtBlueprint();
        printCourt(court);
        System.out.println();

        if(startPlayer0){
            movePlayer0(court);
        } else {
            movePlayer1(court);
        }
    }

    public static void editSettings(){
        System.out.println("\n" + divider + "\n\n++SETTINGS++\n");
        System.out.print("Edit Player letters? [0/1]: ");
        if(scanner.nextInt() == 1){
            scanner.nextLine();
            System.out.print("  Enter letter for the 1st player [default: O]: ");
            String temp = scanner.nextLine();
            player0 = temp.charAt(0);
            System.out.print("  Enter letter for the 2nd player [default: X]: ");
            temp = scanner.nextLine();
            player1 = temp.charAt(0);
        }
        System.out.print("Start with player [0/1]: ");
        if(scanner.nextInt() == 1){
            startPlayer0 = false;
        }
        System.out.print("Customize winning message? [0/1]: ");
        if(scanner.nextInt() == 1){
            scanner.nextLine();
            System.out.print("  New message: ");
            winningMessage = scanner.nextLine();
        }
        System.out.print("\nEdit settings? [0/1]: ");
        if(scanner.nextInt() == 1){
            editSettings();
        }
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

    public static String checkWinner(char[][] court) {
        // Check rows
        for (int i = 0; i < court.length; i += 2) { // Only check even-index rows
            if (court[i][0] != ' ' && court[i][2] != ' ' && court[i][4] != ' ') {
                if (court[i][0] == court[i][2] && court[i][0] == court[i][4]) {
                    return "win";
                }
            }
        }
    
        // Check columns
        for (int i = 0; i < court[0].length; i += 2) { // Only check even-index columns
            if (court[0][i] != ' ' && court[2][i] != ' ' && court[4][i] != ' ') {
                if (court[0][i] == court[2][i] && court[0][i] == court[4][i]) {
                    return "win";
                }
            }
        }
    
        // Check diagonal (top-left to bottom-right)
        if (court[0][0] != ' ' && court[2][2] != ' ' && court[4][4] != ' ') {
            if (court[0][0] == court[2][2] && court[0][0] == court[4][4]) {
                return "win";
            }
        }
    
        // Check diagonal (top-right to bottom-left)
        if (court[0][4] != ' ' && court[2][2] != ' ' && court[4][0] != ' ') {
            if (court[0][4] == court[2][2] && court[0][4] == court[4][0]) {
                return "win";
            }
        }
    
        // Check if court is full (tie)
        boolean isFull = true;
        for (int i = 0; i < court.length; i += 2) { // Only check playable rows
            for (int j = 0; j < court[i].length; j += 2) { // Only check playable columns
                if (court[i][j] == ' ') {
                    isFull = false;
                    break;
                }
            }
        }
        if (isFull) {
            return "tie";
        }
    
        return "null"; // No winner yet
    }    

    public static void movePlayer0(char[][] court){
        System.out.print("[" + moveCount + "]: Player " + player0 + ", enter your next move [0-2] [0-2]: ");
        int xPos = scanner.nextInt();
        int yPos = scanner.nextInt();

        if(xPos > 2 || yPos > 2){
            System.out.println("Please select a number in the given interval.\n");
            movePlayer0(court);
        }

        xPos = correctPos(xPos);
        yPos = correctPos(yPos);

        if(court[xPos][yPos] == ' '){
            court[xPos][yPos] = player0;
        } else {
            System.out.println("The selected index is already reserved.\n");
            movePlayer0(court);
        }

        System.out.println("\n" + divider);

        moveCount++;

        switch (checkWinner(court)) {
            case "null" -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                movePlayer1(court);
            }
            case "tie" -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                exit(false, "Tie!");
            }
            default -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                exit(false, winningMessage);
            }
        }
    }

    public static void movePlayer1(char[][] court){
        System.out.print("[" + moveCount + "]: Player " + player1 + ", enter your next move [0-2] [0-2]: ");
        int xPos = scanner.nextInt();
        int yPos = scanner.nextInt();

        if(xPos > 2 || yPos > 2){
            System.out.println("Please select a number in the given interval.\n");
            movePlayer1(court);
        }

        xPos = correctPos(xPos);
        yPos = correctPos(yPos);

        if(court[xPos][yPos] == ' '){
            court[xPos][yPos] = player1;
        } else {
            System.out.println("The selected index is already reserved.\n");
            movePlayer1(court);
        }

        System.out.println("\n" + divider);

        moveCount++;

        switch (checkWinner(court)) {
            case "null" -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                movePlayer0(court);
            }
            case "tie" -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                exit(false, "Tie!");
            }
            default -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                exit(false, winningMessage);
            }
        }
    }

    public static int correctPos(int pos){
        return switch (pos) {
            case 0 -> 0;
            case 1 -> 2;
            case 2 -> 4;
            default -> -1;
        };
    }

    public static void exit(boolean isError, String reason){
        if(isError){
            System.out.print("Error: " + reason);
        } else {
            System.out.print("\n" + reason);
        }
        System.exit(0);
    }
}