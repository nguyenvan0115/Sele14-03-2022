package DemoTests;

import TestingDemo.Employee;
import org.testng.annotations.Test;

public class EmployeeTests {
    @Test
    public void accessorMethodtests(){
        Employee employee = new Employee(1,"Tony", "20/10/1999");
        int n = employee.getId();

        System.out.println("n");

        //cách 2
        System.out.println(employee.getId());
    }
    @Test
    public void mutatorMethodTests(){
        Employee employee = new Employee(1,"Tony", "20/10/1999");
        int n = employee.getId();

        System.out.println("Old id: " + employee.getId());
        employee.setId(2);
        System.out.println("new id: " + employee.getId());
    }

    @Test
    public void defaultConstructorTest(){
        Employee employee = new Employee(); // giu Ctrl + an vao chu Employee : de biet dc goij method/Constructor nao
        System.out.println("Id: " +employee.getId());
        System.out.println("Name: "+employee.getName());
        System.out.println("Dob: " + employee.getDob());
    }
    @Test
    public void parameterizedCostructor(){
        Employee employee = new Employee(1,"Marry","20/10/1998");
        System.out.println("Id: " +employee.getId());
        System.out.println("Name: "+employee.getName());
        System.out.println("Dob: " + employee.getDob());
    }

    @Test
    public void staticVariableTests(){
        System.out.println(Employee.company);
        System.out.println(Employee.numOfEmployee);

        Employee employee = new Employee();
        System.out.println(Employee.numOfEmployee);

        Employee employee1 = new Employee(1,"Van","20/10/1997");
        System.out.println(Employee.numOfEmployee);
    }
}
