package level1Assignment.conditional;

import java.util.Scanner;

public class Qn1Conditional {
    public static void main(String[] args) {
        System.out.println("Enter length");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        System.out.println("Enter breadth");
        int b = input.nextInt();
        if(l==b)
            System.out.println("This is a square");
        else
            System.out.println("This is a not a square");

    }
}
