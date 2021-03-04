package level1Assignment.Loops;

import java.util.Scanner;

public class Qn7Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int avg =0;
        int i=0;
        int product=1;
        int count = 1;
        String ch;
        do {
        System.out.println("Enter number"+count);
        int num1 = input.nextInt();
        sum = sum+num1;
        product = product*num1;
        count++;
            System.out.println("Enter q to quit");
            ch = input.next();
    }while(!ch.equalsIgnoreCase("q"));
        System.out.println("Product of numbers = "+product);
        avg=sum/(count-1);
        System.out.println("Average of numbers = "+avg);

}}
