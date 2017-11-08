
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
public class Person
{
    int age;
    String name;
    
    public static String makeUpName()
    {
        String s = "";
        for (int i = 0; i < 5; i++)
            s = s + getRandomLetter();
        return s;
    }
    public static char getRandomLetter()
    {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        // 
        char d = (char) ((Math.random() * 26) + (int)'a');
        return c;
    }
    
    public String toString()
    {
        //return "<P: " + name + " " + age + ">";
        return "<P: " + name + ">";
        //return "<Al>";
    }
}
