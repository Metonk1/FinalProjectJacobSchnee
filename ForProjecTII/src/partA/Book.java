package partA;
//Basic instance variables of a book
//What about amount, you know like inventory how many copies currently have. Think about that. Well need an inventory class then or something. Because this creates the book for the stalls Then we can ask or set how many copies we currently possess
public class Book {

	private String title;
	private String author;
	private String genre;
	private double price;
	public Book(String title, String author, String genre,
			double price) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}
	//No Arg constructor just in case of emergencies
	public Book() {}

	//All the Getters and Setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}




}
