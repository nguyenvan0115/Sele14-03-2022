package TestingDemo;

import java.util.Objects;

public class Employee {

    //static variable
    public static String company = "ITMS company";
    //ung dung khac cua static variable : co the tao ra bien dem cua CLass
    public static int numOfEmployee = 0;
    public boolean contains;

    private int id;
    private String name;
    private String dob;
    private  String address;

    //Constructor  : 2 cai constructor giong nhau ve ,,, -> Over loading

    public Employee(){
        numOfEmployee++;
    }

    public Employee(int id, String name) {
        numOfEmployee++;

        this.id = id;
        this.name = name;
    }
    public Employee(int id, String name, String dob){
        this(id, name); // phải nằm ở dòng đầu tiên
        this.dob =dob;
        numOfEmployee++;
    }
    public Employee(int id, String name, String dob, String address){
        this(id,name,dob);
        this.address =address;
    }

    //Static method
    //Intance method
    // - Accessor Method: getter (lấy data); setter
    // - MUtator Method: setter (set data); setter
    public int getId(){
        return id;
    }
    public void setId(int newId){
        //cach 1:
        id = newId;
        //cach 2:
        // this.id = newId
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void printInfor(){
        System.out.println("Id: " + getId()); // == getId() == this.getId()
        System.out.println("Name: "+ this.getName());
        System.out.println("Dob: " + this.getDob());
    }
    public boolean compare(Employee employee){
        return this.id ==employee.getId() && this.name.equals(employee.getName());
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
// thuc hanh lai

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(dob, employee.dob);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
