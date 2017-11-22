
/**
 * Write a description of class Bag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bag
{
    private String[] items;
    private int numberUsed;

    public Bag()
    {
        items = new String[100];
        numberUsed = 0;
    }

    public String getLastElement()
    {
        return items[numberUsed-1];
    }
    public void add(String newItem)
    {
        items[numberUsed] = newItem;
        numberUsed++;
    }
    
    // return true if successfully deleted
    public boolean deleteLast()
    {
        if (numberUsed == 0)
            return false;
        numberUsed--;
        items[numberUsed] = null;
        return true;
    }
    public static void bagTester()
    {
        Bag b = new Bag();
        System.out.println(b);
        b.add("money");
        b.add("paper");
        b.add("pen");
        System.out.println(b);
        System.out.println("Does bag contain paper? " + b.contains("paper"));
        System.out.println("Does bag contain shoes? " + b.contains("shoes"));

        System.out.println("Last item added was " + 
        b.getLastElement());
        System.out.println(b);
        System.out.println("Deleting last item");
        b.deleteLast();
        
        System.out.println(b);
        Bag shinyBag = b.copyBag();
        System.out.println(shinyBag);
    }

    public boolean contains(String name)
    {
        for (int i = 0; i < numberUsed; i++)
        {
            if(items[i].equals(name))
                return true;
        }
        return false;
    }
    
    public Bag copyBag()
    {
        Bag b = new Bag();
        b.items = items.clone();
        b.numberUsed = numberUsed;
        return b;
    }
    public String toString() {
        String out = "<Bag: [ ";
        for (int i = 0; i < numberUsed; i++)
            out = out + items[i] + " ";
        out = out + "] >";
        return out;
    }

}
