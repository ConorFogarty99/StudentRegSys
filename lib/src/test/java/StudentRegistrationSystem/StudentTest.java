package StudentRegistrationSystem;
 
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.Test;
 
public class StudentTest {
               
    ArrayList<Module> modules;
    ArrayList<CourseProgramme> courses;
   
    Student s1;
               
    public StudentTest() {
       
        modules = new ArrayList<>(3);
        courses = new ArrayList<>(3);
       
        Module module1 = new Module("CT401", "001");
        Module module2 = new Module("CT402", "002");
        Module module3 = new Module("CT403", "003");
       
        DateTime start = DateTime.parse("2021-09-01");
        DateTime end = DateTime.parse("2022-05-19");
        CourseProgramme course1 = new CourseProgramme("Computer Science", start, end);
       
        start = DateTime.parse("2021-09-01");
        end = DateTime.parse("2021-12-17");
        CourseProgramme course2 = new CourseProgramme("Mechanical Engineering", start, end);
       
        start = DateTime.parse("2021-09-01");
        end = DateTime.parse("2022-05-20");
        CourseProgramme course3 = new CourseProgramme("General Science", start, end);
       
        //Adding modules & courses to array list
        modules.add(module1);
        modules.add(module2);
        modules.add(module3);
       
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        
        s1 = new Student("Conor Fogarty", new DateTime(1999, 7, 15 ,0 , 0 , 0 ), courses, modules);
        //System.out.println(s1.ToString());
    }
   
    // Testing get username
    @Test
    public void testGetUsername() {
        assertEquals(s1.getUsername(),"ConorFogarty22");
    }
 
    @Test
    public void testGetName() {
        assertEquals(s1.getName(), "Conor Fogarty");  
    }
   
    // Testing get/set ID
    @Test
    public void testGetId() {
        assertEquals(s1.getID(), 1);
    }
 
    @Test
    public void testSetId() {
                s1.setID(27);
        assertEquals(s1.getID(), 27);
    }
   
    // Testing get/set age
    @Test
    public void testGetAge() {
        assertEquals(s1.getAge(), 22);   
    }
   
    @Test
    public void testSetAge() {
                s1.setAge(20);
        assertEquals(s1.getAge(), 20);
    }
   
    // Testing get/set dob
    @Test
    public void testGetDob() {
        assertEquals(s1.getDob(), new DateTime(1999, 7, 15 ,0 , 0 , 0 ));   
    }
   
    @Test
    public void testSetDob() {
                s1.setDob(new DateTime(1997, 2, 23 ,0 , 0 , 0 ));
        assertEquals(s1.getDob(), new DateTime(1997, 2, 23 ,0 , 0 , 0 ));
    }
   
    // Testing get/set modules
    @Test
    public void testGetModules() {
                //System.out.println(modules);
                //System.out.println(s1.ToString());
        assertEquals(s1.getModules(), modules);
    }
   
    @Test
    public void testSetModules() {
        modules.remove(0);
        s1.setModules(modules);
        assertEquals(s1.getModules(), modules);
    }
   
    // Testing get/set courses
    @Test
    public void testGetCourses() {
        //System.out.println(s1.getCourse());
        //System.out.println(courses);
        assertEquals(s1.getCourse(), courses);
    }
 
    @Test
    public void testSetCourses() {
        courses.remove(0);
        s1.setCourse(courses);
        assertEquals(s1.getCourse(), courses);
    }
   
 
}