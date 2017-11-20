
/**
 * Write a description of class SingleDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class SingleDice
{
    static Random rand = new Random();
    private int sides;
    private int totalRolls;
    private int total;
    
    
    SingleDice(int numberOfSides)
    {
        sides = numberOfSides;
        totalRolls = 0;
        total = 0;
    }
    
    int roll()
    {
        int result = rand.nextInt(sides) + 1;
        totalRolls++;
        total = total + result;
        return result;
    }
    
    double average()
    {
        return total / (double)totalRolls;
    }
}
