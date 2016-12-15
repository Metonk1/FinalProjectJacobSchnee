package view;
//Not for popups we created another stage
import model.MyEventListener;
import model.MyEventObject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//Well worry about design and finalizing gui later at another time
	//Idea 1 would be to use may be a title like before and modify it or see if we can animations to the Labels.

	//Another idea, what if we had a class for all the button actions or eventListeners idk

//I just had another idea, so what if in the beginning it was just the chooser and when you hit or when you click it will pop up a different Scene for each one!!!

//I remember seeing in javafx changing the button from like go or something, i know we can do something like that. 
//YOu know like a red light goes to green, green back to red. Something like that
//or  we just get the data and create a label, display up on the front!!!
//Something like this: http://docs.oracle.com/javafx/2/ui_controls/button.htm
//
//Heres another idea, what if instead of a gobackhomebtn we instead do a popup window 
//	that displays the results in may be a flashy animation or something or a text im not sure








//RIGHT NOW WE NEED TO LOOK INTO THE CONTROLLER, MYEVENTLISTENER AND MAKE SURE EVERYTHING WORKS and is put in the bag







public class MainPane  extends Application{

	//Instacne variables for input data as welll as bags
	private Button AnimeListBtn;
	private Button goBack;
	private Button AnimeGeneratorBtn;
	private Button chooseBtn;
	private Button goBackGeneratorBtn;
	private Button addAnimeBtn; 
	private Button okBtn;
	
	private Label results;
	
	Scene animeList;
	Scene animeGenerator;
	Scene addingAnimeScene;
	
	Stage addingStage;
	
	private MyEventListener okBtnListener;
	
	public void start(final Stage primaryStage) throws Exception {
		
		addingStage = new Stage();
		
		final HomePagePane homePage = new HomePagePane();
		AnimeListPane animeListPane = new AnimeListPane();
		final AnimeGeneratorPane animeGeneratorPane = new AnimeGeneratorPane();
		final AddAnimePane addAnime = new AddAnimePane();
		
		AnimeListBtn = homePage.getAnimeListBtn();
		goBack = animeListPane.getGoBackBtn();
		AnimeGeneratorBtn = homePage.getRandomAnimeGenerator();
		chooseBtn = animeGeneratorPane.getPickYourFate();
		goBackGeneratorBtn = animeGeneratorPane.goBackHome();
		addAnimeBtn = animeListPane.getAddAnimeBtn();
		okBtn = addAnime.getAddAnimeBtn();
		
																//Hor	//Ver
		animeList = new Scene(animeListPane.getAnimeListPane(), 400,300);
		addingAnimeScene = new Scene(addAnime.getAddPane(), 500,150);
	
		
		
		
		final Scene scene = new Scene(homePage.getHomePagePane(), 300, 300);
		final Scene animeGenerator = new Scene(animeGeneratorPane.getAnimeGeneratorPane(), 400,300);

		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		AnimeListBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if(e.getSource() == AnimeListBtn){
					primaryStage.setScene(animeList);
				}else{
					primaryStage.showAndWait();
				}
			}
		});
		
		goBack.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if(e.getSource() == goBack){
					primaryStage.setScene(scene);
				}else{
					primaryStage.showAndWait();
				}
			}
		});
		
		AnimeGeneratorBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if(e.getSource() == AnimeGeneratorBtn){
					primaryStage.setScene(animeGenerator);
					AnimeGeneratorBtn.setDisable(true);
				}else{
					primaryStage.showAndWait();
				}
			}
		});
		
		chooseBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if(e.getSource() == chooseBtn){
					animeGeneratorPane.theChoice();
					chooseBtn.setDisable(true);
					String result = animeGeneratorPane.getResults();
					homePage.setLabel(result);
					results = homePage.getLabel();
				}else{
					primaryStage.showAndWait();
					chooseBtn.setDisable(true);
				}
			}
		});
		
		goBackGeneratorBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if(e.getSource() == goBackGeneratorBtn){
					primaryStage.setScene(scene);
				}else{
					primaryStage.showAndWait();
				}
			}
		});
		
		addAnimeBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if(e.getSource() == addAnimeBtn){
					addingStage.setScene(addingAnimeScene);
					addingStage.show();
				}else{
					primaryStage.showAndWait();
				}
				
			}
		});
		
		okBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				String animeTitle = addAnime.getTitle();
				String animeGenre = addAnime.getGenre();
				String animeAuthor = addAnime.getAuthor();
				MyEventObject ev = new MyEventObject(this, animeTitle, animeGenre, animeAuthor);
				if(okBtnListener != null) {
					okBtnListener.okBtnClicked(ev);
				}
			}
		});
		
		
		/*okBtn.setOnAction(event -> {
			String name = nameField.getText();
			String id = idField.getText();
			MyEventObject ev = new MyEventObject(this, name, id);
			if(okBtnListener != null) {
				okBtnListener.okBtnClicked(ev);
			}
		});
		*/
		
		
	}	
	
	public static void main(String[] args){
		launch(args);
	}

}
