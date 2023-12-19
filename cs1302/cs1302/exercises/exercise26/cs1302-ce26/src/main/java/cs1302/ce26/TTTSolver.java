package cs1302.ce26;

import java.util.Scanner;

/**
 * A Tic-Tac-Toe Solver class.
 */
public class TTTSolver {

    /**
     * The entry point for the program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an initial board state " +
                           "using 9 consecutive characters. Valid "  +
                           "characters are X, O, and -.");
        String board = promptBoard(input);
        printAllBoards(board);
        System.out.println("Count winnning boards for X or O?");
        char player = input.next().charAt(0);
        System.out.println("Ways " + player + " can win: " + countAllWinningBoards(board, player));
        System.out.println("Is board a tie? " + TTTUtility.isCat(board));
    } // main

    /**
     * Prompt the user for a valid board configuration.
     * @param input an input scanner
     * @return the board configuration
     */
    public static String promptBoard(Scanner input) {
        String board = input.nextLine();
        while (!TTTUtility.validGame(board)) {
            System.out.println("Invalid board. Try again.");
            board = input.nextLine();
        } // while
        return board;
    } // promptBoard

    /**
     * Given an initial board state, this method prints
     * all board states that can be reached via valid
     * sequence of moves by each player. Therefore, the
     * printout includes both intermediate board states
     * as well as completed board states.
     *
     * @param board the game board
     */
    public static void printAllBoards(String board) {
        System.out.println(board);
        if (TTTUtility.isCat(board) || (TTTUtility.isWinner(board, 'X')
                                        || TTTUtility.isWinner(board, 'O'))) {
            return;
        }
        for (int i = 0; i < board.length(); i++) {
            if (board.charAt(i) == '-') {
                printAllBoards(board.substring(0, i) + TTTUtility.whoseTurn(board)
                               + board.substring(i + 1));
            } //if
        } //for
    } // printAllBoards

    /**
     * Returns the number of possible wins by player in board.
     * @param board board to check wins on
     * @param player player to check wins on
     * @return number of times player wins
     */
    public static int countAllWinningBoards(String board, char player) {
        int result = 0;
        char opp;
        if (player == 'X') {
            opp = 'O';
        } else {
            opp = 'X';
        } //if
        if (TTTUtility.isWinner(board, player)) {
            return 1;
        } //if
        if (TTTUtility.isCat(board) || TTTUtility.isWinner(board, opp)) {
            return 0;
        } //if
        for (int i = 0; i < board.length(); i++) {
            if (board.charAt(i) == '-') {

                result += countAllWinningBoards(board.substring(0, i)
                                                 + TTTUtility.whoseTurn(board) +
                                         board.substring(i + 1), player);
            } //if
        } //for
        return result;
    } //countAllWinnningBoards

} // TTTSolver
