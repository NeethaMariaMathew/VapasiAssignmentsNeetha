package oopsDesign;

import java.util.ArrayList;
import java.util.List;


public class College {
    public static ArrayList<Staff> staffList = new ArrayList<Staff>();
    public static ArrayList<Furniture> furnitureList = new ArrayList<Furniture>();
    public static ArrayList<Library> libraries = new ArrayList<Library>();
    public static List<Books> booksList=new ArrayList<Books>();

    public static void main(String[] args)
    {
        ArrayList<Department> departments = new ArrayList<Department>();
        Library l1 = new Library();
        EngDept department1 = new EngDept();
        ArtsDept department2 = new ArtsDept();
        String departmentEng = department1.setDepartment("LAB",l1);
        String departmentArts = department2.setDepartment(l1,"Music Room");

    }
}
