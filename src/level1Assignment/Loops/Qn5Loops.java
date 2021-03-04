package level1Assignment.Loops;

import java.util.Scanner;

public class Qn5Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number whose factorial needs to be calculated");
        int n = input.nextInt();
        int fact = 1;
        if(n>0) {
            for (int i = 1; i <= n; i++)
                fact = fact * i;

            System.out.println("Factorial of " + n + " = " + fact);
        }
            else
            System.out.println("Factorial of 0 is 0");
        }}



