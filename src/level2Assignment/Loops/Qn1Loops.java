package level2Assignment.Loops;

import java.util.Scanner;

public class Qn1Loops {
    public static void main(String[] args) {
        System.out.println("Enter the fraction number(x/y):");
        System.out.println("Enter x");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter y");
        int y = input.nextInt();
        for(int i=2;i<y;i++)
        {
            if(x%i==0 && y%i==0)
            {
                x=x/i;
                y=y/i;
            }
        }
        System.out.print(x);
        System.out.print("/");
        System.out.print(y);
       /* while(d>0)
        {
            if(y==0)
                d=0;
            else
                d=x%y;
        }*/
    }
}
