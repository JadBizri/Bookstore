import java.util.*;

public class BookStore{
    
    private ArrayList<Book> books = new ArrayList<Book>(); //to hold all available books
    private ArrayList<CD> CDs = new ArrayList<CD>(); //to hold all available CDs
    private ArrayList<DVD> DVDs = new ArrayList<DVD>(); //to hold all available DVDs
    private ArrayList<Member> memberList = new ArrayList<Member>(); //to hold all store's members
    private ArrayList<PremiumMember> premiumMemberList = new ArrayList<PremiumMember>(); //to hold all store's premium members
    private final double bookPrice = 19.99; //to hold the fixed price of each book
    private final double cdPrice = 11.99; //to hold the fixed price of each CD
    private final double dvdPrice = 14.99; //to hold the fixed price of each DVD

    /*
        no-arg constructor
    */
    public BookStore(){

        //default books available
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", bookPrice, 8, "J.K. Rowling", 1997);
        books.add(book1); //adding book to the books ArrayList
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", bookPrice, 11, "J.K. Rowling", 1998);
        books.add(book2);
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", bookPrice, 13, "J.K. Rowling", 1999);
        books.add(book3);

        //default CDs available
        CD cd1 = new CD("Star Wars (Soundtrack)", cdPrice, 4, "John Williams", 1977);
        CDs.add(cd1); //adding CD to the CDs ArrayList
        CD cd2 = new CD("Star Wars: The Force Awakens (Album)", cdPrice, 5, "John Williams", 2015);
        CDs.add(cd2);
        CD cd3 = new CD("Thriller (Album)", cdPrice, 7, "Michael Jackson", 1982);
        CDs.add(cd3);

        //default DVDs available
        DVD dvd1 = new DVD("Jurassic World: Dominion", dvdPrice, 13, "Colin Trevorrow", 2022);
        DVDs.add(dvd1); //adding dvd to the DVDs ArrayList
        DVD dvd2 = new DVD("Top Gun: Maverick", dvdPrice, 2, "Joseph Kosinski", 2022);
        DVDs.add(dvd2);
        DVD dvd3 = new DVD("Minions: The Rise of Gru", dvdPrice, 1, "Kyle Balda", 2022);
        DVDs.add(dvd3);

        //default members of the store
        Member member1 = new Member("Jose", "Sierra", 1, 1, 1);
        memberList.add(member1);
        Member member2 = new Member("Moe", "Salah", 1, 0, 0);
        memberList.add(member2);

        //default premium members of the store
        PremiumMember premiumMember1 = new PremiumMember("John", "Doe", 4, 0, 0, "Visa", true);
        premiumMemberList.add(premiumMember1); //adding premium member to the premiumMemberList ArrayList
        PremiumMember premiumMember2 = new PremiumMember("Jane", "Doe", 1, 0, 0, "Cash", false);
        premiumMemberList.add(premiumMember2);
    }

    /*
        getMemberList() Method that returns the memberList ArrayList
        @return ArrayList memberList that contains all bookstore members
    */
    public ArrayList<Member> getMemberList(){
        return memberList;
    }

    /*
        getBooks() Method that returns the books ArrayList
        @return ArrayList books that contains all bookstore's books
    */
    public ArrayList<Book> getBooks(){
        return books;
    }

    /*
        getCDs() Method that returns the CDs ArrayList
        @return ArrayList CDs that contains all bookstore's CDs
    */
    public ArrayList<CD> getCDs(){
        return CDs;
    }

    /*
        getDVDs() Method that returns the DVDs ArrayList
        @return ArrayList DVDs that contains all bookstore's DVDs
    */
    public ArrayList<DVD> getDVDs(){
        return DVDs;
    }

    /*
        getPremiumMemberList() Method that returns the premiumMemberList ArrayList
        @return ArrayList premiumMemberList that contains all bookstore's premium members
    */
    public ArrayList<PremiumMember> getPremiumMemberList(){
        return premiumMemberList;
    }

    /*
        addMember() Method that adds a member to the memberList ArrayList
        @param String name The first name of the member
        @param String surname The last name of the member
        @param int books The number of books bought by the member
        @param int CDs the number of CDs bought by the member
        @param int DVDs The number of DVDs bought by the member
    */
    public void addMember(String name, String surname, int books, int CDs, int DVDs){
        Member member = new Member(name, surname, books, CDs, DVDs);
        memberList.add(member);
    }

    /*
        addPremiumMember() Method that adds a premium member to the premiumMemberList ArrayList
        @param String name The first name of the premium member
        @param String surname The last name of the premium member
        @param int books The number of books bought by the premium member
        @param int CDs the number of CDs bought by the premium member
        @param int DVDs The number of DVDs bought by the premium member
        @param String payMethod The method pf payment used by the premium member
        @param boolean paid Whether the membership fee has been paid or not
    */
    public void addPremiumMember(String name, String surname, int books, int CDs, int DVDs, String payMethod, boolean paid){
        PremiumMember premiumMember = new PremiumMember(name, surname, books, CDs, DVDs, payMethod, paid);
        premiumMemberList.add(premiumMember);
    }

    /*
        addBook() Method that adds a book to the books ArrayList
        @param String name The book's name
        @param double price The book's price
        @param int books The amount of that particular book
        @param String authorName The book's author's name
        @param int year The year the book was published
    */
    public void addBook(String name, double price, int booksNum, String authorName, int year){
        Book book = new Book(name, price, booksNum, authorName, year);
        books.add(book);
    }

    /*
        addCD() Method that adds a CD to the CDs ArrayList
        @param String name The CD's name
        @param double price The CD's price
        @param int CDs The amount of that particular CD
        @param String producerName The CD's producer's name
        @param int year The year the CD was published
    */
    public void addCD(String name, double price, int CDsNum, String producerName, int year){
        CD cd = new CD(name, price, CDsNum, producerName, year);
        CDs.add(cd);
    }

    /*
        addDVD() Method that adds a DVD to the DVDs ArrayList
        @param String name The DVD's name
        @param double price The DVD's price
        @param int DVDs The amount of that particular DVD
        @param String directorName The DVD's director's name
        @param int year The year the DVD was published
    */
    public void addDVD(String name, double price, int DVDsNum, String directorName, int year){
        DVD dvd = new DVD(name, price, DVDsNum, directorName, year);
        DVDs.add(dvd);
    }

    /*
        getNumBooks() Method that returns the number of books the store has available
        @return int the number of books
    */
    public int getNumBooks(){
        return books.size();
    }

    /*
        getNumCDs() Method that returns the number of CDs the store has available
        @return int the number of CDs
    */
    public int getNumCDs(){
        return CDs.size();
    }

    /*
        getNumDVDs() Method that returns the number of DVDs the store has available
        @return int the number of DVDs
    */
    public int getNumDVDs(){
        return DVDs.size();
    }

    /*
        getBookPrice() Method that returns the price of a book
        @return int the price of a book
    */
    public double getBookPrice(){
        return bookPrice;
    }

    /*
        getCDprice() Method that returns the price of a CD
        @return int the price of a CD
    */
    public double getCDprice(){
        return cdPrice;
    }

    /*
        getDVDprice() Method that returns the price of a DVD
        @return int the price of a DVD
    */
    public double getDVDprice(){
        return dvdPrice;
    }
    
    /*
        removeBook() Method that removes a book from the books ArrayList
        @param index The index of the book that is to be removed from the ArrayList
    */
    public void removeBook(int index){
        books.remove(index);
    }

    /*
        removeCD() Method that removes a CD from the CDs ArrayList
        @param index The index of the CD that is to be removed from the ArrayList
    */
    public void removeCD(int index){
        CDs.remove(index);
    }

    /*
        removeDVD() Method that removes a DVD from the DVDs ArrayList
        @param index The index of the DVD that is to be removed from the ArrayList
    */
    public void removeDVD(int index){
        DVDs.remove(index);
    }

    /*
        removeMember() Method that removes a member from the memberList ArrayList
        @param index The index of the member that is to be removed from the ArrayList
    */
    public void removeMember(int index){
        memberList.remove(index);
    }

    /*
        removePremiumMember() Method that removes a premium member from the premiumMemberList ArrayList
        @param index The index of the premium member that is to be removed from the ArrayList
    */
    public void removePremiumMember(int index){
        premiumMemberList.remove(index);
    }

    /*
        startBookPurchase() Method that displays list of available books for purchase and lets user pick one to buy
        @param int loginChoice The corresponding member's list number
    */
    public void startBookPurchase(int loginChoice, int bookChoice){

        int index = 0; // to hold index of the corresponding member in the ArrayList
        loginChoice --; //loginChoice == index of member
        bookChoice --; //bookChoice == index of book

        //if member is regular
        if(loginChoice < memberList.size()){
            index = loginChoice; //index of the regular member in the memberList ArrayList

            //update the number of books bought by the corresponding regular member
            Member temp = memberList.get(index);
            temp.setNumOfBooksBought(temp.getNumOfBooksBought() + 1);
        }
        //otherwise if member is premium
        else{
            index = loginChoice - memberList.size(); //index of the premium member in the premiumMemberList ArrayList

            //update the number of books bought by the corresponding premium member
            PremiumMember temp = premiumMemberList.get(index);
            temp.setNumOfBooksBought(temp.getNumOfBooksBought() + 1);
        }

        //remove 1 book from inventory
        Book temp = books.get(bookChoice);
        temp.bookSold();

        //if last book was sold, remove book from books ArrayList
        if(temp.getNumBooks() == 0){
            removeBook(bookChoice);
        }
    }

    /*
        startCDPurchase() Method that displays list of available CDs for purchase and lets user pick one to buy
        @param int loginChoice The corresponding member's list number
    */
    public void startCDPurchase(int loginChoice, int cdChoice){

        int index = 0; // to hold index of the corresponding member in the ArrayList
        loginChoice --; //loginChoice == index of member
        cdChoice --; //cdChoice == index of CD

        //if member is regular
        if(loginChoice < memberList.size()){
            index = loginChoice; //index of the regular member in the memberList ArrayList

            //update the number of CDs bought by the corresponding regular member
            Member temp = memberList.get(index);
            temp.setNumOfCDsBought(temp.getNumOfCDsBought() + 1);
        }
        //otherwise if member is premium
        else{
            index = loginChoice - memberList.size(); //index of the premium member in the premiumMemberList ArrayList

            //update the number of CDs bought by the corresponding premium member
            PremiumMember temp = premiumMemberList.get(index);
            temp.setNumOfCDsBought(temp.getNumOfCDsBought() + 1);
        }
        
        //remove 1 CD from inventory
        CD temp = CDs.get(cdChoice);
        temp.cdSold();

        //if last CD was sold, remove CD from CDs ArrayList
        if(temp.getNumCDs() == 0){
            removeCD(cdChoice);
        }
    }

    /*
        startDVDPurchase() Method that displays list of available DVDs for purchase and lets user pick one to buy
        @param int loginChoice The corresponding member's list number
    */
    public void startDVDPurchase(int loginChoice, int dvdChoice){
        
        int index = 0; // to hold index of the corresponding member in the ArrayList
        loginChoice --; //loginChoice == index of member
        dvdChoice --; //dvdChoice == index of DVD

        //if member is regular
        if(loginChoice < memberList.size()){
            index = loginChoice; //index of the regular member in the memberList ArrayList

            //update the number of DVDs bought by the corresponding regular member
            Member temp = memberList.get(index);
            temp.setNumOfDVDsBought(temp.getNumOfDVDsBought() + 1);
        }
        //otherwise if member is premium
        else{
            index = loginChoice - memberList.size(); //index of the premium member in the premiumMemberList ArrayList

            //update the number of DVDs bought by the corresponding premium member
            PremiumMember temp = premiumMemberList.get(index);
            temp.setNumOfDVDsBought(temp.getNumOfDVDsBought() + 1);
        }
        
        //remove 1 DVD from inventory
        DVD temp = DVDs.get(dvdChoice);
        temp.dvdSold();

        //if last DVD was sold, remove DVD from DVDs ArrayList
        if(temp.getNumDVDs() == 0){
            removeDVD(dvdChoice);
        }
    }
}