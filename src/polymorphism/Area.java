package polymorphism;

public class Area {
    public void findArea(int l,int b){
        System.out.println("Area of rectangle is "+ l*b);
    }
    public void findArea(int l)
    {
        System.out.println("Area of square is "+ l*l);
    }
}
