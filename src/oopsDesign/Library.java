package oopsDesign;

import java.util.ArrayList;
import java.util.List;

public class Library{

    public void addBooks(Books b1)
    {
        College.booksList.add(b1);
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
