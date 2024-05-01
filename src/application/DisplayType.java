package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayType {
	//creates a scene to display the types menu
	public static Scene createScene(Stage typesStage, Stage primaryStage) {
		BorderPane typesPane = new BorderPane();

		// list with types
		ListView<String> listView = new ListView<>();
		listView.getItems().addAll(
				"Type 1: The Reformer", "Type 2: The Helper", "Type 3: The Achiever",
				"Type 4: The Individualist", "Type 5: The Investigator", "Type 6: The Loyalist",
				"Type 7: The Enthusiast", "Type 8: The Challenger", "Type 9: The Peacemaker"
				);
		//linking to specific windows for each type
		listView.setOnMouseClicked(e -> {
			Stage typeXStage = new Stage();
			String selectedType = listView.getSelectionModel().getSelectedItem();
			typeXStage.setScene(Display1to9.createScene(selectedType, typeXStage));
			typeXStage.show();
			typesStage.close();
		});

		//home button
		Button homeButton = new Button("Home");
		homeButton.setOnAction(e -> {
			Scene scene = new Scene(PersonalityTest.homePage(primaryStage), 600, 450);
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
			typesStage.close();
		});

		typesPane.setCenter(listView);
		typesPane.setBottom(homeButton);
		return new Scene(typesPane, 600, 450);
	}

}

