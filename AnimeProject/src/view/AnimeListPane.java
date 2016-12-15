//Remember the idea is to keep a log of what we watched or Read, so we'll keep it different.
//Well the reading part will come later, first i just want to do anime then we'll modify it to accomodate Manga.
package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


//Find one we'll also give the option to edit
public class AnimeListPane {
	private TextArea text;
	private Button addAnimeBtn, findAnimeBtn, viewAnimeBtn, deleteAnimeBtn, goBackBtn;
	private Label findAnimeLbl;
	private TextField findAnimeField;
	private HBox lblFieldBox, listButtonBox;
	private VBox vHbox;
	
	public AnimeListPane(){
		
		text = new TextArea();
		addAnimeBtn = new Button("Add Anime");
		findAnimeBtn = new Button("Find Specific Anime");
		viewAnimeBtn = new Button("View All Anime");
		deleteAnimeBtn = new Button("Delete Anime");
		findAnimeField = new TextField();
		findAnimeLbl = new Label("Enter Anime Name: ");
		lblFieldBox = new HBox(10);
		vHbox = new VBox(10);
		listButtonBox = new HBox(5);
		goBackBtn = new Button("Go Back");
		
		//lblFieldBox.getChildren().add(findAnimeLbl);
		//lblFieldBox.getChildren().add(findAnimeField);
		lblFieldBox.getChildren().addAll(findAnimeLbl, findAnimeField, findAnimeBtn);
		
		listButtonBox.getChildren().addAll(addAnimeBtn,viewAnimeBtn, deleteAnimeBtn);
		//listButtonBox.getChildren().add(addAnimeBtn);
		//listButtonBox.getChildren().add(findAnimeBtn);
		//listButtonBox.getChildren().add(viewAnimeBtn);
		//listButtonBox.getChildren().add(deleteAnimeBtn);
		
		vHbox.getChildren().add(lblFieldBox);
		vHbox.getChildren().add(listButtonBox);
		vHbox.getChildren().add(text);
		vHbox.getChildren().add(goBackBtn);
		vHbox.setAlignment(Pos.CENTER);
		
		
		
		
	}
	
	
	public Button getAddAnimeBtn(){
		return addAnimeBtn;
	}
	
	public Button getFindAnimeBtn(){
		return findAnimeBtn;
	}
	
	public Button getViewAnimeBtn(){
		return viewAnimeBtn;
	}
	
	public Button getDeleteAnimeBtn(){
		return deleteAnimeBtn;
	}
	
	public TextField getAnimeText(){
		return findAnimeField;
	}
	
	public Pane getAnimeListPane(){
		return vHbox;
	}
	public Button getGoBackBtn(){
		return goBackBtn;
	}

}
