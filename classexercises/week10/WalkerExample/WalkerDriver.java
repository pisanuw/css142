
/**
 * Write a description of class WalkerDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WalkerDriver
{
    public static void testWalker()
    {
        Walker w = new Walker('X');
        w.setWaitTime(100);
        w.moveDown(20);
        w.moveRight(20);
        
        Walker friend = new Walker('Y');
        friend.setWaitTime(100);
        friend.moveDown(10);
        friend.moveRight(30);
        
        //w.moveDown(15);
        
        /*
        while(true)
        {
            int distance = 5;
            int direction = (int) (Math.random() * 4);
            switch (direction)
            {
                case 0: w.moveUp(distance); break;
                case 1: w.moveDown(distance); break;
                case 2: w.moveRight(distance); break;
                case 3: w.moveLeft(distance); break;
                default:
                System.out.println("Unexpected direction!");
                System.exit(-1);
            }
        }
        */

    }
}
