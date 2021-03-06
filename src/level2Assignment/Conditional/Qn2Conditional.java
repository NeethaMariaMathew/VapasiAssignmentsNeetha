package level2Assignment.Conditional;

import java.util.Scanner;

public class Qn2Conditional {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Enter sex M/F");
        String sex = input.next();
        System.out.println("Enter marital status Y/N");
        String marital = input.next();
        if (age < 20 || age > 60)
            System.out.println(" Age ERROR");
        if ((sex.equalsIgnoreCase("f")) && ((marital.equalsIgnoreCase("Y"))|| (marital.equalsIgnoreCase("N")))) {

                if (sex.equalsIgnoreCase("f"))
                System.out.println("Works in urban area");
            else if (age > 40 && age < 60)
                System.out.println("Works in urban area");
            else if (age > 20 && age <= 40)
                System.out.println("Work in anywhere");
        }
        else
            System.out.println("Invalid sex/marital status");

    }
}
