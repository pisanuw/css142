
/**
 * Write a description of class FunnyDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class FunnyDice
{
    private static Random rand = new Random();
    int numberOfSides;
    int numbers[];

    FunnyDice(int numSides)
    {
        numberOfSides = numSides;
        numbers = new int[numberOfSides];
    }

    void setSide(int sideNumber, int sideValue)
    {
        numbers[sideNumber] = sideValue;
    }

    void setSide(int sideValues[])
    {
        for (int i = 0; i < sideValues.length; i++)
            numbers[i] = sideValues[i];
    }

    int roll()
    {
        int randomIndex = rand.nextInt(numberOfSides);
        return numbers[randomIndex];
    }

    public static void testFunnyDice()
    {
        FunnyDice f = new FunnyDice(5);
        f.setSide(0, 2);
        f.setSide(1, 7);
        f.setSide(2, 11);
        f.setSide(3, 15);
        f.setSide(4, -5);
        for (int i = 0; i < 20; i++)
        {
            int result = f.roll();
            System.out.println("Roll got " + result);
        }
        int newValues[] = {2, 4, 6, 8, 10};
        f.setSide(newValues);
        for (int i = 0; i < 20; i++)
        {
            int result = f.roll();
            System.out.println("Roll got " + result);
        }
    }
}
