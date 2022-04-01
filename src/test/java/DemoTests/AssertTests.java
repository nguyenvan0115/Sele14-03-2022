package DemoTests;

import TestingDemo.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AssertTests {
    @Test
    public void assertNumberTest1(){
        int a =10;
        int b =10;
        int c =20;

        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println(a != b);
        System.out.println(a != c);

        Assert.assertEquals(a,b); //true
        Assert.assertEquals(a,c); //false a= Actual; b = Expected
    }
    @Test
    public void assertNumberTest2(){
        int a  =10;
        float b = 10.0f;
        System.out.println(a == b ); //true
        Integer c =10;
        System.out.println(a == c);
    }


    @Test
    public void assertStringTest1(){
        String s1 ="Java";
        String s2 ="JaVa";
        String s3 ="JaVA";

        System.out.println(s1 ==s2);
        System.out.println(s1 ==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        Assert.assertEquals(s1,s2); // passed
        Assert.assertNotEquals(s1,s3); // passed
        Assert.assertEquals(s1,s3);  //failed



    }
    @Test
    public void assertEmployeeTest1(){
        Employee employee1 = new Employee(1, "Join");
        Employee employee2 = new Employee(1, "Join");
        Employee employee3 = new Employee(2, "Join");
        Employee employee4 = new Employee(1, "Daisy");
        Employee employee5 = new Employee(3, "Tony");

        System.out.println(employee1 == employee2); //false
        System.out.println(employee1.equals(employee2)); //false

//        Assert.assertEquals(employee1,employee2);

        System.out.println(employee1.getId() == employee2.getId());
        System.out.println(employee1.getName() == employee2.getName());
        System.out.println(employee1.getName().equals(employee2.getName()));

//        Assert.assertEquals(employee1,employee2); //failse


        System.out.println("-------------------------");
        System.out.println(employee1.compare(employee2)); //true
        System.out.println(employee1.compare(employee4));

        System.out.println(employee1.equals(employee2)); //faulse




    }
    @Test
    public void assseryObjectTest1() {
        String s1 = "Java";
        String s2 = "Java"; //s1&s2 poits to the same object
        String s3 = new String("Java"); //s3 is a new object, which is different from s1,s2

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //== : compare 2 things: object & value
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //faulse

        //== : compare 1 thing:  value
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
    }
    @Test
    public void assertListTest1(){
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();

        integerArrayList1.add(5);
        integerArrayList1.add(4);
        integerArrayList1.add(6);
        integerArrayList1.add(2);
        integerArrayList1.add(1);

        ArrayList<Integer> integerArrayList2 = new ArrayList<>();

        integerArrayList2.add(1);
        integerArrayList2.add(2);

        System.out.println(integerArrayList1.contains(1));
        System.out.println(integerArrayList1.contains(3));
        System.out.println(integerArrayList1.contains(integerArrayList2));

    }
    @Test
    public void assertListTest2() {
    ArrayList<Employee> employees1 = new ArrayList<>();
    Employee employee1 = new Employee(1,"Join");
    Employee employee2 = new Employee(2,"Mary");
    Employee employee3 = new Employee(3,"Helen");


    employees1.add(employee1);
    employees1.add(employee2);
    employees1.add(employee3);

        System.out.println(employees1.contains(employee1));


    }


}
