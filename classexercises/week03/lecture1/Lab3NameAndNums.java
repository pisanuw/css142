
/**
 * Write a description of class Lab3NameAndNums here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lab3NameAndNums
{
    public static void getNameand3Nums()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("A name and 3 nums please: ");
        String name = keyboard.next();
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double num3 = keyboard.nextDouble();
        System.out.printf("We got name as %s nums as %.2f %.2f %.2f\n", 
            name, num1, num2, num3);
        double maxNum = Math.max(num1, Math.max(num2, num3));
        double minNum = Math.min(num1, Math.min(num2, num3));
        System.out.printf("Max/min is %.2f %.2f\n", maxNum, minNum);
        double middleNum = (num1 + num2 + num3) - (maxNum + minNum);
        System.out.printf("Middle: %f\n", middleNum);
    }
    public static void main()
    {
        getNameand3Nums();
        System.out.println("All done!");
    }
}
