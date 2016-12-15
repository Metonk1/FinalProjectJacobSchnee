package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ButtonPane {

	private Button AnimeListBtn;
	private Button RandomAnimeGenerator;
	private HBox ButtonBox;
	
	public ButtonPane(){
		
		AnimeListBtn = new Button("Anime List");
		RandomAnimeGenerator=  new Button("Random Anime Generator");
		ButtonBox = new HBox(10);
		ButtonBox.getChildren().add(AnimeListBtn);
		ButtonBox.getChildren().add(RandomAnimeGenerator);
		//ButtonBox.setAlignment(Pos.CENTER);
	}
	
	
	public Button getAnimeListBtn(){
		return AnimeListBtn;
	}
	
	public Button getRandomAnimeGenerator(){
		return RandomAnimeGenerator;
	}
	
	public HBox getButtonBox(){
		return ButtonBox;
	}
	
}
