
/**
 * Write a description of class StarterClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StarterClass
{
    public static boolean isOdd(int n)
    {
        return n % 2 == 1;
    }

    public static void oddNumbersUptoN(int n)
    {
        for (int i = 1; i < n; i++)
        {
            if (isOdd(i))
                System.out.println(i);
        }
    }

    public static int sumOfoddNumbersUptoN(int n)
    {
        int total = 0;
        for (int i = 1; i < n; i++)
        {
            if (isOdd(i))
                total = total + i;
        }
        return total;
    }

    public static void main(String[] args)
    {
        //oddNumbersUptoN(15);
        int theSum = sumOfoddNumbersUptoN(10);
        System.out.println(theSum);
        System.out.println("Done!");
    }
}
