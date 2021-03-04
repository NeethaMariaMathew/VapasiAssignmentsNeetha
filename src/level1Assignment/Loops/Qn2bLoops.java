package level1Assignment.Loops;

import java.util.Scanner;

public class Qn2bLoops {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of lines for the pattern");
    int l = input.nextInt();
    int space = l-1;
        for(int i=1;i<=l;i++)
    {
        for(int j=1;j<=space;j++)

            System.out.print(" ");
            space--;

        for(int j=1;j<=2*i-1;j++)
            System.out.print("*");
        System.out.println("");
    }
        space=1;
        for(int i=1;i<=l-1;i++)
        {
            for(int j=1;j<=space;j++)

                System.out.print(" ");
            space++;

            for(int j=1;j<=2*(l-i)-1;j++)
                System.out.print("*");
            System.out.println("");
        }
}
}
