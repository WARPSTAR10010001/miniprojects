//Boo!!

import java.util.Scanner;

public class TicTacToe {

    //General static data/objects:
    static Scanner scanner = new Scanner(System.in);
    static int moveCount = 1;
    static String divider = "--------------------------------------------------------------";

    //Global settings:
    static String namePlayer1 = "";
    static String namePlayer2 = "";
    static char playerAI = '+';
    static int AIlevel = 0;
    static int startWith = 1; // 0 = AI, 1 = Player 1, 2 = Player 2
    static String winningMessage = "You won! Congratulations!";
    static boolean playWithAI = false;

    public static void main(String[] args) {
        System.out.println("+++TIC TAC TOE+++\n");

        System.out.println(divider + "\n\n++MENU++\n");

        System.out.print("[WIP] Play with AI? [0/1]: ");
        if (scanner.nextInt() == 1) {
            playWithAI = true;
            AIlevel = 1;
        }

        if (!playWithAI) {
            namePlayer1 = "1";
            namePlayer2 = "2";
        } else {
            namePlayer1 = "";
        }

        System.out.print("\nEdit settings? [0/1]: ");
        if (scanner.nextInt() == 1) {
            editSettings();
        }

        System.out.print("\n" + divider + "\n\n++GAME START++\n\n");

        startGame();
    }

    public static void editSettings() {
        System.out.println("\n" + divider + "\n\n++SETTINGS++\n");
        if (playWithAI) {
            System.out.print("Set AI level [default: 1] [1-3]: ");
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
            System.out.print("Start with AI? [0/1]: ");
            if (scanner.nextInt() == 1) {
                startWith = 0;
            }
        } else {
            System.out.print("Start with player? [1/2]: ");
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
        int[][] court = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        printCourt(court);
        System.out.println();

        switch (startWith) {
            case 0 ->
                moveAI(court);
            default ->
                movePlayer(startWith, court);
        }
    }

    public static void printCourt(int[][] court) {
        char[][] pC = new char[17][17];

        //blueprint
        // ...
        if (court[0][0] != 0) {
            pC = drawChar(pC, 0, 0, court[0][0]);
        } else if (court[0][1] != 0) {
            pC = drawChar(pC, 6, 0, court[0][1]);
        } else if (court[0][2] != 0) {
            pC = drawChar(pC, 12, 0, court[0][2]);
        } else if (court[1][0] != 0) {
            pC = drawChar(pC, 0, 6, court[1][0]);
        } else if (court[1][1] != 0) {
            pC = drawChar(pC, 6, 6, court[1][1]);
        } else if (court[1][2] != 0) {
            pC = drawChar(pC, 12, 6, court[1][2]);
        } else if (court[2][0] != 0) {
            pC = drawChar(pC, 0, 12, court[2][0]);
        } else if (court[2][1] != 0) {
            pC = drawChar(pC, 6, 12, court[2][1]);
        } else if (court[2][2] != 0) {
            pC = drawChar(pC, 12, 12, court[2][2]);
        }

        for (int i = 0; i < pC.length; i++) {
            for (int j = 0; j < pC[i].length; j++) {
                System.out.print(pC[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] drawChar(char[][] pC, int xO, int yO, int num) {
        if (!playWithAI) {
            // ...
        } else {
            // ...
        }

        return pC;
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
        for (int i = 0; i < court.length; i++) {
            for (int j = 0; i < court[i].length; j++) {
                if (court[i][j] == 0) {
                    isFull = false;
                }
            }
        }
        if (isFull) {
            return "tie";
        }

        return "null";
    }

    public static char[][] moveAlgorithm(char[][] court) {
        /*
        include different difficulty levels:
        1: random guesses
        2: advanced guesses, for example if line or row is made of 2 of the same symbols, fill line with 3rd symbol to either prevent player from winning or to make ai win
        3: same as 2 but check for diagonals as well
         */

        boolean isValidPosition = false;
        int xPos = -1;
        int yPos = -1;

        // move this block of code into a seperate function
        if (AIlevel == 1) {
            while (!isValidPosition) {
                int randomPos = (int) (Math.random() * 9) + 1;

                switch (randomPos) {
                    case 1 -> {
                        xPos = 0;
                        yPos = 0;
                    }
                    case 2 -> {
                        xPos = 2;
                        yPos = 0;
                    }
                    case 3 -> {
                        xPos = 4;
                        yPos = 0;
                    }
                    case 4 -> {
                        xPos = 0;
                        yPos = 2;
                    }
                    case 5 -> {
                        xPos = 2;
                        yPos = 2;
                    }
                    case 6 -> {
                        xPos = 4;
                        yPos = 2;
                    }
                    case 7 -> {
                        xPos = 0;
                        yPos = 4;
                    }
                    case 8 -> {
                        xPos = 2;
                        yPos = 4;
                    }
                    case 9 -> {
                        xPos = 4;
                        yPos = 4;
                    }
                    default -> {
                        exit(false, "It's a tie!");
                    }
                }

                if (court[yPos][xPos] == ' ') {
                    isValidPosition = true;
                }
            }
        } else if (AIlevel > 1) {
            exit(true, "AI level not implemented yet.");
        }

        court[yPos][xPos] = playerAI;

        return court;
    }

    public static void moveAI(char[][] court) {
        System.out.print("[" + moveCount + "]: It's the AIs turn: ");

        court = moveAlgorithm(court);

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
                exit(false, "It's a tie!");
            }
            default -> {
                System.out.println();
                printCourt(court);
                System.out.println();
                // include replayMenu
                exit(false, "The AI won!");
            }
        }
    }

    public static void movePlayer(int turn, int[][] court) {
        if (playWithAI) {
            System.out.print("[" + moveCount + "]: It's the players turn [Position: 1-9]: ");
        } else if (turn == 1) {
            System.out.print("[" + moveCount + "]: " + namePlayer1 + ", it's your turn [Position: 1-9]: ");
        } else {
            System.out.print("[" + moveCount + "]: " + namePlayer2 + ", it's your turn [Position: 1-9]: ");
        }

        int inputPos = scanner.nextInt();

        if (inputPos > 9 || inputPos < 0) {
            System.out.println("Please select a number in the given interval.\n");
            movePlayer(turn, court);
        }

        int xPos = inputPos % 3;
        int yPos = inputPos / 3;

        if (court[xPos][yPos] == 0) {
            if (turn == 1) {
                court[xPos][yPos] = 1;
            } else {
                court[xPos][yPos] = 2;
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

    public static void pause(long timeInMilliSeconds) {
        long timestamp = System.currentTimeMillis();

        do {
            //nothing
        } while (System.currentTimeMillis() < timestamp + timeInMilliSeconds);
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
            startGame();
        } else {
            exit(false, "Game session terminated.");
        }
    }
}
