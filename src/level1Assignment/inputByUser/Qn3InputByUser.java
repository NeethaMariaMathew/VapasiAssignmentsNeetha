package level1Assignment.inputByUser;

import java.util.Scanner;

public class Qn3InputByUser {
    public static void main(String[] args) {
        System.out.println("Enter length as double value");
        Scanner input = new Scanner(System.in);
        double l = input.nextDouble();
        System.out.println("Enter breadth as double value");
        double b = input.nextDouble();
        double area = l*b;
        int result = (int) area;
        System.out.println("Area in integer is "+ result);
    }
}
