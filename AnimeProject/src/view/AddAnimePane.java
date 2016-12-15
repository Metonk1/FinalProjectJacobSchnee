package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AddAnimePane {
	
	private Label animeTitleLbl, animeAuthorLbl, animeGenreLbl;
	private TextField animeTitleField, animeAuthorField, animeGenreField;
	private GridPane addPane;
	private Button addAnimeBtn;
	
	public AddAnimePane(){
		
		addPane = new GridPane();
		addPane.setHgap(5);
		addPane.setVgap(5);
		
		animeTitleLbl = new Label("Anime Title: ");
		animeTitleField = new TextField();
		animeAuthorLbl = new Label("Anime Author: ");
		animeAuthorField = new TextField();
		animeGenreLbl = new Label("Anime Genre: ");
		animeGenreField = new TextField();
		
		addAnimeBtn = new Button("Add Anime");
		
		addPane.add(animeTitleLbl, 0,0);
		addPane.add(animeTitleField,1,0);
		addPane.add(animeAuthorLbl, 0,1);
		addPane.add(animeAuthorField,1,1);
		addPane.add(animeGenreLbl, 0,2);
		addPane.add(animeGenreField,1,2);
		addAnimeBtn.setAlignment(Pos.CENTER);
		addPane.add(addAnimeBtn,1,3);
		
	}
	
	public GridPane getAddPane(){
		return addPane;
	}
	
	public Button getAddAnimeBtn(){
		return addAnimeBtn;
	}
	
	public String getTitle() {
		return animeTitleField.getText();
	}

	public String getAuthor() {
		return animeAuthorField.getText();
	}
	
	public String getGenre(){
		return animeGenreField.getText();
	}

	public void setTitle(String title) {
		animeTitleField.setText(title);
	}
	
	public void setAuthor(String author) {
		animeAuthorField.setText(author);
	}

	public void setGenre(String genre) {
		animeGenreField.setText(genre);
	}



}
