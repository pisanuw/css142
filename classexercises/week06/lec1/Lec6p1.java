
/**
 * Write a description of class Lec6p1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lec6p1
{
    public static void arrayTest()
    {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19 };
        for (int i = 0; i < primes.length; i++)
        {
            System.out.println("Prime at index " + i + " is " + primes[i]);
        }
        //System.out.println("Prime at index 20 is " + primes[20]);
    }
    public static void fileReadTest()
    {
        Scanner inputStream = null;
        try
        {
            inputStream = new Scanner(
                new FileInputStream("Lec6p1.java"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening the file Lec6p1.java");
            System.exit(0);
        }
        System.out.println("Reading from file.");
        String line;
        int count = 1;

        try
        {
            int number = inputStream.nextInt();
            System.out.println("Found it: " + number);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Could not find int in Lec6p1.java");
            System.exit(0);
        }
        while (inputStream.hasNextLine())
        {
            line = inputStream.nextLine( );
            System.out.println(count + " " + line);
            count++;
        }
        inputStream.close();
    }

    public static void fileWriteTest()
    {
        try
        {
            PrintWriter outputStream = 
                new PrintWriter(new FileOutputStream("stuff.txt", true));
            outputStream.println("Hello World!");
            for (int i = 0; i < 10; i++)
                outputStream.println(i + ": Hello World!");
            outputStream.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not write to stuff.txt");
        }
    }

    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }
}
