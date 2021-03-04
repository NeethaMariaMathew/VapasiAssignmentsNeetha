package level1Assignment.conditional;

import java.util.Scanner;

public class Qn6Conditional {
    public static void main(String[] args) {
        System.out.println("Enter age of first person");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter age of second person");
        int b = input.nextInt();
        System.out.println("Enter age of third person");
        int c = input.nextInt();
        if(a>=b)
        {
            if(a>=c)
                System.out.println(a + " is oldest");
            else
                System.out.println(c + " is oldest");
        }
        else
        {
            if(b>=c)
                System.out.println(b + " is oldest");
            else
                System.out.println(c + " is oldest");
        }
        if(a<=b && a<=c)
            System.out.println(a+ " is youngest");
            else if(b<=a && b<=c)
            System.out.println(b+ " is youngest");
            else
            System.out.println(c+ " is youngest");



    }
}
