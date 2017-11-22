
/**
 * Write a description of class University here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class University
{
    private static int MAX_COURSES = 100;               // max courses at university
    private static int MAX_STUDENTS = 1000;             // max students at university
    
    private String courses[];                           // courses currently offered
    private int numberOfCourses;                        // number of courses currently on offer
    private Student students[];                         // students enrolled at university
    private int numberOfStudents;                       // number of students currently enrolled
    private String name;                                // name of university

    // constructor -- set name of university
    // initialize courses array,
    // initialize students array
    // initialize numberOfCourses, numberOfStudents
    public University(String newName)
    {
        // TODO
    }

    // return true if a course with the given name is offered
    public boolean hasCourse(String courseName)
    {
        // TODO
        return false;
    }

    // print out all courses offered
    public void listCourses()
    {
        System.out.println("Courses are: ");
        // TODO
    }

    // add a new course to courses[]
    public void addCourse(String courseName)
    {
        // TODO
    }

    // print out all students enrolled at university
    public void listStudents()
    {
        System.out.println("Students are:");
        // TODO
    }

    // print out all students enrolled in htis course
    public void listStudentsInCourse(String courseName)
    {
        System.out.println("Students in " + courseName + " are:");
        // TODO
    }

    // return a Student object based on name
    // if no student with that name found, return null
    public Student getStudent(String name)
    {
        // TODO
        return null;
    }

    // enroll a student at university
    public void enroll(Student student)
    {
        // TODO
    }

    // display information about university
    public void information()
    {
        System.out.println(name + " has " + numberOfCourses + " courses and " + numberOfStudents + " students");
    }

    // short string when university object is printed
    public String toString()
    {
        return "<" + name + ">";
    }

}
