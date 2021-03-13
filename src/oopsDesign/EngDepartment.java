package oopsDesign;

import java.util.ArrayList;
import java.util.List;

public class EngDepartment implements Facilities{

    @Override
    public Library setLibrary() {
        Books b1 = new Books("Thermodynamics","7567","Yes","Fuder");
        Books b2 = new Books("Graphics","35245","No","Noha");

        List<Books> book = new ArrayList<Books>();
        book.add(b1);
        book.add(b2);

        Furniture f1=new Furniture("racks","iron");
        Furniture f2=new Furniture("tables","wood");
        Furniture f3=new Furniture("tables","iron");
        Furniture f4=new Furniture("chair","wood");

        List<Furniture> furniture = new ArrayList<Furniture>();
        furniture.add(f1);
        furniture.add(f2);
        furniture.add(f3);

        Staff s1= new Staff(53,"Nisha","Mathew");
        Staff s2= new Staff(49,"Abraham","Thomas");

        List<Staff> staff = new ArrayList<Staff>();
        staff.add(s1);
        staff.add(s2);

        Library library = new Library(book,staff,furniture);
        return library;
    }

    @Override
    public void setMusicRoom() {
        System.out.println("Engineering department does not have a music room");
    }

    @Override
    public void setLAB() {
        System.out.println("Engineering department has LAB");

    }

    @Override
    public Staff getOldestMember(List<Staff> staff) {
        int i;
        for(i=0;i<staff.size();i++)
        {
            if(staff.get(i).getAge()==Staff.highestAge)
                break;

        }
        return staff.get(i);
    }
}
