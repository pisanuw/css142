
/**
 * Write a description of class AlienTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AlienTester
{
    public static void main(String[] args)
    {
        Alien spot = new Alien();
        spot.describe();
        spot.eyes = 200;
        spot.heads = 3;
        spot.legs = 2;
        spot.setColor("Blue");
        System.out.println("Describing spot");
        spot.describe();
        
        Alien max = new Alien();
        max.eyes = 1000000;
        max.heads = 21;
        max.legs = 1;
        max.setColor("Purple");
        System.out.println("Describing max");
        max.describe();
       
        Alien crowd[] = new Alien[10];
        for (int i = 0; i < 10; i++)
        {
            Alien temp = new Alien();
            temp.eyes = (int) (Math.random() * 100);
            temp.heads = (int) (Math.random() * 10);
            temp.legs = (int) (Math.random() * 8);
            crowd[i] = temp;
        }
        System.out.println("Describing crowd");
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Alien at index " + i + " ");
            crowd[i].describe();
        }
        
    }
}
