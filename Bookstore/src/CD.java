public class CD{
    private int numCDs = 0; //to hold number of CDs available
    private double cdPrice = 0; //to hold CD price
    private String cdName = ""; //to hold name of CD
    private String cdProducer = ""; //to hold name of CD's producer
    private int cdYear = 0; //to hold the year the CD was published

    /*
        Constructor that accepts arguments for the CD's name, available number, producer's name, price, and year published
        @param int CDs The number of CDs currently available
        @param double price The price of the CD
        @param String name The name of the CD
        @param String authorName The name of the CD's author
        @param int year The year the CD was published
    */
    public CD(String name, double price, int CDs, String producerName, int year){
        numCDs = CDs;
        cdPrice = price;
        cdName = name;
        cdProducer = producerName;
        cdYear = year;
    }

    /*
        getCDname() Method that returns the CD's name
        @return String cdName The CD's name
    */
    public String getCDname(){
        return cdName;        
    }

    /*
        setCDname() Method that sets the CD's name
        @param String name The CD's name
    */
    public void setCDname(String name){
        cdName = name;
    }

    /*
        getNumCDs() Method that returns the number of CDs available
        @return int numCDs The amount of CDs available
    */
    public int getNumCDs(){
        return numCDs;
    }

    /*
        setNumCD() Method that sets the number of CDs available
        @param int CDs The amount of CDs to be set
    */
    public void setnumCDs(int CDs){
        numCDs = CDs;
    }

    /*
        getCdPrice() Method that returns the CD's price
        @return double cdPrice The CD's price
    */
    public double getCdPrice(){
        return cdPrice;
    }

    /*
        setCdPrice() Method that sets the CD's price
        @param double price The CD's price to be set
    */
    public void setCdPrice(double price){
        cdPrice = price;
    }

    /*
        getCdProducer() Method that returns the CD's producer name
        @return String cdProducer The CD's producer's name
    */
    public String getCdProducer(){
        return cdProducer;
    }

    /*
        setCdProducer() Method that sets the CD's producer name
        @param String producerName The CD's producer's name to be set
    */
    public void setCdProducer(String producerName){
        cdProducer = producerName;
    }

    /*
        getCdYear() Method that returns the CD's year published
        @return int cdYear The CD's year published
    */
    public int getCdYear(){
        return cdYear;
    }

    /*
        setCdYear() Method that sets the CD's year published
        @param int year The CD's year published
    */
    public void setCdYear(int year){
        cdYear = year;
    }

    /*
        cdSold() Method that removes 1 CD from inventory when that CD is sold
    */
    public void cdSold(){
        numCDs--;
    }
}