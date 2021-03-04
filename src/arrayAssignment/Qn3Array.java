package arrayAssignment;

import java.util.Scanner;

public class Qn3Array {
    public static void main(String[] args) {
        System.out.println("Enter the number of grades");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] grades = new int[n];
        int i,j,swap,avg = 0,sum=0;
        System.out.println("Enter the grades");
        for(i=0;i<n;i++)
        {
           grades[i]= input.nextInt();
           sum=sum+grades[i];
        }
        for( i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(grades[i]>grades[j])
                {
                    swap=grades[i];
                    grades[i]=grades[j];
                    grades[j]=swap;
                }

            }
        }
        avg=sum/n;
        System.out.println("Average is "+avg);
        System.out.println("Largest is "+grades[n-1]);
        System.out.println("Smallest is "+grades[0]);
    }
}
