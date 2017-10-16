
/**
 * Write a description of class TestVariables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestVariables
{
    public static void tooHighOrNot()
    {
        System.out.print("Enter a number(0-10): ");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        if (n < 0)
        {
            System.out.print(n);
            System.out.println(" is too low. I expected a number between 0 and 10");
        }
        else if (n > 10)
        {
            System.out.print(n);
            System.out.println(" is too high. I expected a number between 0 and 10");
        }
        else
        {
            System.out.print(n);
            System.out.println(" is just right!");
        }

    }

    public static void testIf()
    {
        int x = 10;
        int y = 20;
        if (x > 0 && y > 0)
        {
            System.out.println("x is greater than 0");
        }
        else
        {
            System.out.println("x is less than 0");
        }
    }

    public static void testScanner()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give me an int: ");
        int x = keyboard.nextInt();
        System.out.print("Give me a double: ");
        double y = keyboard.nextDouble();
        System.out.printf("x is %d \n", x);
        System.out.printf("y is %f \n", y);
    }

    public static void testIncrement()
    {
        int x = 10;
        int y = ++x;
        System.out.printf("x is %d \n", x);
        System.out.printf("y is %d \n", y);
    }

    public static void testFunction()
    {
        int x = 10;
        System.out.println("Hello World");
        System.out.printf("x is %d \n", x);
    }

    public static void main(String[] args)
    {
        tooHighOrNot();
    }
}
