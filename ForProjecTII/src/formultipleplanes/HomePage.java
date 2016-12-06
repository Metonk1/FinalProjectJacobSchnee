package formultipleplanes;
//I need to look into the custom Eventhandler button
//What about using the already declared variables for both reading and wir
//Now we need to do is password
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

	
public class HomePage extends Application{

	private Stage creation;
	private String userName;
	private String password;
	
	private String loginUser;
	private String loginPass;
	
	private Label message;
	
	public void start(Stage stage) throws Exception {
	
		final LoginScreen login = new LoginScreen();
		final Pane4UserCreation uc = new Pane4UserCreation();
		
		final Button createUserBtn = login.getCreateUserBtn();
		creation = new Stage();
		Scene scene2 = new Scene(uc.getPane(),300,300);
		creation.setScene(scene2);
		
		final Button createUser = uc.getCreateMebtn();
		Button exit = uc.getExitButton();
		
		final Button signIn = login.getSignInBtn();
		//Textfield from pane4UserCreation
		
		
		
		
		//Create user Action pop-up window
		createUserBtn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				if(e.getSource() == createUserBtn){
					creation.showAndWait();
				}else{
					creation.close();
				}
			}
		});
		
		//Sign-in Time
		//Need to add Password protected
		//Need to change output to Label displays or something
		signIn.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				  Scanner inputFile = null;
					try {
						inputFile = new Scanner(new File("test.txt"));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					 //inputFile.useDelimiter(",");
					//String use = "b";
					//String pass = "b";
					
						 loginUser = login.getUserName();
	            	     loginPass = login.getPassWord();
	            	   
	            	  // String name, password;
	            	    while (inputFile.hasNext()) {
	            	        
	            	    	userName = inputFile.next();
	            	        password = inputFile.next();
	            	   
	            	        
	            	       //Login just goes directly to the username???
	            	       if ((loginUser.equals(userName)) && (loginPass.equals(password))) {
	            	            //System.out.println("Yay! Login Success");
	            	    	   message = login.getMessageLblSuccess();
	            	        }
	            	        else{
	            	        	//System.out.println("Boo! Login Fail");
	            	        	message = login.getMessageLblFailure();
	            	        }
	            	    }
			}
		});
		
		//Literally create it.
		createUser.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e){
				//System.out.println("Hi");
				if(e.getSource() == createUser){
        			userName = uc.getUserName();
        			password = uc.getPassword();
					//textUser = userField.getText();
        	        //textPass = passField.getText();
        	        
        	        //Write it onto a textfile
        	        
        	            BufferedWriter out = null;
						try {
							out = new BufferedWriter(new FileWriter("test.txt"));
							 out.write(userName);
							 out.newLine();
		        	          out.write(password);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						try {
							out.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
        	           
        	            
        	        
        	        
        	        //close at the end when success
        	        creation.close();

        		}

			}
		});
		
		
		//Scene scene = new Scene(login.getPane(),400,400);	//More or less this does work
		Scene scene = new Scene(login.getGridPane(),300,300);	//its the same results, but i don't know about the future.
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
