package TestingDemo;

public class Employee {

    //static variable
    public static String company = "ITMS company";
    //ung dung khac cua static variable : co the tao ra bien dem cua CLass
    public static int numOfEmployee = 0;

    private int id;
    private String name;
    private String dob;

    //Constructor  : 2 cai constructor giong nhau ve ,,, -> Over loading

    public Employee(){
        numOfEmployee++;

    }

    public Employee(int id, String name, String dob) {
        numOfEmployee++;

        this.id = id;
        this.name = name;
        this.dob = dob;
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


}
