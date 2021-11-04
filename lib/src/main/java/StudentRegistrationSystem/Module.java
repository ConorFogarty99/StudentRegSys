package StudentRegistrationSystem;
 
import java.util.ArrayList;
 
public class Module {           
	private String name;
   	private String ID;
   	private ArrayList<Student> students;
   	private ArrayList<CourseProgramme> courses;
  
   //Constructors
       public Module(String name, String ID){
          this.setName(name);
          this.setID(ID);
          this.students = new ArrayList<Student>();
          this.courses = new ArrayList<CourseProgramme>();
       }
      
       public void addStudents(Student student) {
          this.students.add(student);
       }
      
       public void addCourse(CourseProgramme course) {
          this.courses.add(course);
       }
 
       public String getName() {
          return name;
       }
 
       public void setName(String name) {
          this.name = name;
       }
 
       public String getID() {
          return ID;
       }
 
       public void setID(String iD) {
          ID = iD;
       }
 
       public ArrayList<Student> getStudents() {
          return students;
       }
 
       public void setStudents(ArrayList<Student> students) {
          this.students = students;
       }
 
       public ArrayList<CourseProgramme> getCourses() {
          return courses;
       }
 
       public void setCourses(ArrayList<CourseProgramme> courses) {
          this.courses = courses;
       }
      
       public String ToString() {
              return "Module: " + getName() + "\n" + "ID: " + getID() + "\n" + "Students: " + getStudents() + "\n" + "Courses: " + getCourses() + "\n";
   }
}