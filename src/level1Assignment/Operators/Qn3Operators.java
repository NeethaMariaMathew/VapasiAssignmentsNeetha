package level1Assignment.Operators;

import java.util.Scanner;

public class Qn3Operators {
    public static void main(String[] args) {
        System.out.println("Enter the value in Fahrenheit");
        Scanner input = new Scanner(System.in);
        double f = input.nextDouble();
        double celsius = (f - 32)*5/9;
        System.out.println("Value in celsius is "+ celsius);
        
    }
}
