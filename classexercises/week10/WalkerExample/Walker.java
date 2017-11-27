
/**
 * Write a description of class Walker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.InterruptedException;
import java.util.concurrent.TimeUnit;
public class Walker
{
    int positionX;
    int positionY;
    int waitTime;
    char symbol;
    
    static int width = 80;
    static int height = 20;

    public void clearScreen()
    {
        // This is only for BlueJ.  From this page on the FAQ:
        //     http://www.bluej.org/faq.html#faq_How_do_I_clear_the_terminal_
        System.out.print('\u000C');
    }

    public void wait(int numMilliseconds)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(numMilliseconds);
        }
        catch (InterruptedException e)
        {
            System.out.println("Premature awakening");
        }
    }

    public Walker(char newSymbol)
    {
        positionX = 1;
        positionY = 1;
        waitTime = 500;
        symbol = newSymbol;
    }

    void setWaitTime(int milliseconds)
    {
        waitTime = milliseconds;
    }

    void moveUp(int steps)
    {
        for (int i = 0; i < steps; i++)
        {
            positionY--;
            if (positionY < 1)
                positionY = 1;
            printScreen();
        }
    }

    void moveDown(int steps)
    {
        for (int i = 0; i < steps; i++)
        {
            positionY++;
            if (positionY > height - 1)
                positionY = height - 1;
            printScreen();
        }
    }

    void moveRight(int steps)
    {
        for (int i = 0; i < steps; i++)
        {
            positionX++;
            if (positionX > width - 1)
                positionX = width - 1;
            printScreen();
        }
    }

    void moveLeft(int steps)
    {
        for (int i = 0; i < steps; i++)
        {
            positionX--;
            if (positionX < 1)
                positionX = 1;
            printScreen();
        }
    }

    void printStars(int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print("*");
    }

    void printBlanks(int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(" ");
    }

    void printScreen()
    {
        clearScreen();
        // two nested for loops
        // print some stars
        printStars(width);
        System.out.println();
        // print some empty lines
        for (int i = 1; i < height; i++)
        {
            printStars(1);
            if (i == positionY)
            {
                printBlanks(positionX - 1);
                System.out.print(symbol);
                printBlanks(width - positionX - 2);
            }
            else
            {
                printBlanks(width - 2);
            }
            printStars(1);
            System.out.println();

        }
        // print some stars
        printStars(width);
        System.out.println();
        wait(waitTime);
    }
}
