package arrayAssignment;

import java.util.Random;
import java.util.Scanner;

public class Qn1Array {
    public static void main(String[] args) {
     int[] array =new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of unique car numbers required");
         int n = input.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<4;j++)
             array[j] = new Random().nextInt(9);
             System.out.print("MH");
             for(int j=0;j<4;j++)
                 System.out.print(array[j]);
             System.out.println();
         }
    }
}
