package StudentRegistrationSystem;
 
import java.util.ArrayList;
import org.joda.time.DateTime;
 
public class CourseProgramme {
        private String name;
        private ArrayList<Module> modules;
        private ArrayList<Student> students;
        private DateTime startDate;
        private DateTime endDate;
       
        //Constructors
        public CourseProgramme(String name, DateTime startDate, DateTime endDate) {
            this.setName(name);
            this.setModules(modules);
            this.setStudents(students);
            this.setStartDate(startDate);
            this.setEndDate(endDate);
            this.students = new ArrayList<Student>();
            this.modules = new ArrayList<Module>();
        }
               
        public void addStudents(Student student) {
                        this.students.add(student);
        }
       
        public void addModule(Module modules) {
                        this.modules.add(modules);
        }
               
        public String getName() {
                        return name;
        }
 
        public void setName(String name) {
                        this.name = name;
        }
 
        public ArrayList<Module> getModules() {
                        return modules;
        }
 
        public void setModules(ArrayList<Module> modules) {
                        this.modules = modules;
        }
 
        public ArrayList<Student> getStudents() {
                        return students;
        }
 
        public void setStudents(ArrayList<Student> students) {
                        this.students = students;
        }
 
        public DateTime getStartDate() {
                        return startDate;
        }
 
        public void setStartDate(DateTime startDate) {
                        this.startDate = startDate;
        }
 
        public DateTime getEndDate() {
                        return endDate;
        }
 
        public void setEndDate(DateTime endDate) {
                        this.endDate = endDate;
        }
               
        public String ToString() {
                        return "Course: " + getName() + "\n" + "Modules: " + getModules() + "\n" + "Students: " + getStudents() + "\n"
                            + "Start Date: " + getStartDate() + "\n" + "End Date: " + getEndDate() + "\n";
        }
}