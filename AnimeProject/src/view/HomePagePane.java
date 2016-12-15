//Everything will extend for now to the homepage, where will make modfications
//https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class HomePagePane {

	private GridPane animePage;
	private ButtonPane buttonPane;
	private Label resultLbl;
	private AnimeGeneratorPane animeGen;
	
	public HomePagePane() {
	
		buttonPane = new ButtonPane();
		animePage = new GridPane();
		animePage.setHgap(5);
		animePage.setVgap(5);
		animePage.setPadding(new Insets(5,5,5,5));

		//Compromise time
		//resultLbl = new Label(animeGen.getResults());
		resultLbl = new Label();
		
		
		//Add to grid
		animePage.add(buttonPane.getButtonBox(), 0, 1);
		animePage.setAlignment(Pos.CENTER);
		//Now that works
		animePage.setStyle("-fx-background-color: #ffc0cb;");
		//Set title
		Text scenetitle = new Text("Welcome to MyAnime Applcation");
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 15));
        animePage.add(scenetitle, 0, 0, 1, 1);
        
     
        animePage.add(resultLbl,0,2);
		
		//Scene - to be deleted	
	}
	
	public Button getAnimeListBtn(){
		return buttonPane.getAnimeListBtn();
	}
	
	public Button getRandomAnimeGenerator(){
		return buttonPane.getRandomAnimeGenerator();
	}

	public GridPane getHomePagePane(){
		return animePage;
	}
	
	//We need a setter and getter
	public void setLabel(String name){
		resultLbl.setText(name);
	}
	public Label getLabel(){
		return resultLbl;
	}
}
