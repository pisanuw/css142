public class MyString
{
    public static void main(String[] args)
    {
        String name = "Hello";
        name = name + " " + "World";
        int n = 128;
        System.out.println(name + n);
        n = name.length();
        System.out.println(name + " is of length " + n);
        System.out.println(n);
        boolean isSame = name.equals("Hello World");    // isSame should be true
        isSame = name.equalsIgnoreCase("HELLO WORLD");  // isSame should be true again
        name = name.toLowerCase();                      // name is now "hello world"
        name = "    " + name + "      ";                // padded with space
        name = name.trim();                             // got rid of space
        char c = name.charAt(0);                        // c is 'h';
        String shortName = name.substring(6);           // shortName is world
        System.out.println("Name: " + name + ", shortName: " + 
            shortName);
        shortName = name.substring(6,8);                // shortname is wo
        System.out.println("Name: " + name + ", shortName: " + shortName);
        int where = name.indexOf("World");
        where = name.indexOf("o", 5);
        where = name.lastIndexOf("l");
        System.out.println("Last index of the letter l is at " + where);
    }
}
