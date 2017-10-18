
/**
 * Write a description of class PlusMinusExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlusMinusExample
{
    public static void plusMinusPattern(int characters)
    {
        for (int i = 1; i <= characters; i++)
        {
            if (i % 2 == 1)
                System.out.print("-");
            else
                System.out.print("+");
        }
    }
    
    public static void plusMinusTree(int height, int width)
    {
        for (int i = 0; i < height; i++)
        {
            plusMinusPattern(width);
            System.out.println();
        }
    }
}
