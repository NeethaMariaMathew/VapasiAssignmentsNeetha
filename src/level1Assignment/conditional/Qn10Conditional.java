package level1Assignment.conditional;

public class Qn10Conditional {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        int z=0;
        System.out.println("Expression a is "+ (x==2));
        System.out.println("Expression b is "+ (x!=5));
        System.out.println("Expression c is "+ (x!=5 && y>=5));
        System.out.println("Expression d is "+ (z!=0 || x==2));
        System.out.println("Expression e is "+ !(y<10));
    }
}
