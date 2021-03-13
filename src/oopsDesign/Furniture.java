package oopsDesign;

public class Furniture {
    String type;
    String material;
    public static int countOfChairs=0;
    public Furniture(String type,String material)
    {
        this.type=type;
        this.material=material;
        if(type.equalsIgnoreCase("chair"))
            countOfChairs++;
    }
    public int countOfChairs()
    {
        return countOfChairs;
    }
}
