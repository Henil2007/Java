package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestApp8 {

    public static void main(String[] args) {
        int n;
        double sal;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> salary = new ArrayList<Double>();
        System.out.println("Enter No. of Elements : ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter salary of Employee "+i+" : ");
            sal = sc.nextDouble();
            salary.add(sal);
        }

        Iterator<Double> itr = salary.iterator();

        while (itr.hasNext()) {
            Double s = (Double) itr.next();
            System.out.println(s);
        }
    }
}
