package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerUsernameInput {
	
	@FXML
	TextField inputTextfFeld;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	 
	public void login(ActionEvent event) throws IOException {
		String username = inputTextfFeld.getText();
		//Create instance of controller
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../scene/DisplayUserName.fxml"));
		//retrive the root node of the scene
		root = loader.load();
		//retrive instance of the scene controller
		ControllerDisplayUserName controller = loader.getController();
		controller.displayName(username);
		
		//root = FXMLLoader.load(getClass().getResource("../scene/DisplayUserName.fxml"));
		//Retrieving stage from an event
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
