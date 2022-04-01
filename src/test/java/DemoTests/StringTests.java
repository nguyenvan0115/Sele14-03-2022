package DemoTests;

import org.testng.annotations.Test;

import java.util.Locale;

public class StringTests {

    //...
    //
    //
    @Test
    public  void concatTesst(){
        String s1 = "Welcome to Java";
        // java String is imutable
        String s2 = s1.concat(" 2022");
        s1 = s1.concat(" 2022");

        System.out.println(s1);
        System.out.println(s2);
    }
    @Test
    public void concatTest2(){
        String s1 = "Welcome";
        String s2 = "to";
        String s3 = "Java";

        String s4 = s1.concat(s2).concat(s3);
        System.out.println(s4);
    }
    @Test
    public void formatTest1(){
        String s1 = "Welcome to Java";

        s1 = String.format("Welcome to Java! %s. Happy new year!!!" ,"2022");

        String s2 =  String.format("Welcome Welcome to Java! %s. Happy %s year!!!" ,"Van" ,"2022");
        System.out.println(s1);
        System.out.println(s2);
    }
    @Test
    public void formatTest2(){
        String s1= "Welcome %s to our wwebsite";
        String loginName =  "Daisy";

        String s2 = String.format(s1,loginName);

        System.out.println(s2);
    }

    @Test
    public void formatTest3(){
        String s1= "Welcome %s to our wwebsite in year %d"; // float == %f ; %s ddeefu ddc vs moij data type
        String loginName =  "Daisy";
        int year = 2022;

        String s2 = String.format(s1,loginName,year);
        System.out.println(s2);
    }
    @Test
    public void containTest1(){
        String s1 = "Welcome %s to our wwebsite";
        String loginName = "Daisy";
        String loginId = "ST01";

        String  s2= String.format(s1,loginName);

        System.out.println(s2.contains(loginName));
        System.out.println(s2.contains(loginId));

        System.out.println(s2.contains("Daisy"));
    }
    @Test
    public void StartwithTest1(){
        String s1 = "Welcome Daisy to our website";

        System.out.println(s1.startsWith("Welcome"));
        System.out.println(s1.startsWith("welcome"));
        System.out.println(s1.startsWith("Wel"));

        System.out.println(s1.endsWith("website"));
        System.out.println(s1.endsWith("e"));
        System.out.println(s1.endsWith("Site"));
    }

    @Test
    public void equalsTest(){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "JaVa";
        String s4 = "JavaScript";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); //java # JaVa
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s3)); //dung ham ignoreCase => java == JaVa
    }
    @Test
    public void subTringTest1(){
        String s1 = "Welcome Daisy to our website";
        String s2 = s1.substring(8,13);
        String s3 = s1.substring(8);
        System.out.println(s2);
        System.out.println(s3);
    }
    @Test
    public void subTringTest2(){
        String s1 = "Welcome Daisy to our website";
        String s2 = s1.substring(8,8+"Daisy".length());
        String s3 = s1.substring(8);
        System.out.println(s2);
        System.out.println(s3);
    }

    @Test
    public void strimTest1(){
        String s1 = "         Welcome Daisy to our website   ";
        System.out.println(s1.trim());
        System.out.println(s1.trim().toUpperCase());
        System.out.println(s1.trim().toLowerCase());
    }


}
