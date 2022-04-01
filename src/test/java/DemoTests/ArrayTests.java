package DemoTests;

import org.testng.annotations.Test;

public class ArrayTests {
    @Test
    public void ArrayTests(){
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 20;
        a[3] = 256;
        a[4] = 2025;

        System.out.println("a[3] = " +a[3] );
        System.out.println("---------------------------------");

//        for(int i =0; i< a.length; i++){
//            System.out.println("a[" + i + "] = " +a[i]);
//        }
        for(int i =1; i<= a.length; i++){
            System.out.println("a[" + i + "] = " +a[i]);
        }

        for(int n:a){
            System.out.println(n);
        }
    }
    @Test
    public void ArrayTest2(){
        int a[] = {1,20,50,40,20};
//        for(int n:a){
//            System.out.println(n);

        for(int i =0 ; i< a.length; i++){
            System.out.println("a[" + i + "] = " +a[i]);
        }
    }

    @Test
    public void getMinMaxTest1(){
        int a[] = {1,20,50,40,20};
        int m= min(a);
        int ma= max(a);

        System.out.println("min = "+m);
        System.out.println("max= "+ma);
        //==
        System.out.println("min = "+min(a));
        System.out.println("max= "+max(a));
    }

    @Test
    public void minmaxTest2(){
        int a[] = {1,20,50,40,20};

    }

    @Test
    public void multipleArrayTests1(){
        int[][] arr= new int[3][4];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;

        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 8;

        arr[2][0] = 9;
        arr[2][1] = 10;
        arr[2][2] = 11;
        arr[2][3] = 12;

        for (int i = 0; i< arr.length; i++){
            for (int j =0; j<arr[i].length; j++){ // arr[i].length = cot
                System.out.println("arr["+i +"]["+j+"]=" +arr[i][j] );
            }
            System.out.println("----------------");

        }
    }
    @Test
    public void multipleArrray2(){
    }



























    public static int[] getMinMax(int arr[]){
        int[] minmax = new int[2];

        minmax[0] = min(arr);
        minmax[1] = max(arr);
        return minmax;

    }


    public static int min(int[] a){
        int min = a[0];
        for(int i =1; i< a.length; i++){
            if (min > a[i]) min= a[i];
        }
        return min;
    }
    public static int max(int[] a){
        int max = a[0];
        for(int i =1; i< a.length; i++){
            if (max < a[i]) max= a[i];
        }
        return max;
    }


}
