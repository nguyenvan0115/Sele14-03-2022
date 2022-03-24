package DemoTests;

import TestingDemo.Student;
import org.testng.annotations.Test;

public class StudentTests {
    //Annotation
    @Test
    public void initializationThroughReferenceTest(){
        System.out.println("This is my first test!!!");

        int n = 10;
        Student student = new Student(); // a new Object
        student.id = 1;
        student.name = "Nguyen Van A";
        System.out.println("ID: "+ student.id);
        System.out.println("Name: "+ student.name);
    }
    @Test
    public void initializationThroughMethodTest(){
        Student student = new Student(); // a new Object
        student.setId(2);
        student.setName("Marry");
        System.out.println("ID: "+ student.id);
        System.out.println("Name: "+ student.name);
    }
    @Test
    public  void initializationThroughConstructorTest(){
        Student student = new Student(3,"Tom");
        System.out.println("ID: "+ student.id);
        System.out.println("Name: "+ student.name);
    }
    @Test
    public void accessSpecifierPublicTest(){
        Student student = new Student(4,"Van xinh gai");
        System.out.println("ID: "+ student.getId());
        System.out.println("Name: "+ student.getName());

    }
    @Test
    public void staticMethodTest(){
        Student.getMessage();
    }

}
