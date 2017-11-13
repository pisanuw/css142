
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;

public class Person
{
    String name;
    int luckyNumber;

    Person()
    {
    }

    Person(String givenName, int givenNumber)
    {
        name = givenName;
        luckyNumber = givenNumber;
    }

    void setName(String someName)
    {
        name = someName;
    }

    void setLuckyNumber(int num)
    {
        luckyNumber = num;
    }

    public String toString()
    {
        return "<" + name + " " + luckyNumber + ">";
    }

    public static Person[] readPeople(String filename)
    {
        Person[] crowd = new Person[10];
        Scanner inputStream = null;

        try
        {
            inputStream = new Scanner(
                new FileInputStream(filename));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file.");
            System.exit(0);
        }
        int i = 0;
        while (inputStream.hasNextLine())
        {
            String someName = inputStream.next( );
            int number = inputStream.nextInt( );
            Person p = new Person(someName, number);
            crowd[i] = p;
            i++;
            System.out.println("Read : " + p);
        }

        inputStream.close();
        return crowd;
    }

    public static void lucky(Person[] personArr, int winningNumber)
    {
        for (int i = 0; i < personArr.length; i++)
        {
            Person p = personArr[i];
            if (p != null && p.luckyNumber == winningNumber)
                System.out.println("The winner is " + p.name);
        }        
    }
    
    public static void testPerson()
    {
        Person p = new Person("Cris", 7);
        System.out.println(p);
        Person q = new Person("Jo", 5);
        System.out.println(q);
        q.setLuckyNumber(12);
        System.out.println(q);

        Person[] lotteryPeople = readPeople("people.txt");
        for (Person z: lotteryPeople)
            System.out.println(z);
        lucky(lotteryPeople, 666);
    }
}
