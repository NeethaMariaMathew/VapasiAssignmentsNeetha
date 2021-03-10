package oopsDesign;

public class EngDept extends Department{
    String LAB;

    Library EngLib = new Library();
    Books EngBook1 = new Books("CO","768","No","GHY");
    public String setDepartment(String Lab,Library l1)
    {
        DeptType = "Engineering Department";
        return DeptType;
    }
    public void addBooks()
    {
        EngLib.addBooks(EngBook1);
    }

    public void addBooks(Library l1)
    {
        College.libraries.add(l1);
    }
    public void addStaff(Staff s1)
    {
        College.staffList.add(s1);
    }
    public void addFurniture(Furniture f1)
    {
        College.furnitureList.add(f1);
    }
}
