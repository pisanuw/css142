
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
    
    public static void swapSmallestLargest(int[] arr)
    {
        int minIndex = 0;
        int minValue = arr[0];
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < minValue)
            {
                minValue = arr[i];
                minIndex = i;
            }
             if (arr[i] > maxValue)
            {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        arr[minIndex] = maxValue;
        arr[maxIndex] = minValue;
        for (int i: arr)
            System.out.print(i + " ");
    }

    public static void largest2(int[] arr)
    {
        int largest = arr[0];
        int largest2 = arr[1];
        // need to swap them if largest < largest2
        if (largest2 > largest)
        {
            largest2 = arr[0];
            largest = arr[1];
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                largest2 = largest;
                largest = arr[i];
            }
            else if (arr[i] > largest2)
            {
                largest2 = arr[i];
            }
            else
            {
                // too small
            }
        }
        System.out.println("Largest " + largest + " and second " + largest2);
    }
    public static void arrayWithoutSmallest(int[] arr)
    {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < minValue)
                minValue = arr[i];
        }
        // have minValue;
        int[] shortArr = new int[arr.length - 1];
        boolean haveSkipped = false;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == minValue && ! haveSkipped)
            {
                haveSkipped = true;
                continue;
            }
            if (! haveSkipped)
            {
                shortArr[i] = arr[i];
            }
            else
            {
                shortArr[i-1] = arr[i];
            }
        }
        for (int i: shortArr)
            System.out.print(i + " ");
        System.out.println();
    }
    
    public static void arrayWithoutSmallestversion2(int[] arr)
    {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < minValue)
                minValue = arr[i];
        }
        // have minValue;
        int[] shortArr = new int[arr.length - 1];
        int shortIndex = 0;
        boolean haveSkipped = false;
        for (int index = 0; index < arr.length; index++)
        {
            if (arr[index] != minValue)
            {
                // not minimum, just copy
                shortArr[shortIndex] = arr[index];
                shortIndex++;
            }
            else
            {
                // we are looking at minvalue
                if (haveSkipped)
                {
                    // already skipped, keep copying
                    shortArr[shortIndex] = arr[index];
                    shortIndex++;
                }
                else
                {
                    // time to skip
                    // not increasing shortIndex
                    haveSkipped = true;
                }
            }
        }
        for (int i: shortArr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void indexTest()
    {
        int[] sample = { 7, 2, 3, 5, 1, 10, 90, 1, 2, 3 };
        int n = indexOfSmallest(0, sample, 10);
        System.out.println("Smallest at index " +
            n + " is " +
            sample[n]);
            
        System.out.println("Test arrayWithoutSmallest class version");
        arrayWithoutSmallest(sample);
        System.out.println("Test arrayWithoutSmallest after class version");
        arrayWithoutSmallestversion2(sample);
        
        largest2(sample);
        System.out.println("Test swap");
        int[] sample2 = { 10, 2, 3, 4, 5};
        swapSmallestLargest(sample2);
    }
}
