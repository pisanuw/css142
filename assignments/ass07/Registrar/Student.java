
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private static int MAX_REGISTERED_COURSES = 4;      // max number of courses a student can enroll
    
    private String name;                                // name of student
    private String registeredCourses[];                 // list of currently registered courses
    private int numberOfRegisteredCourses;              // number of courses currently registered
    private University university;                      // university student belongs to

    // constructor -- create a new student at this university
    public Student(String newName, University uni)
    {
        // TODO
    }
    
    // return the name of student
    // name is a private variable, so need getter method
    public String getName()
    {
        return name;
    }
    
    // return true if student is registered for the given course
    public boolean isRegisteredFor(String courseName)
    {
        // TODO
        return false;
    }

    // add the course to the list of registeredCourses
    // Display message if University does not foffer this course
    // Display message if student already registered for this course
    public void add(String courseName)
    {

        // TODO
        System.out.println(name + " is now registered for " + courseName);
    }

    // list all courses that student is registered for
    private void listCourses()
    {
        // TODO
    }
    
    public void drop(String courseName)
    {
        // HARD
        // Bonus question
    }

}
