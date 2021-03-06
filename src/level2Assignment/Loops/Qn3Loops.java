package level2Assignment.Loops;

import java.util.Scanner;

public class Qn3Loops {
    public static void main(String[] args) {
        int x,n,sum;
        System.out.println("Below is the list of armstrong numbers between 100 and 500:");
       for(int i = 100; i <= 500; i++) {
            x = i;
            sum=0;
            while (i > 0)
            {
                n = i % 10;
                sum = sum + (n * n * n);
                i = i / 10;
            }
            if (x == sum)
                System.out.println(sum);
            i=x;
       }
    }
}
