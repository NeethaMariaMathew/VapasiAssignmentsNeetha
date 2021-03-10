package oopsDesign;

public class Staff {
    int age;
    String fName;
    String lName;

    public int getAge() {
        return age;
    }

    public Staff()
    {}
    public Staff(int age,String fName,String lName)
    {
        this.age=age;
        this.fName=fName;
        this.lName=lName;
    }

}
