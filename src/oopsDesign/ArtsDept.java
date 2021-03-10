package oopsDesign;

public class ArtsDept extends Department{
    String MusicRoom;
    Library ArtsLib = new Library();
    Books ArtsBook1 = new Books("HP","15456","Yes","JKR");
   public void addBooks()
   {
       ArtsLib.addBooks(ArtsBook1);
   }
    public String setDepartment(Library l1,String MusicRoom) {
        DeptType = "Arts Department";
        return DeptType;
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
