package formultipleplanes;

//So far so good - Log 1 12:53, 12/1 - we got a good build on it, now we just need to actually implement the creation, the simple one for now, then well add the complex one
//How about creating another textfile, writing onto it basic information
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Pane4UserCreation {
	
	private HBox creatorBox, creatorBoxTwo, titleBox, btnBox;
	private VBox creatorV;
	private Label userLbl, passLbl;
	private TextField userField, passField;
	private Button createMeBtn, exitBtn, nextBtn;
	private PasswordField pb;
	
	//Well delete the createmeBtn
	public Pane4UserCreation(){
		
		titleBox = new HBox(10);
		creatorBox = new HBox(10); //For UserName Lbl and Field
		creatorBoxTwo = new HBox(10); //For password Lbl and Field
		creatorV = new VBox(10); //For Hboxes
		btnBox = new HBox(10); //For Buttons
		
		//Labels and TextFields for small
		userLbl = new Label("UserName: ");
		userField = new TextField();
		passLbl = new Label("Password: ");
		//passField = new TextField();
		
		//Create Account Button + Buttons
		createMeBtn = new Button("Create");
		exitBtn = new Button("Go Back");
		nextBtn = new Button("next");
		
		//Password
		pb = new PasswordField();
		
		//Scene title to jazz it up
		Text scenetitle = new Text("Create A User");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

		
		//Containers
		titleBox.getChildren().add(scenetitle);
		titleBox.setAlignment(Pos.TOP_CENTER);
		creatorBox.getChildren().addAll(userLbl, userField);
		creatorBoxTwo.getChildren().addAll(passLbl, pb);
		btnBox.getChildren().addAll(createMeBtn, exitBtn, nextBtn);
		btnBox.setAlignment(Pos.BOTTOM_CENTER);
		creatorV.getChildren().addAll(titleBox, creatorBox, creatorBoxTwo, btnBox);
		creatorV.setAlignment(Pos.CENTER);
	}
	
	public Pane getPane(){
		return creatorV;
	}
	
	public Button getCreateMebtn(){
		return createMeBtn;
	}
	
	public Button getExitButton(){
		return exitBtn;
	}
	
	public String getUserName() {
		return userField.getText();
	}
	
	public String getPassword() {
		return pb.getText();
	}
	
	public Button getNextBtn(){
		return nextBtn;
	}
}



/*HBox creatorBox = new HBox(10);
HBox creatorBoxTwo = new HBox(10);
VBox creatorV = new VBox(10);
creation = new Stage();
final Button createMeBtn = new Button("Create");

Label useLbl = new Label("UserName: ");
final TextField userField = new TextField();
Label passLbl = new Label("Password: ");
final TextField passField = new TextField();
creatorBox.getChildren().addAll(useLbl, userField);
creatorBoxTwo.getChildren().addAll(passLbl, passField);
creatorV.getChildren().addAll(creatorBox, creatorBoxTwo, createMeBtn);
creatorV.setAlignment(Pos.CENTER);
Scene scene2 = new Scene(creatorV,300,300);
creation.setScene(scene2);*/