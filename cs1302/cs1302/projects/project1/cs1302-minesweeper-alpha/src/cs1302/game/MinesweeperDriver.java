package cs1302.game;

import java.util.Random;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Driver class for the Minesweeper game project.
 */
public class MinesweeperDriver {
    public static void main(String[] args) {
        if (args[0].equals("--seed")) {
            MinesweeperGame game = new MinesweeperGame(args[1]);
            game.play();
        } else if (args[0].equals("--gen")) {
            /*try {
                int mineCount = 0;
                int count = 0;
                int rowNum = Integer.parseInt(args[2]);
                int colNum = Integer.parseInt(args[3]);
                String file = args[1];
                boolean[][] mineLocs = new boolean[rowNum][colNum];
                do {
                    Random random = new Random();
                    int xNum = random.nextInt(rowNum);
                    int yNum = random.nextInt(colNum);
                    if(!mineLocs[xNum][yNum]) {
                        mineLocs[xNum][yNum] = true;
                        mineCount++;
                    } //if

                } while (mineCount <= Integer.parseInt(args[4]));
                String contents = args[1] + " " + args[2] + " " + args[3] + " ";
                for(int i = 0; i < mineLocs.length; i++) {
                    for(int i2 = 0; i2 < mineLocs[i].length; i2++) {
                        if(mineLocs[i][i2]) {
                            contents += i + " " + i2 + " ";
                        } //if
                    } //inner for
                } //for
                PrintWriter seedFile = new PrintWriter(file, contents);
                System.out.println(seedFile);
                MinesweeperGame game = new MinesweeperGame(args[1]);
                game.play();
            } catch (FileNotFoundException e) {
                System.out.println("Seedfile Not Found Error: Cannot create game with " + args[1] +
                                   "," + " because it cannot be be found or cannot be read due to"
                                   + " permission.\n");
                System.exit(1);
            } catch (UnsupportedEncodingException u) {
             System.out.println("Seedfile Not Found Error: Cannot create game with " + args[1] +
                                 "," + " because it cannot be be found or cannot be read due to"
                                 + " permission.\n");
              System.exit(1);
            }
            */
            System.out.println("Seedfile generation not supported.");
            System.exit(2);
        } else {
            System.out.println("Unable to interpret supplied command-line arguments.");
            System.exit(1);
        } //else
    } //main
} //MinesweeperDriver
