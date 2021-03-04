package level1Assignment.conditional;

import java.util.Scanner;

public class Qn7Conditional {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = Math.abs(a);
        System.out.println("Absolute value of "+a+" is "+b);

    }
}
