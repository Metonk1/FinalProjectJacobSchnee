//This will decide whether to watch Anime or Read Manga

//Idea #1 - we disabled the button for rerolling, but i have another idea, 
//	we will not disable the button for random, but we will change the scene, 
//	where instead will now just show what was chosen.
package view;

import java.util.Random;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class AnimeGeneratorPane {
	
	private Button randomAnimeBtn;
	private Label animeLbl;
	private Label mangaLbl;
	private HBox generatorBox;
	private VBox animeBox;
	private Random randomGenerator;
	private Button goBackHomeBtn;
	private Label result;
	
	private int randomInt;
	
	private HBox mangab;
	private HBox animeb;
	private HBox buttonBox;
	
	private String manga;
	private String anime;
	
	public AnimeGeneratorPane(){
		
		randomAnimeBtn = new Button("Pick your Fate!");
		animeLbl = new Label("Anime!!!");
		mangaLbl = new Label("Manga!!!");
		generatorBox = new HBox(10);
		animeBox = new VBox(10);
		goBackHomeBtn = new Button("Go Back Home");
		buttonBox = new HBox(5);
		
		mangab = new HBox(5);
		mangab.getChildren().add(mangaLbl);
		animeb = new HBox(5);
		animeb.getChildren().add(animeLbl);
		
		
		generatorBox.getChildren().add(randomAnimeBtn);
		generatorBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().add(goBackHomeBtn);
		buttonBox.setAlignment(Pos.TOP_LEFT);
		animeBox.getChildren().addAll(buttonBox, generatorBox);
		animeBox.setAlignment(Pos.CENTER);
	
		
	}
	
	
	public Pane getAnimeGeneratorPane(){
		return animeBox;
	}
	
	public Button getPickYourFate(){
		return randomAnimeBtn;
	}
	//i want to change it a bit to make it more fair
	public Label displayChosenChoice(){
		if(randomInt == 0){
		return animeLbl;
		}else{
			return mangaLbl;
		}
	}
	
		//Lets change it to a container
		public HBox theChoice(){
			randomGenerator  = new Random();
			 randomInt = randomGenerator.nextInt(100);
			if(randomInt%2 == 0){
				animeBox.getChildren().add(animeb);
				animeb.setAlignment(Pos.CENTER);
				//System.out.println("even:" + randomInt);
				return animeb;
			}else{
				animeBox.getChildren().add(mangab);
				mangab.setAlignment(Pos.CENTER);
				//System.out.println("odd" + randomInt);
				return mangab;
			}
		}
		
		public String getResults(){
			anime = "Anime!!!";
			manga = "Manga!!!";
			if(randomInt%2 == 0){
				return anime;
			}else{
				return manga;
		
			}
		}
		
		public Button goBackHome(){
			return goBackHomeBtn;
		}
	
	
/*	public  int Choice(){
		randomGenerator  = new Random();
		 randomInt = randomGenerator.nextInt(2);
		System.out.println(randomInt);
		return randomInt;
		
	}*/
	
	//Think about the random Choice

}
