package arrayAssignment;

import java.util.*;

public class Qn1Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of unique car numbers required");
        int n = input.nextInt();
        while(n <= 0) {
            System.out.println("Number of unique car numbers should be greater than 0. Try again");
            n = input.nextInt();
        }
        int[] array = new int[n];
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= new Random().nextInt((9999-1000+1))+1000;
        }
       numbers [0] = array [0];
        for( int i = 0; i < n; i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(array[i]!=array[j])
                    numbers[j]=array[j];
                    else {
                        array[j] = array[j] + 10;
                        --j;
                    }
                }
            }
        for (int i = 0; i < n; i++)
            System.out.println("MH"+numbers[i]);
        }
}