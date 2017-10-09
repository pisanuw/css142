
/**
 * Write a description of class WhileLopp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class WhileLoop
{
    public static int sumToN(int n)
    {
        int total = 0;
        for (int i = 1; i <= n; i++)
        {
            System.out.printf("Before addition i is %d, total is %d\n", i, total);
            total = total + i;
            System.out.printf("After addition i is %d, total is %d\n\n", i, total);
        }
        System.out.printf("Returning %d", total);
        return total;
    }
    
    public static void sayHello(int n)
    {
        assert(n > 0);
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i + ". Hello");
        }
    }

    public static void sayHelloComplex(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i + ". Hello");
            
            System.out.print(i);
            System.out.println(". HelloVersion2");
            
            System.out.printf("%d. HelloVersion3\n", i);
        }
    }

    public static void main()
    {
        int i = 0;
        while (i < 10)
        {
            System.out.println("Hello World");
            i++;
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.println("Bye World");
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many times to say hello: ");
        //int times = keyboard.nextInt();
        //sayHello(times);
        System.out.println("Calling sumToN");
        sumToN(3);
        assert(sumToN(3) == 6);
        assert(sumToN(5) == 15);
        //assert(sumToN(100) == (100 * 101 / 2));
    }
}
