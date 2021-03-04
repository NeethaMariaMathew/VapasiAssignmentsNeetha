package level1Assignment.inputByUser;

import java.util.Scanner;

public class Qn2InputByUser {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        int sum = num1+num2;
        int product = num1*num2;
        System.out.println("Sum of "+sum+ " and "+product+" is "+ (sum+product));
        System.out.println("Product of "+sum+ " and "+product+" is "+ (sum*product));
    }
}
