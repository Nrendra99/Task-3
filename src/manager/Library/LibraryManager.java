package manager.Library;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class LibraryManager {

	public static void main(String[]args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader (System.in));//Creating BufferedReader object to take input 
		Library library=new Library();                                              //Creating object Library to implement its methods 
			
		int choice;   //creating variable choice to store users choice 

		do { // Printing 7 different choices for the user 
			System.out.println(" Library Management System");
			System.out.println(" 1. Add Book:");
			System.out.println(" 2. Remove Book");
			System.out.println(" 3. Search Book");
			System.out.println(" 4. Display Books:");
			System.out.println(" 5. Replace Book:");
			System.out.println(" 6. Change Book Availability");
			System.out.println(" 7. Exit");
			
			choice =Integer.parseInt(reader.readLine()); //reading and parsing the choice and storing in the choice variable
			
			switch (choice) {  //using switch argument to keep the choice constant
			
			case 1: //filling in and storing the attributes we have defined in book class 
				System.out.println("Add Book ID: ");
				String ID=reader.readLine();
				System.out.println("Add Title: ");
				String title=reader.readLine();
				System.out.println("Add Author: ");
				String Author=reader.readLine();
				System.out.println("Is Availabie (True/False): ");
				boolean isAvailbale=Boolean.parseBoolean(reader.readLine());
				
				Book book =new Book(ID,title,Author,isAvailbale);//creating new book and storing In Book array list
				library.addBook(book);break;//implementing method to add book 
				
			
			case 2://implementing method to remove book 
				System.out.println("Enter Book ID to Remove: ");
				String removeID=reader.readLine();
				library.removeBook(removeID);break;
			
			case 3://implementing method to search book 
				System.out.println("Enter Book ID to Search: ");
				String searchID=reader.readLine();
				library.searchBook(searchID);break;
			
			case 4://implementing method to display books	
				library.display();break;
			
			case 5://implementing method to replace books or add the book if ID does not exist 
				System.out.println("Enter Book ID to Replace: ");
				String replaceID=reader.readLine();
				System.out.println("Add Title: ");
				String newtitle=reader.readLine();
				System.out.println("Add Author: ");
				String newAuthor=reader.readLine();
				System.out.println("Is Availabie (True/False): ");
				boolean newisAvailbale=Boolean.parseBoolean(reader.readLine());
				Book newBook =new Book(replaceID,newtitle,newAuthor,newisAvailbale);
				library.replaceBook(newBook)
				;break;
			case 6://implementing method to change book availability
			    System.out.print("Enter Book ID to change availability: ");
			    String changeID = reader.readLine();
			    System.out.print("Enter new availability (true/false): ");
			    boolean newAvailability = Boolean.parseBoolean(reader.readLine());
			    library.changeBookAvailability(changeID, newAvailability);
			    break;
			case 7://Exiting
				System.out.println("Exiting.. ");break;
			default:System.out.println("Invalid choice. Please try again");	//default option gives invalid choice message	
			}
			

		 
	  } while(choice !=7);//ends the program if 7 is entered or allows loop to start again since it is exit controlled loop 
   }
}

