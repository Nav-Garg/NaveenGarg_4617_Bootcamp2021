public enum BookFormat {
 hardcover,paperback,ebook,newspaper,magazine	
}
public enum BookStatus {
  available, reserved,loaned,lost
}
public enum ReservationStatus{
  waiting,pending,canceled,none
}
public enum AccountStatus{
  active, closed, canceled,blanklisted,none
}
public class Address {
  private String streetAddress;
  private String city;
  private String state;
  private String PinCode;
  private String country;
}
public class Person {
  private String name;
  private Address address;
  private String email;
  private String phone;
}

public class Constants {
  public static final int MAX_BOOKS_ISSUED_TO_A_USER = 5;
  public static final int MAX_LENDING_DAYS = 10;
}

//BookReservation, BookLending, and Fine
public class BookReservation {
  	private Date creationDate;
  	private ReservationStatus status;
  	private String bookItemBarcode;
  	private String memberId;
}

public class BookLending {
  	private Date creationDate;
  	private Date dueDate;
  	private Date returnDate;
  	private String bookItemBarcode;
  	private String memberId;
}

public class Fine {
  	private Date creationDate;
  	private String memberId;
  	public static void collectFine(String memberId, long days) {}
}

//Account, Member, and Librarian
public abstract class Account {
  	private String id;
  	private String password;
  	private AccountStatus status;
  	private Person person;
 	 public boolean resetPassword();
}

public class Librarian extends Account {
  	public boolean addBookItem(BookItem bookItem);
  	public boolean blockMember(Member member);
  	public boolean unBlockMember(Member member);
}

public class Member extends Account {
  	private Date dateOfMembership;
  	private int totalBooksCheckedout;
  	public int getTotalBooksCheckedout();
  	public boolean reserveBookItem(BookItem bookItem);
  	private void incrementTotalBooksCheckedout();
}
//BookItem
public abstract class Book {
  	private String title;
  	private String subject;
  	private String publisher;
  	private String language;
  	private int numberOfPages;
  	private List<Author> authors;
}

public class BookItem extends Book {
  	private String barcode;
  	private Date borrowed;
  	private Date dueDate;
  	private double price;
  	private BookFormat format;
  	private BookStatus status;
  	private Date dateOfPurchase;
  	private Date publicationDate;
  	public boolean checkout(String memberId) {
		//code	
	}
}
//Search interface 
public interface Search {
  	public List<Book> searchByTitle(String title);
  	public List<Book> searchByAuthor(String author);
  	public List<Book> searchBySubject(String subject);
}

public class Catalog implements Search {
  	private HashMap<String, List<Book>> bookTitles;
  	private HashMap<String, List<Book>> bookAuthors;
  	private HashMap<String, List<Book>> bookSubjects;

  	public List<Book> searchByTitle(String query) {
  	 	 // return all books 
    		return bookTitles.get(query);
  	}

  	public List<Book> searchByAuthor(String query) {
   	 	// return all books 
    		return bookAuthors.get(query);
  }
}
public class MainClass{
	public static void main(String arg[])
	{
		//code
	}
}

