public class Member{
    private String firstName = ""; //to hold member's first name
    private String lastName = ""; //to hold member's last name
    private int booksBought = 0; //to hold the number of books bought by a customer
    private int CDsBought = 0; //to hold the number of CDs bought by a customer
    private int DVDsBought = 0; //to hold the number of DVDs bought by a customer
    private final double bookPrice = 19.99; //to hold the fixed price of each book
    private final double cdPrice = 11.99; //to hold the fixed price of each CD
    private final double dvdPrice = 14.99; //to hold the fixed price of each DVD

    /*
        Constructor that accepts arguments for the member's name, membership status, and number of books, CDs, and DVDs bought by that member
        @param String name The first name of the member
        @param String surname The last name of the member
        @param int books The number of books bought by the member
        @param int CDs The number of CDs bought by the member
        @param int DVDs The number of DVDs bought by the member
    */
    public Member(String name, String surname, int books, int CDs, int DVDs){
        firstName = name;
        lastName = surname;
        booksBought = books;
        CDsBought = CDs;
        DVDsBought = DVDs;
    }

    /*
        getFirstName() Method that returns a PremiumMember's first name
        @return String The PremiumMember's first name
    */
    public String getFirstName(){
        return firstName;
    }

    /*
        setFirstName() Method that sets a PremiumMember's first name
        @param String name The first name of the PremiumMember to be set in the account
    */
    public void setFirstName(String name){
        firstName = name;
    }

    /*
        getLastName() Method that returns a PremiumMember's last name
        @return String The PremiumMember's last name
    */
    public String getLastName(){
        return lastName;
    }

    /*
        setLastName() Method that sets a PremiumMember's last name
        @param String surname The last name of the PremiumMember to be set in the account
    */
    public void setLastName(String surname){
        lastName = surname;
    }

    /*
        getNumOfBooksBought() Method that returns the number of books bought by the customer
        @return int The number of books bought by customer
    */
    public int getNumOfBooksBought(){
        return booksBought;
    }

    /*
        setNumOfBooksBought() Method that sets the number of books bought by the member
        @param int books The number of books the member has bought
    */
    public void setNumOfBooksBought(int books){
        booksBought = books;
    }

    /*
        getNumOfCDsBought() Method that returns the number of CDs bought by the customer
        @return int The number of CDs bought by customer
    */
    public int getNumOfCDsBought(){
        return CDsBought;
    }

    /*
        setNumOfCDsBought() Method that sets the number of CDs bought by the member
        @param int CDs The number of CDs bought by the customer
    */
    public void setNumOfCDsBought(int CDs){
        CDsBought = CDs;
    }

    /*
        getNumOfDVDsBought() Method that returns the number of DVDs bought by the customer
        @return int The number of DVDs bought by customer
    */
    public int getNumOfDVDsBought(){
        return DVDsBought;
    }

    /*
        setNumOfDVDsBought() Method that sets the number of DVDs bought by the member
        @param int DVDs The number of DVDs bought by the customer
    */
    public void setNumOfDVDsBought(int DVDs){
        DVDsBought = DVDs;
    }

    /*
        getMoneySpent() Method that returns the amount of money spent by the member
        @return double The amount of money the member has spent at the bookstore
    */
    public double getMoneySpent(){
        return booksBought * bookPrice + CDsBought * cdPrice + DVDsBought * dvdPrice;
    }
}