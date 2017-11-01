
/**
 * Write a description of class Increase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Increase
{
    // BAD, does not do anything
    // as if we have said 
    // int number = 10;
    public static void increaseBy1(int number)
    {
        number = number + 1;
    }

    public static void increaseArrayBy1(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = numbers[i] + 1;
    }

    public static void testIt()
    {
        int x = 10;
        increaseBy1(x);
        System.out.println("x is " + x);
        int arr[] = { 1, 3, 5 };
        increaseArrayBy1(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
