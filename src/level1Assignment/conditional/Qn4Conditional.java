package level1Assignment.conditional;

import java.util.Scanner;

public class Qn4Conditional {
    public static void main(String[] args) {
        System.out.println("Enter your salary");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        System.out.println("Enter years of service");
        int s = input.nextInt();
        if(s>5)
        {
            double bonus = (salary*5)/100;
            System.out.println("Bonus amount is "+bonus);
        }
        else
            System.out.println("Bonus is 0");
    }
}
