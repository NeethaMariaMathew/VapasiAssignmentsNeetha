package level2Assignment.Loops;

import java.util.Scanner;

public class Qn2Loops {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        int n;
        while(num>0)
        {
           n=num%10;
           sum=sum+n;
           num=num/10;
        }
        System.out.println("Sum of digits = "+sum);
    }
}
