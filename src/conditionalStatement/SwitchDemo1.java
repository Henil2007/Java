package conditionalStatement;
import java.util.Scanner;

public class SwitchDemo1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int no1,no2,ans,choice;

        System.out.print("Enter no 1 : ");
        no1 = scan.nextInt();

        System.out.print("Enter no 2 : ");
        no2 = scan.nextInt();

        while (true)
        {
            System.out.println("1 .For Addition");
            System.out.println("2. For Substraction");
            System.out.println("3. For Multiplication");
            System.out.println("4. For Division");
            System.out.println("5. For Exit");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();

            switch (choice)
            {
                case 1: ans = no1 + no2;
                        System.out.println("no1 + no2 = " + ans);
                        break;
                case 2: ans = no1 - no2;
                        System.out.println("no1 - no2 = " + ans);
                        break;
                case 3: ans = no1 * no2;
                        System.out.println("no1 * no2 = " + ans);
                        break;
                case 4: ans = no1 / no2;
                        System.out.println("no1 / no2 = " + ans);
                        break;
                case 5: System.exit(0);
            }
        }
    }
}
