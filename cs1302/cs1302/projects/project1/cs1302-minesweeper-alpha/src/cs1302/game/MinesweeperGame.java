package cs1302.game;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/**
 * This class is the engine of the Minesweeper project.
 */
public class MinesweeperGame {

    //creating variables that will be used in program
    private int round = 0;
    private boolean[][] mineGrid;
    private String[][] fieldStatus;
    private int rowNum;
    private int colNum;
    private int mineNum;
    private Scanner read;
    private Scanner scan = new Scanner(System.in);
    private String userInput;
    private String spaces;
    private Scanner inputString;
    private boolean lost;
    private String beforeSpaces;
    private String afterSpaces;
    private boolean fog;

    /**
     * Constructor that uses the {@code seed} parameter to initialize the instance variables.
     * @param seed used to initialize the {@code Minesweeper} object's instance variables
     */
    public MinesweeperGame(String seed) {

        try {
            File file = new File(seed);
            read = new Scanner(file);

            rowNum = read.nextInt();
            colNum = read.nextInt();
            mineNum = read.nextInt();
            mineGrid = new boolean[rowNum][colNum];
            fieldStatus = new String[rowNum][colNum];

        } catch (FileNotFoundException e) {
            System.out.println("Seedfile Not Found Error: Cannot create game with " + seed +
                               "because it cannot be be found or cannot be read due to permission" +
                               ".\n");
            System.exit(1);
        }

        if (rowNum < 5 || colNum < 5 || (mineNum > rowNum * colNum)) {
            System.out.println("Seedfile Format Error: Cannot create game with " + seed +
                               ", because it is not formatted correctly.\n");
            System.exit(1);
        }
        int mineCount = 0;
        while (read.hasNextInt()) {
            int xBomb = -1;
            int yBomb = -1;

            xBomb = read.nextInt();

            if (!read.hasNextInt()) {
                System.out.println("Seedfile Format Error: Cannot create game with " + seed +
                                   ", because it is not formatted correctly.\n");
                System.exit(1);
            } else {
                yBomb = read.nextInt();
            } //else
            mineCount++; //amount of coordinate pairs in seed file
            if (mineGrid[xBomb][yBomb] == true) {

                System.out.println("Seedfile Format Error: Cannot create game with " + seed +
                                   ", because it is not formatted correctly.\n");
                System.exit(1);
            } else {
                mineGrid[xBomb][yBomb] = true;
            } //else
        } //while
        if (mineCount != mineNum) {
            System.out.println("Seedfile Format Error: Cannot create game with " + seed +
                               ", because it is not formatted correctly.\n");
            System.exit(1);
        } //if
    } //constructor

    /**
     * Prints the welcome banner to standard output.
     */
    public void printWelcome() {
        System.out.println("        _\n" +
                           "  /\\/\\ (_)_ __   ___  _____      _____  ___ _ __   ___ _ __\n" +
                           " /    \\| | '_ \\ / _ \\/ __\\ \\ /\\ / / _ \\/ _ \\ '_ \\ / _ \\ " +
                           "'__|\n" +
                           "/ /\\/\\ \\ | | | |  __/\\__ \\\\ V  V /  __/  __/ |_) |  __/ |\n" +
                           "\\/    \\/_|_| |_|\\___||___/ \\_/\\_/ \\___|\\___| .__/ \\___|_|\n" +
                           "                 A L P H A   E D I T I O N |_| v2020.sp\n");
    }

    /**
     * Instantiates the mine grid.
     */
    public void instantiateMineGrid() {

        //calculates the amount of spaces for each fieldStatus[][] String
        spaces = "   ";
        int colHelper = colNum - 1;
        int count = 0;
        while (colHelper > 9) {
            colHelper %= 10;
            spaces += " ";
        }

        //instantiates all fieldStatus[][] strings
        for (int i = 0; i < fieldStatus.length; i++) {
            for (int i2 = 0; i2 < fieldStatus[i].length; i2++) {
                fieldStatus[i][i2] = spaces;
            } //inner for
        } //for

        //instantiates before and after spaces for later commands
        if (spaces.length() / 2 == 0) {
            beforeSpaces = spaces.substring(0, spaces.length() / 2);
            afterSpaces = spaces.substring(0, spaces.length() / 2);
        } else {
            beforeSpaces = spaces.substring(0, spaces.length());
        }
    } //instantiateFieldStatus

    /**
     * Prints the current contents of the mine field to standard output.
     */
    public void printMineField() {

        System.out.println(" Rounds Completed: " + round + " \n");
        int spaceNum = (int)Math.ceil(Math.log10(rowNum));

        String format = "%" + spaceNum + "d";

        for (int i = 0; i < rowNum; i++) {
            System.out.print(" ");
            System.out.printf(format, i);
            System.out.print(" ");

            for (int i2 = 0; i2 < fieldStatus[i].length; i2++) {

                System.out.print("|" + fieldStatus[i][i2]);
            } //inner for

            System.out.println("|");

        } // for

        //prints bottom numbers
        String format2 = "%" + spaceNum + "s";
        System.out.printf(format2, "");
        String columns = Integer.toString(colNum);
        String rows = Integer.toString(rowNum);
        int rowHelper = rowNum - 1;
        System.out.print(" ");
        for (int i = 0; i < colNum; i++) {
            String spaces2 = spaces;
            int i2 = i;
            while (i2 > 9) {
                i2 /= 10;
                spaces2 = spaces2.substring(0, spaces2.length() - 1);
            } //while
            System.out.print(spaces2 + i);

        } //for
        System.out.println("\n");
    } //printMineField

    /**
     * Prints the game prompt to standard output and interprets user input from standard input.
     */
    public void promptUser() {
        try {
            System.out.print("minesweeper-alpha: ");
            userInput = scan.nextLine();
            userInput = userInput.trim();
            System.out.println();
        } catch (NoSuchElementException e) {
            System.out.println("Input Error: Command not recognized!\n");
        } //catch
        userInput = userInput.trim();
    } //promptUser

    /**
     * Returns true if the user wins the game. The user wins the game by "revealing" all squares
     * without a mine and marking all squares with a mine. Needs to check each square on the grid.
     * @return a boolean whether or not the user won the game
     */
    public boolean isWon() {

        boolean wonGame = true;

        for (int i = 0; i < fieldStatus.length && wonGame; i++) {
            for (int i2 = 0; i2 < fieldStatus[i].length && wonGame; i2++) {
                if (mineGrid[i][i2] == true) {
                    int index = -1;
                    index = fieldStatus[i][i2].indexOf('F');
                    if (index == -1) {
                        wonGame = false;
                    } //if
                } else if (mineGrid[i][i2] == false) {
                    boolean hasDigit = false;
                    for (int k = 0; k < fieldStatus[i][i2].length(); k++) {
                        boolean z = Character.isDigit(fieldStatus[i][i2].charAt(k));
                        if (z) {
                            hasDigit = true;
                        } //if
                    } //for
                    if (!hasDigit) {
                        wonGame = false;
                    } //if
                } //else if
            } //inner for
        } //for
        return wonGame;
    } //isWon

    /**
     * Returns true if the user loses the game. The user loses the game by "revealing" a square
     * that has a mine. Needs to check each square on the grid.
     * @return a boolean whether or not the user lost the game
     */
    public boolean isLost() {
        return lost;
    }

    /**
     * Prints the win message to standard output.
     */
    public void printWin() {
        double score = (100.0 * mineGrid.length * mineGrid[0].length) / round;

        System.out.print(" ░░░░░░░░░▄░░░░░░░░░░░░░░▄░░░░ \"So Doge\"\n" +
                         " ░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░░░\n" +
                         " ░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░░░ \"Such Score\"\n" +
                         " ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░░░\n" +
                         " ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░ \"Much Minesweeping\"\n" +
                         " ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░\n" +
                         " ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌░░ \"Wow\"\n" +
                         " ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐░░\n" +
                         " ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌░\n" +
                         " ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌░\n" +
                         " ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐░\n" +
                         " ▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌\n" +
                         " ▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐░\n" +
                         " ░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌░\n" +
                         " ░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐░░\n" +
                         " ░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌░░\n" +
                         " ░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀░░░ CONGRATULATIONS!\n" +
                         " ░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀░░░░░ YOU HAVE WON!\n" +
                         " ░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀░░░░░░░░ SCORE: ");
        System.out.printf("%.2f\n\n", score);
        System.exit(0);
    }

    /**
     * Prints the game over message to standard output.
     */
    public void printLoss() {

        System.out.println(" Oh no... You revealed a mine!\n" +
                           "  __ _  __ _ _ __ ___   ___    _____   _____ _ __\n" +
                           " / _` |/ _` | '_ ` _ \\ / _ \\  / _ \\ \\ / / _ \\ '__|\n" +
                           "| (_| | (_| | | | | | |  __/ | (_) \\ V /  __/ |\n" +
                           " \\__, |\\__,_|_| |_| |_|\\___|  \\___/ \\_/ \\___|_|\n" +
                           " |___/\n");
        System.exit(0);
    }

    /**
     * Provides the main game loop by calling other methods.
     */
    public void play() {
        printWelcome();
        instantiateMineGrid();
        do {
            try {
                printMineField();
                promptUser();
                if (fog == true) {
                    removeFog();
                } //if
                inputString = new Scanner(userInput);
                String input = inputString.next();
                if (input.equals("") || input == null) {
                    System.out.println("Input Error: Command not recognized!\n");
                } else if (input.equals("help") || input.equals("h")) {
                    helpCommand();
                } else if (input.equals("quit") || input.equals("q")) {
                    quitCommand();
                } else if (input.equals("m") || input.equals("mark")) {
                    markCommand(inputString.nextInt(), inputString.nextInt());
                } else if (input.equals("r") || input.equals("reveal")) {
                    revealCommand(inputString.nextInt(), inputString.nextInt());
                } else if (input.equals("guess") || input.equals("g")) {
                    guessCommand(inputString.nextInt(), inputString.nextInt());
                } else if (input.equals("nofog")) {
                    nofogCommand();
                    fog = true;
                } else {
                    System.out.println("Input Error: Command not recognized!\n");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Input Error: Command not recognized!\n");
            }
            if (isWon()) {
                printWin();
            } else if (isLost()) {
                printLoss();
            } //else if

        } while (userInput != "quit" || userInput != "q");
    }

    /**
     * Removes the fog from the mine grid.
     */
    private void removeFog() {
        for (int i = 0; i < mineGrid.length; i++) {
            for (int i2 = 0; i2 < mineGrid[i].length; i2++) {
                if (mineGrid[i][i2] == true) {
                    fieldStatus[i][i2] = fieldStatus[i][i2].replaceAll("<", " ");
                    fieldStatus[i][i2] = fieldStatus[i][i2].replaceAll(">", " ");
                } //if
            } //inner for
        } //outer for
    } //removeFog

    /**
     * Called when the user inputs {@codequit} or {@codeq}. Used to quit the game.
     */
    private void quitCommand() {
        if (inputString.hasNext()) {
            System.out.println("Input Error: Command not recognized!\n");
        } else {
            System.out.println("Quitting the game...\nBye! \n");
            System.exit(0);
        }
    }

    /**
     * Called when the user inputs h or help.
     */
    private void helpCommand() {
        if (inputString.hasNext()) {
            System.out.println("Input Error: Command not recognized!\n");
        } else {
            System.out.println("Commands Available...\n - Reveal: r/reveal row col" +
                               "\n -   Mark: m/mark   row col\n -  Guess: g/guess  row col\n " +
                               "-   Help: h/help" +
                               "\n -   Quit: q/quit\n");
            round++;
        } //else
    } //helpCommand

    /**
     * Called when user inputs {@codemark # #} to mark a square.
     * @param row the row number of the command
     * @param col the column number of the command
     */
    private void markCommand(int row, int col) {
        if (inputString.hasNext() || !isInBounds(row, col)) {
            System.out.println("Input Error: Command not recognized!\n");
        } else {

            int spaceNum = spaces.length() / 2;

            fieldStatus[row][col] = spaces.substring(0, spaceNum) + "F" +
                spaces.substring(spaceNum + 1);
            round++;
        }
    } //markCommand

    /**
     * Called when the user inputs {@codereveal} or {@coder}.
     * @param row the row number of the command
     * @param col the column number of the command
     */
    private void revealCommand(int row, int col) {
        if (inputString.hasNext() || !isInBounds(row, col)) {
            System.out.println("Input Error: Command not recognized!\n");
        } else if (mineGrid[row][col]) {
            this.lost = true;
        } else {

            int spaceNum = spaces.length() / 2;

            fieldStatus[row][col] = spaces.substring(0, spaceNum) + getNumAdjMines(row, col) +
                spaces.substring(spaceNum + 1);
            round++;
        }
    }

    /**
     * Called when the user inputs {@codeguess} or {@codeg}.
     * @param row the row number of the command
     * @param col the column number of the command
     */
    private void guessCommand(int row, int col) {
        if (inputString.hasNext() || !isInBounds(row, col)) {
            System.out.println("Input Error: Command not recognized!\n");
        } else {

            int spaceNum = spaces.length() / 2;

            fieldStatus[row][col] = spaces.substring(0, spaceNum) + "?" +
                spaces.substring(spaceNum + 1);
            round++;
        }
    } //guessCommand

    /**
     * Called when the user inputs {@codenofog}.
     */
    private void nofogCommand() {
        if (inputString.hasNext()) {
            System.out.println("Input Error: Command not recognized!\n");
        } else {
            int spaceNum = spaces.length() / 4;

            for (int i = 0; i < fieldStatus.length; i++) {
                for (int i2 = 0; i2 < fieldStatus[i].length; i2++) {
                    if (mineGrid[i][i2] && fieldStatus[i][i2].length() != 3) {
                        fieldStatus[i][i2] =  "<" + fieldStatus[i][i2].substring(spaceNum + 2)
                            + fieldStatus[i][i2].charAt(spaceNum + 1) + ">";
                    } else if (mineGrid[i][i2]) {
                        fieldStatus[i][i2] = "<" + fieldStatus[i][i2].charAt(spaceNum + 1) + ">";
                    } //else if
                } //inner for
            } //for
            round++;
        } //else
    } //nofogCommand

    /**
     * Returns the number of mines adjacent to the specified
     * square in the grid.
     *
     * @param row the row index of the square
     * @param col the column index of the square
     * @return the number of adjacent mines
     */
    private int getNumAdjMines(int row, int col) {
        int numAdjMines = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int i2 = col - 1; i2 <= col + 1; i2++) {
                if (isInBounds(i, i2) && mineGrid[i][i2]) {
                    numAdjMines++;
                }
            }
        }
        return numAdjMines;
    }

    /**
     * Indicates whether or not the square is in the game grid.
     *
     * @param row the row index of the square
     * @param col the column index of the square
     * @return true if the square is in the game grid; false otherwise
     */
    private boolean isInBounds(int row, int col) {
        if ((row <= rowNum - 1 && row >= 0) && (col <= colNum - 1 && col >= 0)) {
            return true;
        } else {
            return false;
        }
    } //isInBounds
} //MinesweeperGame
