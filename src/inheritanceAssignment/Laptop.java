package inheritanceAssignment;

public class Laptop {
    public final String Name;
    public final double Price;
    public final String Processor;
    public final int Ram;
    public final String HardDrive;

    public Laptop(String Name, double Price, String Processor, int Ram, String HardDrive)
    {
        this.Name=Name;
        this.Price=Price;
        this.Processor=Processor;
        this.Ram=Ram;
        this.HardDrive=HardDrive;
    }
    public void print()
    {
        System.out.println("Name : "+Name);
        System.out.println("Price : $"+Price);
        System.out.println("Processor :"+Processor);
        System.out.println("Ram :"+Ram+"GB");
        System.out.println("HardDrive : "+HardDrive);
    }

}
