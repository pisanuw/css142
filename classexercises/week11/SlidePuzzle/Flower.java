
/**
 * Write a description of class Flower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flower
{
    private String name;
    private double price;
    
    Flower(String name)
    {
        this.name = name;
        price = 10.0;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }
    
        public void setPrice(double newPrice)
    {
        price = newPrice;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        return "<F: " + name + ", " + price + ">";
    }
}
