package level1Assignment.Loops;

public class Qn4Loops {
    public static void main(String[] args) {
        int i;
        String ch;
        for(i=1;i<=255;i++) {
            ch = Character.toString((char) i);
            System.out.println("ASCII value of " + i + " is " + ch);
        }
    }
}
