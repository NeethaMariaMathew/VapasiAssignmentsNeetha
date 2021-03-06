package level2Assignment.Conditional;

import java.util.Scanner;

public class Qn3Conditional {
    public static void main(String[] args) {
        System.out.println("Enter the 4 digit number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
            numReverse(num);

    }

    public static void numReverse(int n) {
        if (n < 10)
        {
            System.out.print(n);
            return;
        }
        else {
            System.out.print(n % 10);
            numReverse(n/10);
        }
    }
}