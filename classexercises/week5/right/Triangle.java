
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
    public static boolean isRightTriangle(int sideA, int sideB, int sideC)
    {
        return ((sideA * sideA) + (sideB * sideB) == (sideC * sideC));
    }

    public static void triangleCounter()
    {
        int counter = 0;
        for (int a = 1; a < 100; a++)
        {
            for (int b = 1; b < 100; b++)
            {
                for (int c = 1; c < 100; c++)
                {
                    if (isRightTriangle(a, b, c))
                    {
                        counter++;
                        // System.out.printf("a=%d b=%d c=%d\n", a, b, c);
                    }
                }
            }
        }
        System.out.println("Found this many triangles: " + counter);
    }
}
