
/**
 * Write a description of class SlidePuzzle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.Scanner;
public class SlidePuzzle
{
    int blankRow;
    int blankCol;
    int board[][] = { { 1, 2, 3}, 
            {4, 5, 6} , 
            {7, 8, 0} };

    SlidePuzzle()
    {
        shuffle2D(board);
        setBlankRowCol();
    }

    public void setBlankRowCol()
    {
        for (int row = 0; row < board.length; row++)
            for (int col = 0; col < board[row].length; col++)
            {
                if (board[row][col] == 0)
                {
                    blankRow = row;
                    blankCol = col;
                    return;
                }
            }
    }

    void play()
    {
        Scanner keyb = new Scanner(System.in);
        while(true)
        {
            System.out.println("0 up, 1, down, 2 right, 3 left");
            int input = keyb.nextInt();
            // call movemement function
        }
    }
    /*
    public static void shuffle(int arr[])
    {
    // shuffle the numbers
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++)
    {
    int randomIndex = rand.nextInt(arr.length);
    // System.out.println("Value at " + randomIndex + " is " + arr[randomIndex]);
    // System.out.println("Swapping it with index " + i + " with value " + arr[i]);
    int savedValue = arr[i];
    arr[i] = arr[randomIndex];
    arr[randomIndex] = savedValue;
    }
    }
     */

    public void shuffle2D(int arr[][])
    {
        Random rand = new Random();
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
            {
                int randomRow = rand.nextInt(arr.length);
                int randomCol = rand.nextInt(arr[row].length);
                int savedValue = arr[row][col];
                arr[row][col] = arr[randomRow][randomCol];
                arr[randomRow][randomCol] = savedValue;
            }
    }

    /*
    public static void testShuffle()
    {
    int board[] = { 10, 20, 30, 40, 50, 60, 70, 80};
    shuffle(board);
    for (int i = 0; i < board.length; i++)
    System.out.print(board[i] + " ");
    System.out.println();
    int slide[][] = { { 1, 2, 3}, 
    {4, 5, 6} , 
    {7, 8, 0} };
    //shuffle2D(slide);
    for (int i = 0; i < 3; i++)
    {
    System.out.println(slide[i][0] + " " + 
    slide[i][1] + " " +
    slide[i][2]);
    }
    }
     */
    public void display()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(board[i][0] + " " + 
                board[i][1] + " " +
                board[i][2]);
        }
    }
    
    public static void testSlidePuzzle()
    {
        SlidePuzzle s = new SlidePuzzle();
        s.display();
    }
}
