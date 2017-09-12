
/**
 * Write a description of class brokenTypes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class brokenTypes
{
    public static MISSING add2(MISSING a, MISSING b)
    {
        MISSING sum = a + b;
        return sum;
    }
    
    public static MISSING getVelocity(MISSING speed, MISSING time)
    {
        MISSING velocity = speed / time;
        return velocity;
    }
    
    public static MISSING whatDoesItStartWith(MISSING word)
    {
        MISSING s = word.charAt(0);
        return s;
    }
    
    public static MISSING exclamationFinder(MISSING word)
    {
        MISSING loc = word.indexOf("!");
        return loc;
    }
       
    public static MISSING isRaining()
    {
        // we assume it is always raining and we are wet
        MISSING isWet = true;
        return isWet;
    }
    
    
    public static void main(MISSING[] args)
    {
        MISSING x = add2(20, 30);
        assert(x == 50);
        MISSING v = getVelocity(65.0, 90.0);
        assert(v < 1.0d);
        assert(v > 0.0d);
        MISSING areWeWet = isRaining();
        assert(areWeWet);
        assert(whatDoesItStartWith("Java Rocks!") == 'J');
        assert(exclamationFinder("Java Rocks!") == 10);
        System.out.println("If we got here, all is well!");
    }
}
