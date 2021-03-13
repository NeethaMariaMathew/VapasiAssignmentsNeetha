package oopsDesign;

import java.awt.print.Book;
import java.util.List;

public class Library{

    private final List<Books> books;
    private final List<Staff> staffs;
    private final List<Furniture> furnitures;


    public Library(List<Books> books, List<Staff> staffs, List<Furniture> furnitures) {
        this.books = books;
        this.staffs = staffs;
        this.furnitures = furnitures;
    }

    public List<Books> getTotalBooksInLibrary() {
        return books;
    }

    public List<Staff> getTotalStaffsInLibrary() {
        return staffs;
    }

    public List<Furniture> getTotalFurnituresInLibrary() {
        return furnitures;
    }
    public int getCountOfTotalBooksInLibrary()
    {
        return books.size();
    }
    public int getCountOfTotalStaffInLibrary()
    {
        return staffs.size();
    }



}
