public class Book{
    private int numBooks = 0; //to hold number of books available
    private double bookPrice = 0; //to hold book price
    private String bookName = ""; //to hold book's name
    private String bookAuthor = ""; //to hold book's author's name
    private int bookYear = 0; //to hold the year the book was published

    /*
        Constructor that accepts arguments for the book's name, available number, author's name, price, and year published
        @param int books The number of books currently available
        @param double price The price of the book
        @param String name The name of the book
        @param String authorName The name of the book's author
        @param int year The year the book was published
    */
    public Book(String name, double price, int books, String authorName, int year){
        numBooks = books;
        bookPrice = price;
        bookName = name;
        bookAuthor = authorName;
        bookYear = year;
    }

    /*
        getBookName() Method that returns the book's name
        @return String bookName The book's name
    */
    public String getBookName(){
        return bookName;
    }

    /*
        setBookName() Method that sets the book's name
        @param String name The book's name
    */
    public void setBookName(String name){
        bookName = name;
    }

    /*
        getNumBooks() Method that returns the number of books available
        @return int numBooks The amount of books available
    */
    public int getNumBooks(){
        return numBooks;
    }
    
    /*
        setNumBooks() Method that sets the number of books available
        @param int books The number of books to be set
    */
    public void setNumBooks(int books){
        numBooks = books;
    }

    /*
        getBookPrice() Method that returns the book's price
        @return double bookPrice The book's price
    */
    public double getBookPrice(){
        return bookPrice;
    }

    /*
        setBookPrice() Method that sets the book's price
        @param double price The book's price to be set
    */
    public void setBookPrice(double price){
        bookPrice = price;
    }

    /*
        getBookAuthor() Method that returns the book's author name
        @return String bookAuthor The book's author name
    */
    public String getBookAuthor(){
        return bookAuthor;
    }

    /*
        setBookAuthor() Method that sets the book's author name
        @param String authorName The book's author's name to be set
    */
    public void setBookAuthor(String authorName){
        bookAuthor = authorName;
    }

    /*
        getBookYear() Method that returns the book's year published
        @return int bookYear The book's year published
    */
    public int getBookYear(){
        return bookYear;
    }

    /*
        setBookYear() Method that sets the book's year published
        @param int year The book's year published
    */
    public void setBookYear(int year){
        bookYear = year;
    }

    /*
        bookSold() Method that removes 1 book from inventory when that book is sold
    */
    public void bookSold(){
        numBooks--;
    }
}