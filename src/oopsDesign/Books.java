package oopsDesign;

public class Books {
    String Name;
    String ISBN;
    String isBookRented;
    String Author;
    public Books()
    {}
    public Books(String Name,String ISBN,String isBookRented,String Author)
    {
        this.Name=Name;
        this.ISBN=ISBN;
        this.isBookRented=isBookRented;
        this.Author=Author;
    }
}
