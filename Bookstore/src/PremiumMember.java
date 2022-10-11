public class PremiumMember{
    private String firstName = ""; //to hold premium member's first name
    private String lastName = ""; //to hold premium member's last name
    private int booksBought = 0; //to hold the number of books bought by a customer
    private int CDsBought = 0; //to hold the number of CDs bought by a customer
    private int DVDsBought = 0; //to hold the number of DVDs bought by a customer
    private boolean feePaid = false; //to hold whether the monthly membership fee is paid or not
    private String payment = ""; //to hold the premium member's payment method
    private final double bookPrice = 19.99; //to hold the fixed price of each book
    private final double cdPrice = 11.99; //to hold the fixed price of each CD
    private final double dvdPrice = 14.99; //to hold the fixed price of each DVD
    private final double membershipPrice = 4.99; //to hold the fixed price of the premium membership

    /*
        Constructor that accepts arguments for the PremiumMember's name, PremiumMembership status, whether the membership fee is paid or not and number of books, CDs, and DVDs bought by that PremiumMember
        @param String name The first name of the PremiumMember
        @param String surname The last name of the PremiumMember
        @param int books The number of books bought by the PremiumMember
        @param int CDs The number of CDs bought by the PremiumMember
        @param int DVDs The number of DVDs bought by the PremiumMember
        @param boolean paid Whether the monthly membership fee has been paid or not
    */
    public PremiumMember(String name, String surname, int books, int CDs, int DVDs, String payMethod, boolean paid){
        firstName = name;
        lastName = surname;
        booksBought = books;
        CDsBought = CDs;
        DVDsBought = DVDs;
        payment = payMethod;
        feePaid = paid;
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
        setNumOfBooksBought() Method that sets the number of books bought by the PremiumMember
        @param int books The number of books the PremiumMember has bought
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
        setNumOfCDsBought() Method that sets the number of CDs bought by the PremiumMember
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
        setNumOfDVDsBought() Method that sets the number of DVDs bought by the PremiumMember
        @param int DVDs The number of DVDs bought by the customer
    */
    public void setNumOfDVDsBought(int DVDs){
        DVDsBought = DVDs;
    }

    /*
        getPaymentMethod() Method that returns the payment method of the premium member
        @return String The payment method of the premium member
    */
    public String getPaymentMethod(){
        return payment;
    }

    /*
        setPaymentMethod() Method that sets the payment method used by the PremiumMember
        @param String payMethod The payment method used by the premium member
    */
    public void setPaymentMethod(String payMethod){
        payment = payMethod;
    }

    /*
        getMembershipPaid() Method that returns whether the premium member has paid the membership fee or not
        @return boolean Whether the membership fee has been paid or not
    */
    public boolean getMembershipPaid(){
        return feePaid;
    }

    /*
        setMembershipPaid() Method that sets whether the premium member has paid the membership fee or not
        @param boolean paid Whether the membership fee has been paid or not
    */
    public void setPaymentMethod(boolean paid){
        feePaid = paid;
    }

    /*
        getMoneySpent() Method that returns the amount of money spent by the premium member
        @return double The amount of money the premium member has spent at the bookstore
    */
    public double getMoneySpent(){
        return booksBought * bookPrice + CDsBought * cdPrice + DVDsBought * dvdPrice;
    }
}