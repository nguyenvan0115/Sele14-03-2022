package TestingDemo;

public class Student {
    //Atribute
    //field
    //properties
    public  int id;
    public  String name;

//    Constructos
    public  Student(){ // khong co Prameter : k cos tham so
    }

    public Student(int sId, String sName){ // co Prameter : co tham so
        id = sId;
        //this dc dung giong nhu thay the vs cai Object hien tai cua class nay
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

        return id; // == return this.id;
    }
    public String getName(){
        return name;
    }

    //private methods

    // static Methods
    public static void getMessage(){
        System.out.println("This is static method");
    }


    

}
