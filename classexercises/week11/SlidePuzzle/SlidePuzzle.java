
/**
 * Write a description of class SlidePuzzle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SlidePuzzle
{
    public static void shuffle(int arr[])
    {
        // shuffle the numbers
    }
    
    public static void testShuffle()
    {
        int board[] = { 1, 2, 3, 4, 5, 6, 7, 8};
        shuffle(board);
        for (int i = 0; i < board.length; i++)
            System.out.print(board[i] + " ");
        System.out.println();
    }
}
