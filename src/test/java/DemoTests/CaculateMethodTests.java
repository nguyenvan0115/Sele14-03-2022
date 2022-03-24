package DemoTests;

import TestingDemo.CaculateMethod;
import org.testng.annotations.Test;

public class CaculateMethodTests {
    @Test
    public void addMethodTest(){
        int n = CaculateMethod.add(2,5);  // static method dung de viet nhung cai ham chức năng, một số tác vụ độc lập, khôn dính với Object j hết
        System.out.println("n = " +n);
    }
}
