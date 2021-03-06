package level2Assignment.Loops;

import java.util.Scanner;

public class Qn6Loops {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n,sum1=0,sum2=0,rev=0,digit;
        while(num>0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }

        while(rev>0)
        {
            n=rev%10;
            sum1=sum1+n;
            rev=rev/10;
            if(rev>0) {
                n = rev % 10;
                sum2 = sum2 + n;
                rev = rev / 10;
            }
        }
        System.out.println("Sum of odd digits = "+sum1);
        System.out.println("Sum of even digits = "+sum2);
    }
}
