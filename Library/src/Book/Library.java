/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author mrobert
 */
public class Library {
    // Add the missing implementation to this class
    String libraryLocation;
    int numOfBooks = 0;
    Book[] books = new Book[4];
       
    // Initiate Library Location
    public Library(String libraryLoc)
    {
        libraryLocation = libraryLoc;  
    }
    
    // Add a book to the library
    public void addBook(Book realBook)
    {
        books[numOfBooks] = realBook;
        numOfBooks += 1;
    }
    
    // Prints opening hours and address
    public static void printOpeningHours()
    {
    System.out.println("Library is open from 9AM to 5PM");
    }
    
    public void printAddress()
    {
        System.out.println(libraryLocation);
    }
    
    public void borrowBook(String bookName){
        
        if(numOfBooks < 1)
        {
            System.out.println("No books to borrow!");
            return;
        }
        for(int i = 0; i < books.length; i++)
        {
            if(books[i].title == bookName)
            {
                if(books[i].isBorrowed() == true)
                {
                    System.out.println("This book is already borrowed!");
                }

                else{
                    books[i].borrowed();
                }
            }
        }
    }
    
    public void printAvailableBooks(){
        if(numOfBooks < 1)
        {
            System.out.println("No books to available!");
            return;
        }
        for(int i = 0; i < books.length; i++)
        {
                if(books[i].isBorrowed() == false)
                {
                    System.out.println(books[i].title + "is available");
                }
            }
        }
    
    public void returnBook(String bookName){
        
        if(numOfBooks < 1)
        {
            System.out.println("Did not borrow a book from here!");
            return;
        }
        for(int i = 0; i < books.length; i++)
        {
            if(books[i].title == bookName)
            {
                if(books[i].isBorrowed() == true)
                {
                    books[i].returned();
                }

                else{
                    System.out.println("Book is already returned!");
                }
            }
        }
        
    }
        
    
    
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        
        System.out.println();
        
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

    }
} 
