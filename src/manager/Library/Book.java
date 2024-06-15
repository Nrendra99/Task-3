package manager.Library;

public class Book {
	
	String ID;      //creating instance variable for ID 
	String title;   //creating instance variable for title
	String Author;  //creating instance variable for Author
	boolean isAvailable;  //creating instance variable for Availability
	
	
	public Book(String ID, String title, String Author,boolean isAvailable) { //parameterized constructor with attributes to initialize object Book
		this.ID=ID;
		this.title=title;
		this.Author=Author;
		this.isAvailable=isAvailable;
	}


	public String getID() { //getters and setters methods for each variable 
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	@Override
	public String toString() {  //to string method to return representation of Book object
		return "Book [ID=" + ID + ", title=" + title + ", Author=" + Author + ", isAvailable=" + isAvailable + "]";
   }
}
