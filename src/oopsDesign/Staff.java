package oopsDesign;

public class Staff {
    int age;
    String fName;
    String lName;
    public static int highestAge=0;

    public Staff(int age,String fName,String lName)
    {
        this.age=age;
        this.fName=fName;
        this.lName=lName;
        if(age>=highestAge)
            highestAge=age;
    }

    public int getAge() {
        return age;
    }
    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }

}
