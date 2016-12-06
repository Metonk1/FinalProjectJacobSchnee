//REMEMBER DREXEL REMEMBER DUCA
//http://www.javafxtutorials.com/tutorials/creating-a-pop-up-window-in-javafx/


//For the most part it does work, we can always design it later but part I is complete
package loginwithuserinput;
//login will now do a check
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {


	private Stage creation;
	String textUser;
	String textPass;
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

         Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        final TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        final PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        //My Button
        final Button createBtn = new Button("Create User");
        HBox btnn = new HBox(10);
        btnn.setAlignment(Pos.BOTTOM_LEFT);
        btnn.getChildren().add(createBtn);
        
        hbBtn.getChildren().addAll(btn, btnn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        //Create user section
        HBox creatorBox = new HBox(10);
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
        creation.setScene(scene2);
        
 
        
        //Button Actions
        createBtn.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent e){
        		if(e.getSource() == createBtn){
        			creation.showAndWait();
        		}else{
        			creation.close();
        		}
  
        		
        	}
        });
        
        createMeBtn.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent e){
        		if(e.getSource() == createMeBtn){
        			textUser = userField.getText();
        	        textPass = passField.getText();
        	        
        	        //Write it onto a textfile
        	        
        	            BufferedWriter out = null;
						try {
							out = new BufferedWriter(new FileWriter("test.txt"));
							 out.write(textUser);
							 out.newLine();
		        	          out.write(textPass);
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
        
        //Now we need to do this, when craeting it we need to create a fiele as well, write it on it.
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
//The goal when creating an account is to create a textfile that will create the login for you
			public void handle(ActionEvent e) {
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
				
					String use = userTextField.getText();
            	   String pass = pwBox.getText();
            	   
            	   String name, password;
            	    while (inputFile.hasNext()) {
            	        
            	         name = inputFile.next();
            	        password = inputFile.next();
            	        if (name.equals(use)) {
            	            System.out.println("Yay! use");
            	       }
            	        else{
            	        	System.out.println("Boo! use");
            	        }
            	        
            	        
            	        if (password.equals(pass)) {
            	            System.out.println("Yay! pass");
            	       }
            	        else{
            	        	System.out.println("Boo! pass");
            	        }
            	        
            	        
            	       //Login just goes directly to the username???
            	       if ((use.equals(name)) && (pass.equals(password))) {
            	            System.out.println("Yay! Login Success");
            	        }
            	        else{
            	        	System.out.println("Boo! Login Fail");
            	        }
            	       
            	        //Log 1 - it works for single letters, so i just had c and then c in next line.
            	        //Log 2 - it didn't work with multiple, but i had stroke of luck. I believe that what they do is use a delimeter, a comma, keep both password and username together in one line, just a check right there
            	        
            	        //Well for now just start with c,c and then move into more complex patterns
            	        
            	        //Somethings worng with password when using delimeter
            	   
            	        //Gotta start paying attention to labels and textfields. Obviously that is why username wasn't registering, i was registering a label, which wouldn't match
            	   
            	       //Log 3- Alright we got a basic login, which is fine, were not going crazy, next is creating it.So when we create a new user, we creaete the textfile, that will be read!
            	    }

            	    inputFile.close();
            	// actiontarget.setFill(Color.FIREBRICK);
               // actiontarget.setText("Sign in button pressed");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
