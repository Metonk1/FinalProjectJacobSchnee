//So we can't extend it yet. We need to look into that part.
//Later on well collect the data to add to the controllers as well. 

//Need to organize my variable declarations on top, make it neater and easier
package formultipleplanes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import login.Password;

public class LoginScreen {
	private GridPane login;
	private Label userNameLbl, passwordLbl, message;
	private TextField userNameField, passwordField;
	private Button signInBtn, createUserBtn;
	private HBox btnBox;
	private PasswordField pb;
	
	public LoginScreen(){
		
		login = new GridPane();
		login.setHgap(5);
		login.setVgap(5);
		login.setPadding(new Insets(25,25,25,25));
		
		//Signin Labels w/ TextFields
		userNameLbl = new Label("UserName:");
		userNameField = new TextField();
		passwordLbl = new Label("Password:");
		//passwordField = new TextField();
		pb = new PasswordField();
		
		message = new Label(" ");
		
		login.add(userNameLbl, 0, 1);
		login.add(userNameField, 1, 1);
		login.add(passwordLbl, 0,2);
		login.add(pb, 1, 2);
		
		login.setAlignment(Pos.CENTER);
		
		Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        login.add(scenetitle, 0, 0, 2, 1);
        
        //Buttons w/ HBox
        signInBtn = new Button("Sign-in");
        createUserBtn = new Button("New User");
        btnBox = new HBox();
        
        btnBox.getChildren().addAll(signInBtn, createUserBtn);
        btnBox.setAlignment(Pos.BOTTOM_RIGHT);
        login.add(btnBox,1,3);
        
        login.add(message,1,4);
		
	}
	
	
	public Button getSignInBtn(){
		return signInBtn;
	}
	
	public Button getCreateUserBtn(){
		return createUserBtn;
	}
	
	
	
	
	
	//See which one works now.
	public Pane getPane(){
		return login;
	}
	
	public GridPane getGridPane(){
		return login;
	}
	
	//Textfield getters
	
	public String getUserName(){
		return userNameField.getText();
	}
	
	public String getPassWord(){
		return pb.getText();
	}
	
	//Label Message
	
	public Label getMessageLblSuccess(){
		message.setText("You have Logged in");
		return message;
	}
	
	public Label getMessageLblFailure(){
		message.setText("Try Again");
		return message;
	}
	

}
