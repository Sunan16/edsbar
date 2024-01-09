package com.sunan.systemStoreDesk.application;

import java.io.IOException;
import java.net.URL;

import com.sunan.systemStoreDesk.gui.init.InitController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	private static Stage app;
	
	// 3 paginas (scenas)
	private static Scene sceneInit;
	
	/*
	// 3 paginas (scenas)
	private static Scene scene;
		
	// 3 paginas (scenas)
	private static Scene sceneInit;
		
	// 3 paginas (scenas)
	private static Scene sceneInit;
	*/
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		try {
			
			app = stage;
			
			Parent parentInit = new FXMLLoader(getURL(InitController.class, "init")).load();
			
			sceneInit = new Scene(parentInit);
			
			app.setOnCloseRequest(e -> closeProgramRotine());
			
			
			// sceneInit.getStylesheets().add("/gui/init/InitStyle.css");
			
			app.setScene(sceneInit);
			app.setResizable(false);
			app.show();

		} catch (IOException e) {

		}
		
	}
	
	private void closeProgramRotine() {
		
	}
	
	public static URL getURL(Class<?> c, String fileName) {
		return c.getResource(fileName + ".fxml");
	}
}
