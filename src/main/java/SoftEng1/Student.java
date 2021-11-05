/**
 *
 * @author Pádraic Toomey 17316616 4th ECE
 */
package SoftEng1;

import org.joda.time.*;
import java.util.ArrayList;

public class Student {
private String name;
private LocalDate DOB;
private static int ID;
private ArrayList<Course> courses;
private ArrayList<Module> modules;

public Student(String name, LocalDate DOB, int ID, ArrayList<Course> courses, ArrayList<Module> modules){
    this.name = name;
    this.DOB = DOB;
    this.ID = ID;
    this.courses = courses;
    this.modules = modules;
   
}    

//Gets
public String getName(){
    return name;
}

public int getAge(){
    return Years.yearsBetween(DOB, LocalDate.now()).getYears();
}

public LocalDate getDOB(){
    return DOB;
}

public int getID(){
    return ID;
}

public String getUsername(){
    String username = getName() + getAge();
    return username;
}

public ArrayList<Course> getCourses() {
        return courses;
    }

public ArrayList<Module> getModules() {
        return modules;
    }



//Sets
public void setCourses(ArrayList<Course> courses) {
    this.courses = courses;
    }

public void setModules(ArrayList<Module> modules) {
    this.modules = modules;
    }

public void setName(String name) {
    this.name = name;
    }

public void setDOB(LocalDate DOB) {
    this.DOB = DOB;
    }

public void setID(int ID) {
    this.ID = ID;
    }



public void addCourse(Course course){
    courses.add(course);
    }

    public boolean removeCourse(Course course){
        return courses.remove(course);
    }
    
       
public void addModule(Module module){
    modules.add(module);
    }

public boolean removeModule(Module module){
    return modules.remove(module);
    }

public static void main(String[] args){
}
    
}
