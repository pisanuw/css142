
/**
 * Write a description of class Alien here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alien
{
    int heads;
    int eyes;
    int legs;
    String color;
    String languageQuirk;
    
    public static String fromPlanet = "Zork";

    Alien()
    {
    }

    Alien (int newEyes, int newHeads, int newLegs)
    {
        eyes = newEyes;
        heads = newHeads;
        legs = newLegs;
        color = "purple";
    }
    
    public static void alienPropaganda()
    {
        System.out.println("We are friendly aliens from " + fromPlanet);
    }
    
    void say(String message)
    {
        String[] msg = message.split(" ");
        for (int i = 0; i < msg.length; i++)
        {
            System.out.print(msg[i] + " " + languageQuirk + " ");
        }
        System.out.println();
    }
    void setColor(String newColor)
    {
        color = newColor;
    }

    void describe()
    {
        System.out.printf("%d heads, %d eyes, %d legs, %s color\n", 
            heads, eyes, legs, color);
    }
}
