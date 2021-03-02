package level1Assignment;

public class Qn6DataTypes {
    public static void main(String[] args) {
        char a = 'd';
        int value = a;
        int sum = value+3;
        char result = (char) sum;
        System.out.println("ASCII value of " +a+ " is " +value);
        System.out.println("Sum of above number and 3 is " + sum);
        System.out.println("Character equivalent for sum is "+result);
    }
}
