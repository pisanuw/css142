
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static boolean isPalindromeArray(int[] arr)
    {
        int back = arr.length - 1;
        for (int front = 0; front < arr.length / 2; front++)
        {
            // could have also written
            // int back = arr.length - front - 1;
            if (arr[front] != arr[back])
                return false;
            back--;
        }
        // everything matched
        return true;
    }
    public static void multiplyArr(int[] arr, int multiplier)
    {
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * multiplier;
    }

    public static int maxNumber(int[] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void arrayTester()
    {
        int[] array1 = { 2, 3, 4};
        int array2[] = { 5, 6, 7};  //preferred way
        int array3[] = new int[3];
        array3[0] = 10;
        array3[1] = 3;
        array3[2] = 5;

        int maxValue = maxNumber(array1);
        System.out.println("Max is " + maxValue);

        multiplyArr(array1, 100);
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] + " ");
            
        int array4[] = { 1, 5, 5, 1};
        if (isPalindromeArray(array4))
            System.out.println("Test1: Is palindrome");
        array4[0] = 77;
        if (isPalindromeArray(array4))
            System.out.println("Test2: Is palindrome");
    }

}
