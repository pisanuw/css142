
/**
 * Write a description of class Registrar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

public class Registrar
{
    // static variable, so we can use the same keyboard for all input
    static Scanner keyboard = new Scanner(System.in);
    
    // prompt user for integer and return it
    private static int getChoice(String prompt)
    {
        System.out.print(prompt);
        int choice = keyboard.nextInt();
        return choice;
    }

    // prompt user for String and return it
    private static String getString(String prompt)
    {
        System.out.print(prompt);
        String str = keyboard.next();
        return str;
    }

    // Main menu for program, asks university name
    // creates university object and calls universityMenu
    public static void mainMenu()
    {
        System.out.println("Welcome to the Registrar program");
        String uniName = getString("Enter a name for University: ");
        University uni = new University(uniName);
        universityMenu(uni);
    }

    // Main university menu with registrar functions
    private static void universityMenu(University uni)
    {
        System.out.println("Welcome to the " + uni + " menu");
        System.out.println("1. Display information about the university");
        System.out.println("2. List all courses");
        System.out.println("3. Add a course");
        System.out.println("4. Enroll a new student");
        System.out.println("5. List all students");
        System.out.println("6. Register a student for a course");
        System.out.println("7. List all students enrolled in a course");
        System.out.println("10. Exit");
        int choice = getChoice("Enter command: ");
        System.out.println("Choice is " + choice);
        switch (choice)
        {
            case 1: uni.information(); break;         
            case 2: uni.listCourses(); break;
            case 3: addCourse(uni); break;            
            case 4: enrollAStudent(uni); break;
            case 5: uni.listStudents(); break;   
            case 6: registerStudentForCourse(uni); break;            
            case 7: listStudentsInCourse(uni); break;
            case 10: 
            System.out.println("Thank you for using the Registrar program");
            System.exit(0);

            default: System.out.println("Invalid choice " + choice);
        }
        System.out.println();
        universityMenu(uni);
    } 

    // checks if the course is already offered at university
    // if course is not offered, adds course
    private static void addCourse(University uni)
    {
        // TODO
        System.out.println("Added new course");
    }

    // gets name from user, creates Student object and 
    // enrolls the new student at university
    private static void enrollAStudent(University uni)
    {
        // TODO
        System.out.println("Enrolled student");
    }

    // gets name from user, checks if the student with that name
    // can be found at university.
    // If student is found, gets course name
    // if course is offered at university and student is not
    // already registered for the course, add student to that course
    private static void registerStudentForCourse(University uni)
    {
        // TODO
        System.out.println("Registered student for a course");
    }

    // gets course name from user, if course is offered
    // prints all students taking that course
    private static void listStudentsInCourse(University uni)
    {
        // TODO
    }
    
    // calls mainMenu - useful when running from command line outside of BlueJ
    public static void main(String[] args)
    {
        mainMenu();
    }
}
