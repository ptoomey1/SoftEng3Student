/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftEng1;

import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 35386
 */
public class StudentTest {
    
Student studentA;
String name;
int age;

Course courseA;
Course courseB;
ArrayList<Course> courses= new ArrayList<>();
    
Module moduleA;
Module moduleB;
Module moduleC;
ArrayList<Module> modules= new ArrayList<>();
    
    public StudentTest() {
        
        //Test Student
        studentA = new Student("Padraic Toomey", new LocalDate(1998,1,1),17316616,new ArrayList<>(),new ArrayList<>());
        

        //Test Courses
        courseA = new Course("ECE",new ArrayList<>(),new LocalDate(2021,9,6),new LocalDate(2022,5,30));
        courseB = new Course("CSIT",new ArrayList<>(),new LocalDate(2021,9,6),new LocalDate(2020,5,30));      

        courses.add(courseA);

        
        //Test Modules
        moduleA = new Module("SoftEng3","CT417");
        moduleB = new Module("RealTimeSystems","CT420");
        moduleC = new Module("EngineeringElectromagnetics","EE348");

    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "Padraic Toomey";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = null;
        int expResult = 23;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDOB method, of class Student.
     */
    @Test
    public void testGetDOB() {
        System.out.println("getDOB");
        Student instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getDOB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Student instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String username = "";
        Student instance = null;
        String expResult = "";
        String result = instance.getUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        Student instance = null;
        ArrayList<Course> expResult = null;
        ArrayList<Course> result = instance.getCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        Student instance = null;
        ArrayList<Module> expResult = null;
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        System.out.println("setCourses");
        ArrayList<Course> courses = null;
        Student instance = null;
        instance.setCourses(courses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        System.out.println("setModules");
        ArrayList<Module> modules = null;
        Student instance = null;
        instance.setModules(modules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDOB method, of class Student.
     */
    @Test
    public void testSetDOB() {
        System.out.println("setDOB");
        LocalDate DOB = null;
        Student instance = null;
        instance.setDOB(DOB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Student.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        Student instance = null;
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCourse method, of class Student.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = null;
        Student instance = null;
        instance.addCourse(course);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCourse method, of class Student.
     */
    @Test
    public void testRemoveCourse() {
        System.out.println("removeCourse");
        Course course = null;
        Student instance = null;
        boolean expResult = false;
        boolean result = instance.removeCourse(course);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module module = null;
        Student instance = null;
        instance.addModule(module);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeModule method, of class Student.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module module = null;
        Student instance = null;
        boolean expResult = false;
        boolean result = instance.removeModule(module);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Student.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Student.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
