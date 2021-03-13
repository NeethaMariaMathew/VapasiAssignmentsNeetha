package oopsDesign;

import java.util.ArrayList;
import java.util.List;

public class ArtsDepartment implements Facilities{

    @Override
    public Library setLibrary() {
        Books b1 = new Books("Harry Potter","1234","Yes","J K Rowling");
        Books b2 = new Books("Famous Five","9876","No","Enid Blyton");

        List<Books> book = new ArrayList<Books>();
        book.add(b1);
        book.add(b2);

        Furniture f1=new Furniture("chair","iron");
        Furniture f2=new Furniture("tables","wood");
        Furniture f3=new Furniture("racks","iron");
        Furniture f4=new Furniture("chair","wood");

        List<Furniture> furniture = new ArrayList<Furniture>();
        furniture.add(f1);
        furniture.add(f2);
        furniture.add(f3);

        Staff s1= new Staff(35,"Nimmy","Mathew");
        Staff s2= new Staff(40,"George","Thomas");

        List<Staff> staff = new ArrayList<Staff>();
        staff.add(s1);
        staff.add(s2);

        Library library = new Library(book,staff,furniture);
        return library;


    }

    @Override
    public void setMusicRoom() {
        System.out.println("Arts Department has Library");

    }

    @Override
    public void setLAB() {
        System.out.println("Arts Department does not have a LAB");
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

