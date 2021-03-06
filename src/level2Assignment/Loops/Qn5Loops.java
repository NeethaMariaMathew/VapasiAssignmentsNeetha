package level2Assignment.Loops;

import java.util.Scanner;

public class Qn5Loops {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                }
                if (count == 2)
                    System.out.println(i);
            }
        }
    }}