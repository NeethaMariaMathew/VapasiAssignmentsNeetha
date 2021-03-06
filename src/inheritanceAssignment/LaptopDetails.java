package inheritanceAssignment;

public class LaptopDetails extends Laptop{

    public LaptopDetails(String Name,Double Price,String Processor,int Ram,String HardDrive)
    {
        super(Name,Price,Processor,Ram,HardDrive);
    }
    public static void main(String[] args) {

        LaptopDetails l1 = new LaptopDetails("Lenovo", 1000.0, "i3", 2, "500GB");
        l1.print();
        LaptopDetails l2 = new LaptopDetails("Dell",1500.0,"i5",4,"1TB");
        l2.print();
        LaptopDetails l3 = new LaptopDetails("Sony",2000.0,"i9",8,"1TB");
        l3.print();


    }
}
