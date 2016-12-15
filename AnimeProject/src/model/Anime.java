package model;
//Anime will be the first one
public class Anime {
	
	private String animeName;
	private String genre;
	//private String rating;
	private String author;
	public Anime(String animeName, String genre, String rating, String author) {
		super();
		this.animeName = animeName;
		this.genre = genre;
		//this.rating = rating;
		this.author = author;
	}
	public String getAnimeName() {
		return animeName;
	}
	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
/*	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}*/
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
