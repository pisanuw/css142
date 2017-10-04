
/**
 * Write a description of class Coins here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coins
{
    public static int countCoins(int sack)
    {
        
        int totalCoins = sack / 25;
        sack = sack - ((sack / 25) * 25);
        
        totalCoins = totalCoins + (sack / 10);
        sack = sack - ((sack / 10) * 10);
        
        totalCoins = totalCoins + (sack / 5);
        sack = sack - ((sack / 5) * 5);
        
        totalCoins = totalCoins + sack;
        return totalCoins;
    }
    
    public static void main ()
    {;
        assert( countCoins(25) == 1 );
        assert( countCoins(35) == 2 );
        assert( countCoins(45) == 3 );  
        assert( countCoins(115) == 6 );   
        System.out.println("All is good!");
        System.out.print("5 + 2 * 3 + 4 * 7 - 3 * 6 - 8 * -5  = ");
        System.out.println(5 + 2 * 3 + 4 * 7 - 3 * 6 - 8 * -5);
    }
    
}
