
/**
 * Write a description of class CoffeeOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CoffeeOrder
{
    public static double getPrice(int coffeeType, int size)
    {
        if (coffeeType == 1)
        {
            if (size == 1)
                return 2.65;
            else
                return 2.95;
        }
        else if (coffeeType == 2)
            if (size == 1)
                return 3.35;
            else
                return 3.95;
        else
        {
            if (size == 1)
                return 3.85;
            else
                return 4.45;
        }
        // we should not get here
    }

    public static void getOrder()
    {
        System.out.println("Welcome to CoffeeOrder 3000");
        System.out.println("How many espresso drinks would you like today (0-3):");
        Scanner keyb = new Scanner(System.in);
        int howManyCoffees = keyb.nextInt();
        assert(howManyCoffees >=0  && howManyCoffees < 4);
        System.out.println("OK, so you do not want any espressos today!");
        System.out.println("Thank you for using CoffeeOrder 3000");
    }

    public static void main(String[] args)
    {
        getOrder();
    }
}
