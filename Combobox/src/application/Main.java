package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		   FXMLLoader fxmlLoader = new FXMLLoader();
	        fxmlLoader.setLocation(getClass().getResource("micombo.fxml"));
	        Scene scene = new Scene(fxmlLoader.load());
	        stage.setTitle("prueba combo");
	        stage.setScene(scene);
	        stage.setMaximized(true);
	        stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
