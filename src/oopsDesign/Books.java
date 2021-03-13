package oopsDesign;

public class Books {
    String Name;
    String ISBN;
    String isBookRented;
    String Author;
    public static int countOfBooksRented=0;

    public Books(String Name,String ISBN,String isBookRented,String Author)
    {
        this.Name=Name;
        this.ISBN=ISBN;
        this.isBookRented=isBookRented;
        this.Author=Author;
        if(isBookRented.equalsIgnoreCase("Yes"))
            countOfBooksRented++;
    }

    public String getName() {
        return Name;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getIsBookRented() {
        return isBookRented;
    }

    public String getAuthor() {
        return Author;
    }

    public int countOfBooksRented()
    {
        return countOfBooksRented;
    }
}
