package level1Assignment.Loops;

import java.util.Scanner;

public class Qn2cLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines for the pattern");
        int l = input.nextInt();
        //int l=s-1;
        for (int i = 1; i <= l; i++)
        {
            for (int j = l; j>i; j--) {
                System.out.print("1");
                //j--;
                System.out.print("0");

            }

            System.out.print("1");
            System.out.println();
        }
    }
}
