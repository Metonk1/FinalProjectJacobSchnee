//NextButton - to accumulate it. Worry about MVC Later, lets do basic. //May be a combox box or something
package formultipleplanes;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Pane4UserInfo {
	
	private Label nameLbl;
	private TextField nameField;
	private Button userCreate;
	private GridPane userGrid;
	
	public Pane4UserInfo(){
		
		userGrid = new GridPane();
		userGrid.setVgap(10);
		userGrid.setHgap(10);
		userGrid.setPadding(new Insets(25,25,25,25));
		
	}
	
	public GridPane getUserGrid(){
		return userGrid;
	}

}
