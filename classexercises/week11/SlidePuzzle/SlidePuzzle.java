
/**
 * Write a description of class SlidePuzzle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class SlidePuzzle
{
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

    public static void shuffle2D(int arr[][])
    {

    }

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
        shuffle2D(slide);
        for (int i = 0; i < slide.length; i++)
        {
            System.out.println(slide[i][0] + " " + 
                slide[i][1] + " " +
                slide[i][2]);
        }
    }
}
