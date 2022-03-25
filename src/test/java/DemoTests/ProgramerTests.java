package DemoTests;

import TestingDemo.Programer;
import org.testng.annotations.Test;

public class ProgramerTests {
    @Test
    public void initProgrammerTests(){
        Programer programer = new Programer();
        programer.printInfor();

        Programer programer1 = new Programer(1,"programmer1");
        programer1.printInfor();

        Programer programer2 = new Programer(2,"programmer2","15/10/2021");
        programer2.printInfor();

        Programer programer3 = new Programer(3,"programmer3","15/10/2021","Java language");
        programer3.printInfor();


    }
}
