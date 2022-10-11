public class DVD{
    private int numDVDs = 0;
    private double dvdPrice = 0;
    private String dvdName = "";
    private String dvdDirector = "";
    private int dvdYear = 0;

    /*
        Constructor that accepts arguments for the DVD's name, available number, director's name, price, and year published
        @param int DVDs The number of DVDs currently available
        @param double price The price of the DVD
        @param String name The name of the DVD
        @param String directorName The name of the DVD's director
        @param int year The year the DVD was published
    */
    public DVD(String name, double price, int DVDs, String directorName, int year){
        numDVDs = DVDs;
        dvdPrice = price;
        dvdName = name;
        dvdDirector = directorName;
        dvdYear = year;
    }

    /*
        getDVDname() Method that returns the DVD's name
        @return String dvdName The DVD's name
    */
    public String getDVDname(){
        return dvdName;
    }

    /*
        setDVDname() Method that sets the DVD's name
        @param String name The DVD's name
    */
    public void setDVDname(String name){
        dvdName = name;
    }

    /*
        getNumDVDs() Method that returns the number of DVDs available
        @return int numDVDs The amount of DVDs available
    */
    public int getNumDVDs(){
        return numDVDs;
    }

    /*
        setNumDVD() Method that sets the number of DVDs available
        @param int DVDs The amount of DVDs to be set
    */
    public void setnumDVDs(int DVDs){
        numDVDs = DVDs;
    }

    /*
        getDVDPrice() Method that returns the DVD's price
        @return double dvdPrice The DVD's price
    */
    public double getDVDPrice(){
        return dvdPrice;
    }

    /*
        setDVDPrice() Method that sets the DVD's price
        @param double price The DVD's price to be set
    */
    public void setDVDPrice(double price){
        dvdPrice = price;
    }

    /*
        getDVDdirector() Method that returns the DVD's director name
        @return String dvdDirector The DVD's director's name
    */
    public String getDVDdirector(){
        return dvdDirector;
    }

    /*
        setDVDdirector() Method that sets the DVD's director name
        @param String directorName The DVD's director's name to be set
    */
    public void setDVDdirector(String directorName){
        dvdDirector = directorName;
    }

    /*
        getDVDyear() Method that returns the DVD's year published
        @return int dvdYear The DVD's year published
    */
    public int getDVDyear(){
        return dvdYear;
    }

    /*
        setDVDYear() Method that sets the DVD's year published
        @param int year The DVD's year published
    */
    public void setDVDYear(int year){
        dvdYear = year;
    }

    /*
        dvdSold() Method that removes 1 DVD from inventory when that DVD is sold
    */
    public void dvdSold(){
        numDVDs--;
    }
}