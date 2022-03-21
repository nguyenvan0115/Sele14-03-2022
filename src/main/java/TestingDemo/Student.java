package TestingDemo;

public class Student {
    //Atribute
    //field
    //properties
    public  int id;
    public  String name;

//    Constructos
    public  Student(){

    }
    public Student(int sId, String sName){
        id = sId;
        name = sName;
    }

    //Methods
    public void setId(int sId) {
        id = sId;
    }

    public void setName(String sName) {
        name = sName;
    }

    //public method
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    //private methods

}
