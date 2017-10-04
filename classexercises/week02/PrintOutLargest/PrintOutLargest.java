
/**
 * Write a description of class PrintOutLargest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintOutLargest
{
    public static int largestOf3(int a, int b, int c)
    {
        if ((a >= b) && (a >= c))
            return a;
        else if (b >= c)
            return b;
        else
            return c;
    }

    public static void main()
    {
        int max = largestOf3(10, 5, 4);
        System.out.println("The largest number is: " + max);
        assert (  largestOf3(10, 5, 4) == 10 );
        assert (  largestOf3(10, 5, 5) == 10 );
        assert (  largestOf3(5, 5, 7) == 7 );
    }
}
