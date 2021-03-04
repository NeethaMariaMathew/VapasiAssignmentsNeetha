package level1Assignment.conditional;

import java.util.Scanner;

public class Qn2Conditional {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        if(a>b)
            System.out.println(a +" is greatest");
        else if(b>a)
            System.out.println(b + " is greatest");
        else
            System.out.println("Both numbers are equal");
    }
}
