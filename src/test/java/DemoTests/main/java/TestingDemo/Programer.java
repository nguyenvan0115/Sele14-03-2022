package TestingDemo;

public class Programer extends Employee{

    private String mainProgrammingLanguage;

    public Programer(){}
    public Programer(int id, String name){
        super(id, name);
    }
    public Programer(int id, String name, String dob){
        super(id,name,dob);
    }
    public Programer(int id, String name, String dob,String mainProgrammingLanguage){
        super(id,name,dob); // == this(id,name,dob);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }
    public void printInfor(){   //  đè lên function của lớp cha --> Over riding
        super.printInfor();
        // = this.printInfor();
        System.out.println("Main Programming Language: " +this.mainProgrammingLanguage);
    }


}
