package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//add javafx scene builder XML file
			Parent root = FXMLLoader.load(getClass().getResource("scene/Logout.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("css/Scene1.css").toExternalForm());
			//add scene to the stage
			primaryStage.setScene(scene);
			//to show windows
			primaryStage.show();
			
			//handlind the red X of the Stage (window)
			primaryStage.setOnCloseRequest(event -> {
				//The following line stop the event after execute the method logout.
				// This allow to not close the windows(stage),not propagate the event after excute the method
				event.consume();
				//execute method
				logout(primaryStage);
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		public void logout(Stage stage) {
		
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Logout");
			alert.setHeaderText("You're about to logout!");
			alert.setContentText("Do you want to logout ?: ");
			
			if(alert.showAndWait().get() == ButtonType.OK) {
				System.out.println("You succesfully logged out");
				stage.close();
			}
		
		}
	
		public static void main(String[] args) {
		launch(args);
	}
}
