
/**
 * Write a description of class DiceTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiceTester
{

    public static void diceTester()
    {
        SingleDice s = new SingleDice(12);
        SingleDice s2 = new SingleDice(12);
        for (int i = 0; i < 10000; i++)
        {
            // System.out.println("Got: " + s.roll() + ", " + s2.roll());
            s.roll();
            s2.roll();
        }
        System.out.println("Average is: " + s.average());
        System.out.println("Average is: " + s2.average());
        
        System.out.println("Creating Double dice");
        DoubleDice d = new DoubleDice(6);
        for (int i = 0; i < 100; i++)
        {
            d.roll();
        }
        d.displayStats();
        
    }
}
