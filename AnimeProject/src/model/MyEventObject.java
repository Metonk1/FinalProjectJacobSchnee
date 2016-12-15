//Anime
package model;
//Hold off rating for a moment
import java.util.EventObject;

public class MyEventObject extends EventObject{
	private String animeName;
	private String author;
	private String genre;
	//private String rating;

	public MyEventObject(Object source) {
		super(source);
	}

	public MyEventObject(Object source, String animeName, String genre, String author) {
		super(source);
		this.animeName = animeName;
		this.genre = genre;
		//this.rating = rating;
		this.author = author;
	}

	public String getAnimeName() {
		return animeName;
	}

	public String getGenre() {
		return genre;
	}
	
	public String getAuthor(){
		return author;

}


}
