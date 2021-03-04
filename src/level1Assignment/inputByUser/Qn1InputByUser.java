package level1Assignment.inputByUser;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Qn1InputByUser {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Sum of "+num1+ " and "+num2+" is "+ (num1+num2));
        System.out.println("Product of "+num1+ " and "+num2+" is "+ (num1*num2));
    }
}
