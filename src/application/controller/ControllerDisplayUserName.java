package application.controller;



import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerDisplayUserName {
	
	@FXML
	private Label nameLabel;
	
	public void displayName(String username) {
		nameLabel.setText("Hello: " +username);
	}
}
