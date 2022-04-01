package TestingDemo;

public class Tester extends Employee{
    //áttribute
    private String mainType;
    private String department;

    public Tester(String mainType, String department) {
        this.mainType = mainType;
        this.department = department;
    }

    public Tester(int id, String name, String dob, String address, String mainType, String department) {
        super(id, name, dob, address);
        this.mainType = mainType;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "mainType='" + mainType + '\'' +
                ", department='" + department + '\'' +
                '}';
    }


}
