
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class TicTacToe
{
    public static void resetBoard(char[][] board)
    {
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                board[row][col] = ' ';
            }
        }
    }

    public static void displayBoard(char[][] board)
    {
        for (int row = 0; row < board.length; row++)
        {
            System.out.println(board[row][0] + "|" + board[row][1] + "|" + board[row][2]);
        }
    }
    
    public static int getUserInputWithPromptRecursive(String msg)
    {
        System.out.print(msg);
        Scanner keyb = new Scanner(System.in);
        int value = keyb.nextInt();
        if (value > 2 || value < 0)
        {
            System.out.println("Bad input, try again!");
            return getUserInputWithPrompt(msg);
        }
        else
        {
            return value;
        }
    }
    
    public static int getUserInputWithPrompt(String msg)
    {
        System.out.print(msg);
        Scanner keyb = new Scanner(System.in);
        int value = keyb.nextInt();
        while (value > 2 || value < 0)
        {
            System.out.println("Bad input in while, try again!");
            System.out.print(msg);
            value = keyb.nextInt();
        }
        return value;
    }
    
    public static void play(char[][] board, int row, int col, char mark)
    {
        board[row][col] = mark;
    }
    public static void playTicTacToe()
    {
        char[][] board = new char[3][3];
        System.out.println("Welcome to TicTacToe");
        resetBoard(board);
        board[1][1] = 'X';
        for (int count = 0; count < 9; count++)
        {
            displayBoard(board);
            int row = getUserInputWithPrompt("Enter row number (0-2):" );
            int col = getUserInputWithPrompt("Enter column number (0-2):" );
            play(board, row, col, 'X');
        }

    }
}
