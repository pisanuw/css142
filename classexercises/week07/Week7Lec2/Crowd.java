
/**
 * Write a description of class Crowd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Crowd
{
    public static void createCrowd()
    { 
        Person[] people = new Person[10];
        System.out.println("A good name is: " + Person.makeUpName());
        for (int i = 0; i < 10; i++)
        {
            Person p = new Person();
            p.age = (int)(Math.random() * 81) + 10;
            p.name = p.makeUpName();
            // string representation for printing
            String str = p.toString();
            people[i] = p;
            System.out.println(people[i]);
        }
    }
}
