package application;

import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayType {

	public static Scene createScene(Stage primaryStage) {
		BorderPane typesPane = new BorderPane();

		// list with types
		ListView<String> listView = new ListView<>();
		listView.getItems().addAll(
				"Type 1: The Reformer", "Type 2: The Helper", "Type 3: The Achiever",
				"Type 4: The Individualist", "Type 5: The Investigator", "Type 6: The Loyalist",
				"Type 7: The Enthusiast", "Type 8: The Challenger", "Type 9: The Peacemaker"
				);

		listView.setOnMouseClicked(e -> {
			String selectedType = listView.getSelectionModel().getSelectedItem();
			primaryStage.setScene(Display1to9.createScene(selectedType, primaryStage));
		});

		typesPane.setCenter(listView);
		return new Scene(typesPane, 600, 450);
	}

}
