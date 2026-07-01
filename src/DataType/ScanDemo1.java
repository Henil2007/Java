package DataType;

import java.util.Scanner;

public class ScanDemo1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int no1,no2,ans;

        System.out.print("Enter no 1 : ");
        no1 = scan.nextInt();

        System.out.print("Enter no 2 : ");
        no2 = scan.nextInt();

        ans = no1 + no2;
        System.out.println("no1 + no2 = " + ans);

        ans = no1 - no2;
        System.out.println("no1 - no2 = " + ans);

        ans = no1 * no2;
        System.out.println("no1 * no2 = " + ans);

        ans = no1 / no2;
        System.out.println("no1 / no2 = " + ans);
    }
}
