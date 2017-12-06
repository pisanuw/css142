
/**
 * Write a description of class Pokemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pokemon
{
    int hp;
    int dp;
    int speed;
    String name;
    Pokemon(String newName, int newHP, int newDP, int newSpeed)
    {
        name = newName;
        hp = newHP;
        dp = newDP;
        speed = newSpeed;
    }

    public void attack(Pokemon p)
    {
        System.out.println(name + " attacks " + p.name);
        p.dp = p.dp - hp;
    }

    public String toString()
    {
        return "<P: " + name + "(" + hp + ", " + dp + ")>";
    }

    public boolean isDead()
    {
        return dp == 0;
    }

    public static void testPokemon()
    {
        Pokemon p1 = new Pokemon("Pik", 3, 100, 5);
        Pokemon p2 = new Pokemon("Char", 10, 30, 2);
        Pokemon a = p1;
        Pokemon b = p2;
        if (b.speed > a.speed)
        {
            a = p2;
            b = p1;
        }
        while(!a.isDead() && !b.isDead())
        {
            System.out.println(a + " vs " + b);
            a.attack(b);
            if (! b.isDead())
                b.attack(a);
        }
        if (! a.isDead())
            System.out.println("Winner: " + a);
        else
            System.out.println("Winner: " + b);
            }
    }
