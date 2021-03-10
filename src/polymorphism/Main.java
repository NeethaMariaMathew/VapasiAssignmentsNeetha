package polymorphism;

public class Main {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Area area=new Area();
        Degree degree=new Degree();
        Undergraduate ug=new Undergraduate();
        Postgraduate pg=new Postgraduate();
        //Degree pg1=new Postgraduate();
        int i=6;
        double d=4.5;
        float f=8.9f;
        int l=4;
        int b=6;
     printNumber.println(i);
     printNumber.println(d);
     printNumber.println(f);
     area.findArea(l);
     area.findArea(l,b);
     degree.getDegree();
     ug.getDegree();
     pg.getDegree();
     //pg1.getDegree();
    }
}
