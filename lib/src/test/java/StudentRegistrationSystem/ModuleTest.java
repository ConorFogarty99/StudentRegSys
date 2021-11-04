package StudentRegistrationSystem;
 
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Test;
 
public class ModuleTest {
               
                Module testModule;
    ArrayList<Student> students;
    ArrayList<CourseProgramme> courses;
   
    public ModuleTest() {
                students = new ArrayList<>(3);
                courses = new ArrayList<>(3);
 
        Student conorF = new Student("Conor Fogarty", new DateTime(1999, 7, 15 ,0 , 0 , 0 ));
        Student seanF = new Student("Sean Fogarty", new DateTime(1997, 7, 12 ,0 , 0 , 0 ));
        Student kelanF = new Student("Kelan Fogarty", new DateTime(2001, 1, 31 ,0 , 0 , 0 ));
 
       
        students.add(conorF);
        students.add(seanF);
        students.add(kelanF);
       
        DateTime start = new DateTime(2021, 9, 01 ,0 , 0 , 0 );;
        DateTime end = new DateTime(2022, 5, 19 ,0 , 0 , 0 );
        CourseProgramme course1 = new CourseProgramme("Computer Science", start, end);
       
        start = new DateTime(2021, 9, 01 ,0 , 0 , 0 );;
        end = new DateTime(2021, 12, 17 ,0 , 0 , 0 );
        CourseProgramme course2 = new CourseProgramme("Mechanical Engineering", start, end);
       
        start = new DateTime(2021, 9, 01 ,0 , 0 , 0 );
        end = new DateTime(2022, 5, 19 ,0 , 0 , 0 );
        CourseProgramme course3 = new CourseProgramme("General Science", start, end);
       
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
       
        testModule = new Module("CT401", "001");
        //System.out.println(testModule.ToString());
    }
 
    // Testing get/set name
    @Test
    public void testGetName() {
        assertEquals(testModule.getName(), "CT401");
    }
 
    @Test
    public void testSetName() {
        testModule.setName("CT402");
        assertEquals(testModule.getName(), "CT402");
    }
 
    // Testing get/set ID
    @Test
    public void testGetId() {
        assertEquals(testModule.getID(), "001");
    }
 
    @Test
    public void testSetId() {
        testModule.setID("002");
        assertEquals(testModule.getID(), "002");
    }
 
    // Testing get/set students
    @Test
    public void testGetStudents() {
        assertEquals(testModule.getStudents(), students);
    }
 
    @Test
    public void testSetStudents() {
        students.remove(0);
        testModule.setStudents(students);
        assertEquals(testModule.getStudents(), students);
    }
   
    // Testing addStudent method
    @Test
    public void testAddStudents() {
                //System.out.println(testModule.ToString());
                students.remove(0); //Remove conorF
                Student conorF = new Student("Conor Fogarty", new DateTime(1999, 7, 15 ,0 , 0 , 0 ));
                testModule.addStudents(conorF); //add conorF back through addStudent method
        assertEquals(testModule.getStudents(), students);
    }
   
    // Testing addCourse method
    @Test
    public void testAddCourse() {
                //System.out.println(testModule.ToString());
                courses.remove(0); //Remove conorF
               
                DateTime start = DateTime.parse("2021-09-01");
        DateTime end = DateTime.parse("2022-05-19");
                CourseProgramme course1 = new CourseProgramme("Computer Science", start, end);
                testModule.addCourse(course1); //add conorF back through addStudent method
        assertEquals(testModule.getStudents(), students);
    }
 
    // Testing get/set courses
    @Test
    public void testGetCourses() {
        assertEquals(testModule.getCourses(), courses);
    }
 
    @Test
    public void testSetCourses() {
        courses.remove(0);
        testModule.setCourses(courses);
        assertEquals(testModule.getCourses(), courses);
    }
 
}