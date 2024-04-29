package application;

import java.util.HashMap;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Display1to9 {
	
	//storing all type info to be displayed
	private static HashMap<String, String> typeInformation = new HashMap<>();

	// info for each enneagram type
	static {
		typeInformation.put("Type 1: The Reformer", "Type 1 is principled, purposeful, self-controlled, and perfectionistic. "
				+ "Oftentimes, ones have a strong sense of right and wrong that encourages them to have higher expectations and improve everything they are involved in. "
				+ "At their best, ones are wise, realistic, noble, and morally heroic. "
				+ "At their worst, they may be judgemental, self-righteous, inflexible, and believing they are always right.");
		typeInformation.put("Type 2: The Helper", "Type 2 is generous, demonstrative, people-pleasing, and possessive. "
				+ "Oftentimes, twos experience a drive to be close with their peers and do whatever may be needed to make them happy. "
				+ "At their healthiest, twos are loving, sentimental, generous, and friendly. "
				+ "At their worst, twos may become manipulative, selfish, angry and bitter.");
		typeInformation.put("Type 3: The Achiever", "Type 3 is adaptable, excelling, driven, and image-conscious. "
				+ "Oftentimes, threes are highly conscious of status and always striving to be the best. "
				+ "At their healthiest, threes may be gentle, adaptable, charming, and ambitious - all while maintaining a high self esteem! "
				+ "At their worst, threes may become so invested in their status that they become jealous, devious, malicious, and untrustworthy. ");
		typeInformation.put("Type 4: The Individualist", "Type 4 is expressive, dramatic, self-absorbed, and tempermental. "
				+ "Fours seem to always be on a journey to find their true selves and purpose. "
				+ "At their best, fours are expressive, creative, inspired and introspective. "
				+ "At their worst, their fear of failure may drive them to become depressed, self-destructive, and have low self-esteem. ");
		typeInformation.put("Type 5: The Investigator", "Type 5 is perceptive, innovative, secretive, and isolated. "
				+ "Fives thrive on consuming knowledge and developing new ideas. Oftentimes, they linger on complex ideas and imaginary situations. "
				+ "At their best, fives are curious, intelligent, focused and innovative. "
				+ "At their worst, they may become reclusive, obsessive, and unstable.");
		typeInformation.put("Type 6: The Loyalist", "Type 6 is engaging, responsible, anxious, and suspicious."
				+ "Also known as the 'trouble-shooters,' sixes are known for their ability to work hard in order to solve problems. "
				+ "At their best, they are highly reliable, diligent, hard-working, and trustworthy."
				+ "At their worst, they may becomes defensive, anxious, and unable to deal with stress.");
		typeInformation.put("Type 7: The Enthusiast", "Type 7 is spontaneous, versatile, acquisitive and scattered. "
				+ "Oftentimes, they are extremely extroverted and playful - they are the life of the party! "
				+ "At their best, sixes are joyful, appreciative, and excitable."
				+ "At their worst, they may become anxious, impulsive, and panic-stricken. ");
		typeInformation.put("Type 8: The Challenger", "Type 8 is self-confident, decisive, willful, and confrontational. "
				+ "Oftentimes, eights have a strong exterior and believe they can achieve anything they put their mind through. "
				+ "At their best, they are courageous, heroic, influential, and decisive."
				+ "At their worst, eights may be brutally honest, delusional, and power obsessed.");
		typeInformation.put("Type 9: The Peacemaker", "Type 9 is receptive, reassuring agreeable, and complacent."
				+ "As described in their name, nines will do whatever it takes to avoid conflict and remain peace. "
				+ "At their best, they are supportive, present, and seek deep connections with their peers."
				+ "At their worst, nines tend to dissociate, become depersonalized, and avoid problems at all costs.");
	}
	
	//creating a scene to display info for prompted type
	public static Scene createScene(String type, Stage typeStage) {
		BorderPane typePane = new BorderPane();

		// displays
		Label typeLabel = new Label(type);
		typeLabel.setFont(new Font("Arial", 28));
		BorderPane.setAlignment(typeLabel, Pos.CENTER);

		String typeInfo = typeInformation.get(type);
		Text typeInfoLabel = new Text(typeInfo);
		typeInfoLabel.setWrappingWidth(500);

		// back button
		Button backButton = new Button("Back to Types");
		backButton.setOnAction(e -> {
			Stage typesStage = new Stage();
			typesStage.setTitle("The 9 Enneagram Types");
			typesStage.setScene(DisplayType.createScene(typesStage, typeStage));
			typesStage.show();
			typeStage.close();
		});

		//home button
		Button homeButton = new Button("Home");
		homeButton.setOnAction(e -> {
			typeStage.close();
			
		});

		VBox centerContent = new VBox(10);
		centerContent.setAlignment(Pos.CENTER);
		centerContent.getChildren().addAll(typeLabel, typeInfoLabel, backButton, homeButton);

		typePane.setCenter(centerContent);

		return new Scene(typePane, 600, 450);
	}
}
