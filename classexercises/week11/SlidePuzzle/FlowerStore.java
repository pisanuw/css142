
/**
 * Write a description of class FlowerStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class FlowerStore
{
    private static int MAX_FLOWERS = 100;

    private String name;
    private Flower flowers[];
    private int numberOfFlowers;

    FlowerStore()
    {
        System.out.println("New FlowerStore is being created NO name");
        name = "";
        flowers = new Flower[MAX_FLOWERS];
        numberOfFlowers = 0;
    }

    FlowerStore(String name)
    {
        System.out.println("New FlowerStore is being created with name");
        this.name = name;
        flowers = new Flower[MAX_FLOWERS];
        numberOfFlowers = 0;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void show()
    {
        System.out.println("We have " + numberOfFlowers + " flowers");
        for (int i = 0; i < numberOfFlowers; i++)
            System.out.println(flowers[i]);
    }

    public String toString()
    {
        return "<FS: " + name + ">";
    }

    public void add(Flower f)
    {
        flowers[numberOfFlowers] = f;
        numberOfFlowers++;
    }

    public void delete(Flower f)
    {
        // shift array down
        for (int i = 0; i < numberOfFlowers; i++)
        {
            Flower curr = flowers[i];
            if (f == curr)
            {
                for (int j = i; j < numberOfFlowers; j++)
                    flowers[j] = flowers[j+1];
                numberOfFlowers--;
            }
        }
    }

    public void addToAllFlowerNames(String extension)
    {
        for (int i = 0; i < numberOfFlowers; i++)
        {
            Flower f = flowers[i];
            f.setName(f.getName() + "-" + extension);
        }
    }

    public void changePrice(double percentage)
    {
        for (int i = 0; i < numberOfFlowers; i++)
        {
            Flower f = flowers[i];
            f.setPrice(f.getPrice() * percentage);
        }
    }

    public Flower getFlower(String s)
    {
        for (int i = 0; i < numberOfFlowers; i++)
        {
            Flower f = flowers[i];
            if (f.getName().equals(s))
                return f;
        }
        return null;
    }

    public static void testFlowersFromFile()
    {
        String filename = "flowers.txt";
        Scanner input = null;
        FlowerStore flowerstore = new FlowerStore("Paul's Store");
        try 
        {
            input = new Scanner(new FileInputStream(filename));
            while (input.hasNext())
            {
                System.out.println("Staring to read");
                String str = input.nextLine();
                System.out.println("Name read as " + str);
                double price = input.nextDouble();
                System.out.println("Price read as " + price);
                input.nextLine();
                Flower f = new Flower(str);
                f.setPrice(price);
                flowerstore.add(f);

            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Got an exception reading " + filename);
        }
        input.close();
        flowerstore.show();
    }

    public static void testFlowerStore()
    {
        FlowerStore fs = new FlowerStore();
        System.out.println(fs);
        fs.show();
        FlowerStore fs2 = new FlowerStore("UWB Garden");
        System.out.println(fs2);
        fs2.show();
        // add a flower
        Flower flower1 = new Flower("yellow");
        fs2.add(flower1);
        fs2.show();
        flower1.setName("blue");
        fs2.show();
        fs2.addToAllFlowerNames("pretty");
        fs2.show();
        fs2.changePrice(1.20);
        fs2.show();
        fs2.add(new Flower("red"));
        fs2.show();
        Flower redF = fs2.getFlower("red");
        if (redF != null)
        {
            redF.setPrice(1000.0);
        }
        fs2.show();
    }

    public static void testFlowerDelete()
    {
        FlowerStore fs = new FlowerStore();
        fs.add(new Flower("red"));
        fs.add(new Flower("yellow"));
        fs.add(new Flower("blue"));
        fs.add(new Flower("green"));
        fs.show();
        Flower f = fs.getFlower("yellow");
        fs.delete(f);
        fs.show();
    }
}
