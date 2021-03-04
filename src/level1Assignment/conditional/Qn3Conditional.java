package level1Assignment.conditional;

import java.util.Scanner;

public class Qn3Conditional {
    public static void main(String[] args) {
        System.out.println("Enter quantity");
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int amount = q*100;
        if(amount>1000)
        {
            int bill = amount - ((amount*10)/100);
            System.out.println("Total cost is "+bill);
        }
        else
            System.out.println("Total cost is "+amount);
    }
}
