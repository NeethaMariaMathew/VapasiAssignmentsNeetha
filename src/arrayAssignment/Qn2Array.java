package arrayAssignment;

import java.util.Scanner;

public class Qn2Array {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0]="Sunday";
        days[1]="Monday";
        days[2]="Tuesday";
        days[3]="Wednesday";
        days[4]="Thursday";
        days[5]="Friday";
        days[6]="Saturday";
        System.out.println("Enter the number for the day to be displayed");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if(i>0 && i<7)
        System.out.println("The day is "+days[i]);
        else if(i==7)
            System.out.println("The day is "+days[0]);
        else
            System.out.println("Invalid day");



    }
}
