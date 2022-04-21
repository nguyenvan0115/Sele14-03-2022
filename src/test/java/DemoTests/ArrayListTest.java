package DemoTests;

import TestingDemo.Employee;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    @Test
    public void ArrayListTest1() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);
    }

    @Test
    public void interatorTest1() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        Iterator itr = list.iterator(); // list: size =4

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("--------------");

    }

    @Test
    public void interatorTest2() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------");
        for (String fruits : list) {
            System.out.println(fruits);
        }
    }

    @Test
    public void getSetListTest1() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
        //cach2:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.format("Index [%s] : %s", i, list.get(i)));
        }

        System.out.println("------------------------------------------------");
        list.set(2, "kiwwi");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.format("Index [%s] : %s", i, list.get(i)));
        }
    }

    @Test
    public void sortingTest1() {
        int[] a = {1, 9, 3, 4, 5, 100, 70};
        sort(a);
        for (int k : a) {
            System.out.println(k);
        }

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(10);
        integerArrayList.add(134);
        integerArrayList.add(1000);

        Collections.sort(integerArrayList);
        for (int k : a) {
            System.out.println(k);
        }


    }

    public int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        return a;
    }
    @Test
    public void userDefineObjectTest1(){
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee(1,"join","01/10/2020");
        Employee employee2 = new Employee(2,"join","01/10/2020");
        Employee employee3 = new Employee(3,"join","01/10/2020");
        Employee employee4 = new Employee(4,"join","01/10/2020");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for (Employee employee : employees){
            System.out.println(employee.toString());
        }


    }


}
