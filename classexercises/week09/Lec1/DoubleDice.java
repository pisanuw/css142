
/**
 * Write a description of class DoubleDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleDice
{
    private SingleDice red;
    private SingleDice blue;
    private int sides;
    private int stats[];
    
    DoubleDice(int numberOfSides)
    {
        sides = numberOfSides;
        red = new SingleDice(sides);
        blue = new SingleDice(sides);
        stats = new int[sides * 2 + 1];
    }
    
    int roll()
    {
        int result = red.roll() + blue.roll();
        stats[result]++;
        return result;
    }
    
    private void printStars(int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print("*");
    }
    void displayStats()
    {
        for (int i = 2; i <= sides*2; i++)
        {
            System.out.print(i + ": ");
            // System.out.println(stats[i]);
            printStars(stats[i]);
            System.out.println();
        }
    }
}
