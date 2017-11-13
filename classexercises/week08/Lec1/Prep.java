
/**
 * Write a description of class Prep here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prep
{
    
    public static int smallest(int index, int[] a, int numberUsed)
    {
        int minValue = a[index];
        for (int i = index; i < numberUsed; i++)
        {
            if (a[i] < minValue)
            {
                minValue = a[i];
            }
        }
        return minValue;
    }
    
    public static int indexOfSmallest(int index, int[] a, int numberUsed)
    {
        int minIndex = index;
        int minValue = a[index];
        for (int i = index; i < numberUsed; i++)
        {
            if (a[i] < minValue)
            {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void indexTest()
    {
        int[] sample = { 7, 2, 3, 5, 1, 10, 90, 1, 2, 3 };
        int n = indexOfSmallest(0, sample, 10);
        System.out.println("Smallest at index " +
                            n + " is " +
                            sample[n]);
    }
}
