package level2Assignment.Conditional;

import java.util.Scanner;

public class Qn1Conditional {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year%4 == 0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.println("Year is a leap year");
                else
                    System.out.println("Year is not a leap year");
            }
            else
                System.out.println("Year is a leap year");
        }
        else
            System.out.println("Year is not a leap year");

    }
}
