package level1Assignment.conditional;

import java.util.Scanner;

public class Qn8Conditional {
    public static void main(String[] args) {
        System.out.println("Enter the number of classes attended");
        Scanner input = new Scanner(System.in);
        double attendedClass = input.nextDouble();
        System.out.println("Enter the total number of classes held");
        double totalClass = input.nextDouble();
        double attendance = (attendedClass/totalClass)*100;
        System.out.println("Attendance percentage is "+attendance);
        if(attendance>=75)
            System.out.println("You are eligible to attend exam");
        else
            System.out.println("You are not eligible to attend exam");
    }
}
