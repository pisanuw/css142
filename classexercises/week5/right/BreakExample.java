
/**
 * Write a description of class BreakExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BreakExample
{
    public static void breakTest()
    {
        System.out.println("Before Loop");
        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
        System.out.println("After loop");
    }
}
