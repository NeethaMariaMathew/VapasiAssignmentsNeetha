package level1Assignment.Loops;

import java.util.Scanner;

public class Qn1Loops {
    public static void main(String[] args) {
        int count =1;
        double sum =0.0;
        while(count<=10)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number"+count);
            int i = input.nextInt();
            sum=sum+i;
            count++;
        }
        double avg = sum/10;
        System.out.println("Average of numbers is "+avg);

    }
}
