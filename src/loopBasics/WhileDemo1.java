package loopBasics;

public class WhileDemo1
{
    public static void main(String[] args)
    {
        int i = 1;

        while (i <= 5)
        {
            int k = 5 - i;   // Reset spaces
            int j = 1;       // Reset stars

            while (k >= 1)
            {
                System.out.print(" ");
                k--;
            }

            while (j <= i)
            {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}