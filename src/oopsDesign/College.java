package oopsDesign;

import java.util.ArrayList;
import java.util.List;

public class College {
    public static void main(String[] args) {
       ArtsDepartment arts = new ArtsDepartment();
       Library libraryArts = arts.setLibrary();
       EngDepartment eng = new EngDepartment();
       Library libraryEng = eng.setLibrary();

       int totalNumberOfBooksInCollege = libraryArts.getCountOfTotalBooksInLibrary() + libraryEng.getCountOfTotalBooksInLibrary();
        int totalNumberOfStaffInCollege = libraryArts.getCountOfTotalStaffInLibrary() + libraryEng.getCountOfTotalStaffInLibrary();
        System.out.println("Total number of books in College = "+ totalNumberOfBooksInCollege);
        System.out.println("Total number of books rented = "+ Books.countOfBooksRented);
        System.out.println("Total number of chairs = "+Furniture.countOfChairs);
        System.out.println("Total number of staffs in College = "+totalNumberOfStaffInCollege);

       // Staff s1 = arts.getOldestMember();
        //Staff s2 = eng.getOldestMember();

        System.out.println("Age of eldest member working in Library is "+Staff.highestAge);




    }
}
