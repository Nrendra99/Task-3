package manager.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	Scanner scanner=new Scanner(System.in);//creating object scanner to take input
	
	ArrayList <Book> books;                //creating ArrayList "books" to store Book objects
	public Library() {                     //constructor for library class initializing array list "books" 
		this.books=new ArrayList<Book>();
	}
	
	public void addBook(Book book){       //method to add book object to "books ArrayList
		books.add(book);
		System.out.println("Book Added: "+book);
	}
	
	public void removeBook(String ID) {   //method to remove book object from "books" ArrayList using book ID
		Book bookToRemove=null;           //declaring and initializing object "bookToRemove"
		
		for(Book book :books) {           //grabbing book object in array list "books" and going through them all with for loop 
			
			if (book.getID().equals(ID)) {//getting current book's ID an checking if it is equal to ID entered
				bookToRemove=book;        //setting "bookToRemove" with matching book
				break;                     //exiting the loop
			}
		}
		if (bookToRemove!=null) {         //if statement to remove "bookToRemove" from "book" ArrayList in case book was found
			books.remove(bookToRemove);
			System.out.println("Book Removed: "+ bookToRemove);
		}
		
		else {                            //else statement in case book ID not found 
			System.out.println("Book with ID "+ ID +" not found.");
		}
	}
	
	public void searchBook(String ID) {   //method to search book object from "books" ArrayList using book ID
		
		Book searchedBook=null;            //declaring and initializing object "searchedBook"
		for (Book book:books) {           //grabbing book object in ArrayList "books" and going through all of them with for loop 
			
			if(book.getID().equals(ID)) { //getting current book's ID an checking if it is equal to ID entered
		    searchedBook=book;            //setting "searchedBook" with matching book
			System.out.println(searchedBook); //printing matching book             
			} break;                          //exiting the loop
		}
		if(searchedBook==null) {          //if statement in case "searchedBook" was not found
			System.out.println("Book with ID " +ID+ " not found");
		}
	}
	
	 public void replaceBook(Book newBook) { // Method to replace an existing book in the "books" ArrayList with a new book
	        boolean replaced = false;        // Flag to check if book has been replaced
	        
	        for (int i = 0; i < books.size(); i++) { //regular for loop to go through all the books in ArrayList books since index is required
	            if (books.get(i).getID().equals(newBook.getID())) { //getting current book's ID with position in index an checking if it is equal to ID entered for new book
	                books.set(i, newBook);                          //replacing current book with new book in the ArrayList
	                System.out.println("Book replaced: " + newBook);
	                replaced = true;          //setting flag to true since new book has been replaced 
	                break;                    //exiting the loop
	            }
	        }

	        if (!replaced) {                 //in case not replaced 
	            System.out.println("Book with ID " + newBook.getID() + " not found."); 
	            System.out.print("Would you like to add this book instead? (yes/no): ");//option to add as new book
	            String response = scanner.nextLine();     //scanner to read input for response

	            if (response.equalsIgnoreCase("yes")) {   //if statement comparing input from user to the word "yes" ignoring case
	                books.add(newBook);                   //adding new book to ArrayList books 
	                System.out.println("Book added: " + newBook);
	            } else {                                  //in case user does not want to add 
	                System.out.println("Process closed. Book not added.");
	            }
	        }
	    }
	 
	 public void changeBookAvailability(String ID, boolean newAvailability) { //method to change availability of book 
		    boolean found= false;           // Flag to check if book is found
		    for (Book book : books) {       //grabbing book object in ArrayList "books" and going through all of them with for loop 
		        if (book.getID().equals(ID)) {  //getting current book's ID an checking if it is equal to ID entered
		            book.setAvailable(newAvailability);//setting new availability
		            if (newAvailability) {  // Checking if the new availability is true
		                System.out.println("Book with ID " +ID+ " is now available.");
		            } else {                //in case new availability false
		                System.out.println("Book with ID " +ID+ " is not available.");
		            }
		            found = true;           //setting flag to true since new book has been found 
		            break;                  //exiting the loop
		        }
		      }
		            if (!found) {           //if not found
		                System.out.println("Book with ID " + ID + " not found.");
		   }
		}
	public void display() {  //method to display all books 
		
		if (books.isEmpty()) { //in case no ArrayList books is empty 
			System.out.println("No books available in the library");
		}
		
		else {                //print all books in the ArrayList
			for (Book book:books)
				System.out.println(book);
			
	    }
	}
}
