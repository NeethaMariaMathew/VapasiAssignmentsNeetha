package level1Assignment.conditional;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Qn11Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        String choice = input.next();
        char ch = choice.charAt(0);
      if(isUpperCase(ch))
          System.out.println("Uppercase");
      else if(isLowerCase(ch))
          System.out.println("Lowercase");


    }
}
