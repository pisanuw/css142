
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
