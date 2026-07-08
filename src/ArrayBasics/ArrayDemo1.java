package ArrayBasics;

import java.util.Scanner;

public class ArrayDemo1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // array declaration methodes
        int a[] = new int[5];
//        int []a = new int[5];
//        int[] a = new int[5];
//        int [] a = new int[5];

//        int a[] = null;
//        a = new int[5];

//        int a[] = new int[]{10,20,30,40,50};
//        int a[] = {10,20,30,40,50};
//        float a[] = new float[5];
//        char a[] = new char[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a[" + i + "] : ");
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }
    }
}
