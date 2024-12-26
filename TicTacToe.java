//Boo!!

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    //Global data:
    static Scanner scanner = new Scanner(System.in);
    static int moveCount = 1;
    static String divider = "--------------------------------------------------------------";
    static String namePlayer1 = "Player 1";
    static String namePlayer2 = "Player 2";
    static char[][] printableCourt = new char[17][17];
    static boolean[] isCellFull = new boolean[9];

    //Global settings:
    static int AIlevel = 0;
    static int startWith = 1;
    static String winningMessage = "You won! Congratulations!";
    static boolean playWithAI;

    public static void main(String[] args) {
        System.out.println("+++TIC TAC TOE+++\n");

        System.out.println(divider + "\n\n++MENU++\n");

        System.out.print("Play with AI? [0/1]: ");
        if (scanner.nextInt() == 1) {
            playWithAI = true;
            AIlevel = 1;
        }

        System.out.print("\nEdit settings? [0/1]: ");
        if (scanner.nextInt() == 1) {
            editSettings();
        }

        startGame();
    }

    public static void editSettings() {
        System.out.println("\n" + divider + "\n\n++SETTINGS++\n");
        if (playWithAI) {
            System.out.print("Set AI level [current: " + AIlevel + "] [1-3]: ");
            int temp = scanner.nextInt();
            if (temp < 1 || temp > 3) {
                exit(true, "Invalid AI level.");
            } else {
                AIlevel = temp;
            }
        }
        if (!playWithAI) {
            System.out.print("Edit player names? [0/1]: ");
            if (scanner.nextInt() == 1) {
                scanner.nextLine();
                System.out.print("  Enter name for the 1st player [current: " + namePlayer1 + "]: ");
                namePlayer1 = scanner.nextLine();
                System.out.print("  Enter name for the 2nd player [current: " + namePlayer2 + "]: ");
                String temp = scanner.nextLine();
                if (temp.equals(namePlayer1)) {
                    exit(true, "Can't have two players with the same name.");
                } else {
                    namePlayer2 = temp;
                }
            }
        }

        if (playWithAI) {
            System.out.print("Start with player? [current: " + startWith + "] [0/1]: ");
            if (scanner.nextInt() == 0) {
                startWith = 0;
            }
        } else {
            System.out.print("Start with player? [current: " + startWith + "] [1/2]: ");
            if (scanner.nextInt() == 2) {
                startWith = 2;
            }
        }

        if (!playWithAI) {
            System.out.print("Customize winning message? [0/1]: ");
            if (scanner.nextInt() == 1) {
                scanner.nextLine();
                System.out.print("  New message: ");
                winningMessage = scanner.nextLine();
            }
        }

        System.out.print("\nEdit settings? [0/1]: ");
        if (scanner.nextInt() == 1) {
            editSettings();
        }
    }

    public static void startGame() {
        System.out.print("\n" + divider + "\n\n++GAME START++\n\n");
        Arrays.fill(isCellFull, false);
        printCourtBlueprint();
        moveCount = 1;

        int[][] court = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        printCourt(court);
        System.out.println();

        if(startWith == 0){
            moveAI(court);
        } else if (!playWithAI && startWith == 1){
            movePlayer(1, court);
        } else if (playWithAI && startWith == 1){
            movePlayer(0, court);
        } else if (!playWithAI && startWith == 2){
            movePlayer(2, court);
        }
    }

    public static void printCourtBlueprint() {
        for(int i = 0; i < printableCourt.length; i++){
            for(int j = 0; j < printableCourt[i].length; j++){
                if(i == 5 || i == 11){
                    if(j == 5 || j == 11){
                        printableCourt[i][j] = 'o';
                    } else {
                        printableCourt[i][j] = '-';
                    }
                } else if (j == 5 || j == 11){
                    printableCourt[i][j] = '|';
                } else {
                    printableCourt[i][j] = ' ';
                }
            }
        }
    }

    public static void printCourt(int[][] court) {
        if (court[0][0] != 0 && !isCellFull[0]) {
            drawChar(0, 0, court[0][0]);
            isCellFull[0] = true;
        } else if (court[0][1] != 0 && !isCellFull[1]) {
            drawChar(6, 0, court[0][1]);
            isCellFull[1] = true;
        } else if (court[0][2] != 0 && !isCellFull[2]) {
            drawChar(12, 0, court[0][2]);
            isCellFull[2] = true;
        } else if (court[1][0] != 0 && !isCellFull[3]) {
            drawChar(0, 6, court[1][0]);
            isCellFull[3] = true;
        } else if (court[1][1] != 0 && !isCellFull[4]) {
            drawChar(6, 6, court[1][1]);
            isCellFull[4] = true;
        } else if (court[1][2] != 0 && !isCellFull[5]) {
            drawChar(12, 6, court[1][2]);
            isCellFull[5] = true;
        } else if (court[2][0] != 0 && !isCellFull[6]) {
            drawChar(0, 12, court[2][0]);
            isCellFull[6] = true;
        } else if (court[2][1] != 0 && !isCellFull[7]) {
            drawChar(6, 12, court[2][1]);
            isCellFull[7] = true;
        } else if (court[2][2] != 0 && !isCellFull[8]) {
            drawChar(12, 12, court[2][2]);
            isCellFull[8] = true;
        }

        for (int i = 0; i < printableCourt.length; i++) {
            for (int j = 0; j < printableCourt[i].length; j++) {
                System.out.print(printableCourt[i][j]);
            }
            System.out.println();
        }
    }

    public static void drawChar(int yO, int xO, int num) {
        if (num == 1) {
            printableCourt[xO + 1][yO + 2] = 'O';
            printableCourt[xO + 2][yO + 1] = 'O';
            printableCourt[xO + 2][yO + 3] = 'O';
            printableCourt[xO + 3][yO + 2] = 'O';
        } else {
            if (!playWithAI) {
                printableCourt[xO + 1][yO + 1] = 'X';
                printableCourt[xO + 1][yO + 3] = 'X';
                printableCourt[xO + 2][yO + 2] = 'X';
                printableCourt[xO + 3][yO + 1] = 'X';
                printableCourt[xO + 3][yO + 3] = 'X';
            } else {
                printableCourt[xO + 1][yO + 2] = '+';
                printableCourt[xO + 2][yO + 1] = '+';
                printableCourt[xO + 2][yO + 2] = '+';
                printableCourt[xO + 2][yO + 3] = '+';
                printableCourt[xO + 3][yO + 2] = '+';
            }
        }
    }

    public static String checkWinner(int[][] court) {
        for (int i = 0; i < court.length; i++) {
            if (court[i][0] + court[i][1] + court[i][2] == 3 || court[i][0] + court[i][1] + court[i][2] == -3) {
                return "win";
            }
        }

        for (int i = 0; i < court[0].length; i++) {
            if (court[0][i] + court[1][i] + court[2][i] == 3 || court[0][i] + court[1][i] + court[2][i] == -3) {
                return "win";
            }
        }

        if (court[0][0] + court[1][1] + court[2][2] == 3 || court[0][0] + court[1][1] + court[2][2] == -3) {
            return "win";
        }

        if (court[0][2] + court[1][1] + court[2][0] == 3 || court[0][2] + court[1][1] + court[2][0] == -3) {
            return "win";
        }

        boolean isFull = true;
        for(int i = 0; i < isCellFull.length; i++){
            if(isCellFull[i] == false){
                isFull = false;
            }
        }
        if (isFull) {
            return "tie";
        }

        return "null";
    }

    public static void moveAI(int[][] court) {
        System.out.print("[" + moveCount + "]: It's the AIs turn: ");

        boolean isValidPos = false;
        boolean isSet = false;
        
        if(AIlevel == 3 && moveCount != 1){
            if((court[0][0] == court[1][1]) || (court[0][0] == court[2][2]) || (court[1][1] == court[2][2])){
                for(int i = 0; i < court.length; i++){
                    if(court[i][i] == 0 && !isSet){
                        isSet = true;
                        court[i][i] = -1;
                        System.out.print(convertCoorToPos(i, i));
                    }
                }
            } else if ((court[0][2] == court[1][1]) || (court[0][2] == court[2][0]) || (court[1][1] == court[2][0])){
                for(int i = 0; i < court.length; i++){
                    for(int j = 2; j >= 0; j--){
                        if(court[i][j] == 0 && !isSet){
                            isSet = true;
                            court[i][j] = -1;
                            System.out.print(convertCoorToPos(i, j));
                        }
                    }
                }
            }
        } else if (!isSet && AIlevel >= 2 && moveCount != 1){
            for(int i = 0; i < court.length; i++){
                if((court[i][0] == court[i][1]) || (court[i][0] == court[i][2]) || (court[i][1] == court[i][2])){
                    for(int j = 0; j < court.length; j++){
                        if(court[i][j] == 0 && !isSet){
                            isSet = true;
                            court[i][j] = -1;
                            System.out.print(convertCoorToPos(i, j));
                        }
                    } 
                } else if ((court[0][i] == court[1][i]) || (court[0][i] == court[2][i]) || (court[1][i] == court[2][i])){
                    for(int j = 0; j < court.length; j++){
                        if(court[i][j] == 0 && !isSet){
                            isSet = true;
                            court[i][j] = -1;
                            System.out.print(convertCoorToPos(i, j));
                        }
                    }
                }
            }
        } else if ((!isSet && AIlevel >= 1) || moveCount == 1){
            while (!isValidPos) {
                int randomPos = (int) (Math.random() * 9) + 1;
                int[] tempPos = convertPosToCoor(randomPos);
                int xPos = tempPos[0];
                int yPos = tempPos[1];
    
                if (court[xPos][yPos] == 0 && !isSet) {
                    isValidPos = true;
                    court[xPos][yPos] = -1;
                    System.out.print(randomPos);
                }
            }
        }

        System.out.println("\n\n" + divider);

        moveCount++;

        switch (checkWinner(court)) {
            case "null" -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                movePlayer(0, court);
            }
            case "tie" -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                exit(false, "It's a tie!");
            }
            default -> {
                System.out.println();
                printCourt(court);
                System.out.println("\nThe AI won!");
                replayMenu();
            }
        }
    }

    public static void movePlayer(int turn, int[][] court) {
        if (playWithAI && turn == 0) {
            System.out.print("[" + moveCount + "]: It's the players turn: ");
        } else if (!playWithAI && turn == 1) {
            System.out.print("[" + moveCount + "]: " + namePlayer1 + ", it's your turn: ");
        } else {
            System.out.print("[" + moveCount + "]: " + namePlayer2 + ", it's your turn: ");
        }

        int inputPos = scanner.nextInt();

        if (inputPos > 9 || inputPos < 0) {
            System.out.println("Please select a number in the given interval.\n");
            movePlayer(turn, court);
        }

        int tempPos[] = convertPosToCoor(inputPos);
        int xPos = tempPos[0];
        int yPos = tempPos[1];

        if (court[xPos][yPos] == 0) {
            if (turn == 1 || turn == 0) {
                court[xPos][yPos] = 1;
            } else {
                court[xPos][yPos] = -1;
            }
        } else {
            System.out.println("The selected index is already reserved.\n");
            movePlayer(turn, court);
        }

        moveCount++;

        System.out.println("\n" + divider + "\n");
        printCourt(court);

        switch (checkWinner(court)) {
            case "null" -> {
                System.out.println();
                if (!playWithAI) {
                    if (turn == 1) {
                        movePlayer(2, court);
                    } else {
                        movePlayer(1, court);
                    }
                } else {
                    moveAI(court);
                }
            }
            case "tie" -> {
                System.out.println("\nTie!");
                replayMenu();
            }
            default -> {
                System.out.println();
                if (!playWithAI) {
                    System.out.println("\n" + winningMessage);
                    replayMenu();
                } else {
                    System.out.println("\nThe player won!");
                    replayMenu();
                }
            }
        }
    }

    public static int[] convertPosToCoor(int pos) {
        int[] cP = new int[2];
        switch (pos) {
            case 1 -> {
                cP[0] = 0;
                cP[1] = 0;
            }
            case 2 -> {
                cP[0] = 0;
                cP[1] = 1;
            }
            case 3 -> {
                cP[0] = 0;
                cP[1] = 2;
            }
            case 4 -> {
                cP[0] = 1;
                cP[1] = 0;
            }
            case 5 -> {
                cP[0] = 1;
                cP[1] = 1;
            }
            case 6 -> {
                cP[0] = 1;
                cP[1] = 2;
            }
            case 7 -> {
                cP[0] = 2;
                cP[1] = 0;
            }
            case 8 -> {
                cP[0] = 2;
                cP[1] = 1;
            }
            case 9 -> {
                cP[0] = 2;
                cP[1] = 2;
            }
            default -> {
                cP[0] = -1;
                cP[1] = -1;
            }
        }

        return cP;
    }

    public static int convertCoorToPos(int xPos, int yPos) {
        return xPos * 3 + yPos + 1;
    }

    public static void exit(boolean isError, String reason) {
        if (isError) {
            System.out.print("\nError: " + reason);
        } else {
            System.out.print("\n" + reason);
        }
        System.exit(0);
    }

    public static void replayMenu() {
        System.out.print("\nDo you want to play another game? [1/0]: ");
        if (scanner.nextInt() == 1) {
            if (!playWithAI) {
                System.out.print("Are the same players playing? [1/0]: ");
                if (scanner.nextInt() == 0) {
                    namePlayer1 = "Player 1";
                    namePlayer2 = "Player 2";
                    System.out.print("Player names can be changed in the settings.");
                }
            }

            startGame();
        } else {
            exit(false, "Game session terminated.");
        }
    }
}
