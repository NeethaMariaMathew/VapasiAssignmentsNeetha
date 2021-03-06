package level2Assignment.Loops;

import java.util.Scanner;

public class Qn4Loops {
    public static void main(String[] args) {
        int count;
        System.out.println("Below is the list of prime numbers between 1 and 100:");
        for(int i=1;i<=100;i++)
        {
            count = 0;
           for(int j=1;j<=i;j++)
           {
                if(i%j == 0)
               count++;
            }
            if (count==2)
                System.out.println(i);

        }
    }
}
