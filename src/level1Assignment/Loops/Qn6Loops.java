package level1Assignment.Loops;

import java.util.Scanner;

public class Qn6Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        int hcf=0;
        for(int i=1;i<=num1||i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
                hcf=i;
        }
        System.out.println("HCF of "+num1+" and "+num2+" = "+hcf);

    }
}
