package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class PersonalityTest extends Application{
	public static ArrayList<Question> questionList = new ArrayList<>();
	public static ArrayList<DisplayQuestion> answers = new ArrayList<>();

	@Override
	public void start(Stage primaryStage) {
		try {
			// Create a scene by calling the getPane() method and place it in the stage
			Scene scene = new Scene(homePage(primaryStage), 600, 450);
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
		} catch(Exception e) {
			e.printStackTrace();
		}


	}

	public static void main(String[] args) {
		testQuestions();
		launch(args);
	}

	public static BorderPane homePage(Stage primaryStage) {
		//creating and labeling the pane
		BorderPane homePane = new BorderPane();
		Label titleLabel = new Label("The Simplified Enneagram");
		titleLabel.setFont(new Font("Arial", 28));

		//Center the label
		BorderPane.setAlignment(titleLabel, javafx.geometry.Pos.CENTER);
		homePane.setTop(titleLabel);

		Text description = new Text("The Enneagram is a personality typing tool used for better understanding"
				+ "a person's motivations, emotions, and beliefs and how they affect a person's patterns and behavior."
				+ "The Enneagram includes 9 distinct types to describe the different motivations and fears that contribute"
				+ "to someone's personality. While people may exhibit traits from various of the personality types,"
				+ "everyone has one dominant type. Find out yours by taking the test below!");
		description.setTextAlignment(TextAlignment.CENTER);
		description.setWrappingWidth(500);
		description.setFont(Font.font("Arial", 18));

		//Create button to take the test
		Button takeTest = new Button("Take the Test");
		takeTest.setMinSize(70, 50);
		takeTest.setOnAction(e  -> {
			Stage testStage = new Stage();
			testStage.setTitle("Take Test");
			testStage.setScene(takeTest(testStage));
			testStage.show();
		});

		//Create button for viewing the types
		Button viewTypes = new Button("View the 9 Types");
		viewTypes.setMinSize(70, 50);
		viewTypes.setOnAction(e  -> {
			Stage typesStage = new Stage();
			typesStage.setTitle("The 9 Enneagram Types");
			typesStage.setScene(DisplayType.createScene(typesStage, typesStage));
			typesStage.show();
		});

		//Create button to exit program
		Button exit = new Button("Exit\n");
		exit.setMinSize(70, 50);
		exit.setOnAction(e -> primaryStage.close());

		//Creating VBox to set and align buttons
		VBox menu = new VBox(20);
		menu.setAlignment(Pos.CENTER);
		menu.getChildren().addAll(description, takeTest, viewTypes, exit);

		homePane.setCenter(menu);

		return homePane;
	}



	public static void testQuestions() {
		Question q1 = new Question();
		q1.setTextQuestion("I am romantic and imaginative.");
		q1.setAnsA(3);
		q1.setAnsB(2);
		q1.setAnsC(4);
		questionList.add(q1);

		Question q2 = new Question();
		q2.setTextQuestion("I avoid confrontations.");
		q2.setAnsA(8);
		q2.setAnsB(1);
		q2.setAnsC(9);
		questionList.add(q2);

		Question q3 = new Question();
		q3.setTextQuestion("I am diplomatic and/or charming.");
		q3.setAnsA(5);
		q3.setAnsB(9);
		q3.setAnsC(3);
		questionList.add(q3);

		Question q4 = new Question();
		q4.setTextQuestion("I tend to be intense and focused ");
		q4.setAnsA(7);
		q4.setAnsB(5);
		q4.setAnsC(3);
		questionList.add(q4);

		Question q5 = new Question();
		q5.setTextQuestion("I tend to be spontaneous and adventurous.");
		q5.setAnsA(6);
		q5.setAnsB(8);
		q5.setAnsC(7);
		questionList.add(q5);

		Question q6 = new Question();
		q6.setTextQuestion("I am friendly and hospitable to new people.");
		q6.setAnsA(5);
		q6.setAnsB(7);
		q6.setAnsC(2);
		questionList.add(q6);

		Question q7 = new Question();
		q7.setTextQuestion("I am private and more reserved socially.");
		q7.setAnsA(7);
		q7.setAnsB(4);
		q7.setAnsC(5);
		questionList.add(q7);

		Question q8 = new Question();
		q8.setTextQuestion("I am known to have a quick temper.");
		q8.setAnsA(9);
		q8.setAnsB(6);
		q8.setAnsC(8);
		questionList.add(q8);

		Question q9 = new Question();
		q9.setTextQuestion("I am more street smart than idealistic.");
		q9.setAnsA(1);
		q9.setAnsB(8);
		q9.setAnsC(7);
		questionList.add(q9);

		Question q10 = new Question();
		q10.setTextQuestion("I maintain a certain distance from people rather than being overly affectionate.");
		q10.setAnsA(2);
		q10.setAnsB(6);
		q10.setAnsC(5);
		questionList.add(q10);

		Question q11 = new Question();
		q11.setTextQuestion("I choose activities and experiences based on what will be useful to me, "
				+ "as opposed to just what is enjoyable.");
		q11.setAnsA(7);
		q11.setAnsB(1);
		q11.setAnsC(3);
		questionList.add(q11);

		Question q12 = new Question();
		q12.setTextQuestion("I focus too much on myself. ");
		q12.setAnsA(9);
		q12.setAnsB(5);
		q12.setAnsC(4);
		questionList.add(q12);

		Question q13 = new Question();
		q13.setTextQuestion("I am valued for my insight and knowledge over my strength and decisiveness.");
		q13.setAnsA(8);
		q13.setAnsB(4);
		q13.setAnsC(5);
		questionList.add(q13);

		Question q14 = new Question();
		q14.setTextQuestion("I come across to others as being unsure of myself.");
		q14.setAnsA(8);
		q14.setAnsB(9);
		q14.setAnsC(6);
		questionList.add(q14);

		Question q15 = new Question();
		q15.setTextQuestion("I am more goal-oriented than relationship oriented.");
		q15.setAnsA(2);
		q15.setAnsB(5);
		q15.setAnsC(3);
		questionList.add(q15);

		Question q16 = new Question();
		q16.setTextQuestion("I am outspoken and speak up for myself and others.");
		q16.setAnsA(5);
		q16.setAnsB(9);
		q16.setAnsC(8);
		questionList.add(q16);

		Question q17 = new Question();
		q17.setTextQuestion("I am good at taking it easy and being flexible.");
		q17.setAnsA(1);
		q17.setAnsB(7);
		q17.setAnsC(9);

		Question q18 = new Question();
		q18.setTextQuestion("I am prone to hesitation and procrastination.");
		q18.setAnsA(3);
		q18.setAnsB(1);
		q18.setAnsC(6);
		questionList.add(q18);

		Question q19 = new Question();
		q19.setTextQuestion("I get in trouble with people for being to eager for them to depend on me.");
		q19.setAnsA(4);
		q19.setAnsB(2);
		q19.setAnsC(2);
		questionList.add(q19);

		Question q20 = new Question();
		q20.setTextQuestion("I am able to put my feelings aside before I have worked through them in order to get work done.");
		q20.setAnsA(4);
		q20.setAnsB(3);
		q20.setAnsC(9);
		questionList.add(q20);

		Question q21 = new Question();
		q21.setTextQuestion("I am not a risk-taker, but am more methodical and cautious.");
		q21.setAnsA(7);
		q21.setAnsB(1);
		q21.setAnsC(6);
		questionList.add(q21);

		Question q22 = new Question();
		q22.setTextQuestion("I am serious and reserved.");
		q22.setAnsA(7);
		q22.setAnsB(1);
		q22.setAnsC(5);
		questionList.add(q22);

		Question q23 = new Question();
		q23.setTextQuestion("I feel pressured to perform perfectly.");
		q23.setAnsA(9);
		q23.setAnsB(3);
		q23.setAnsC(1);
		questionList.add(q23);

		Question q24 = new Question();
		q24.setTextQuestion("I feel pressured to be a pillar of strength.");
		q24.setAnsA(7);
		q24.setAnsB(9);
		q24.setAnsC(8);
		questionList.add(q24);

		Question q25 = new Question();
		q25.setTextQuestion("I prioritize stability and my peace of mind.");
		q25.setAnsA(7);
		q25.setAnsB(9);
		q25.setAnsC(6);
		questionList.add(q25);

		Question q26 = new Question();
		q26.setTextQuestion("I am too skeptical.");
		q26.setAnsA(4);
		q26.setAnsB(1);
		q26.setAnsC(6);
		questionList.add(q26);

		Question q27 = new Question();
		q27.setTextQuestion("I am too sentimental.");
		q27.setAnsA(5);
		q27.setAnsB(2);
		q27.setAnsC(4);
		questionList.add(q27);

		Question q28 = new Question();
		q28.setTextQuestion("I worry about missing out on something better. ");
		q28.setAnsA(9);
		q28.setAnsB(6);
		q28.setAnsC(7);
		questionList.add(q28);

		Question q29 = new Question();
		q29.setTextQuestion("I worry about being taken advantage of. ");
		q29.setAnsA(8);
		q29.setAnsB(2);
		q29.setAnsC(6);
		questionList.add(q29);

		Question q30 = new Question();
		q30.setTextQuestion("I annoy people by being too stand-offish. ");
		q30.setAnsA(2);
		q30.setAnsB(6);
		q30.setAnsC(5);
		questionList.add(q30);

		Question q31 = new Question();
		q31.setTextQuestion("I enjoy telling people what to do.");
		q31.setAnsA(5);
		q31.setAnsB(3);
		q31.setAnsC(8);
		questionList.add(q31);

		Question q32 = new Question();
		q32.setTextQuestion("When going through a hard time, I can tune out the negative emotions.");
		q32.setAnsA(4);
		q32.setAnsB(7);
		q32.setAnsC(5);
		questionList.add(q32);

		Question q33 = new Question();
		q33.setTextQuestion("When I am having a hard time, I get myself a little (or a big) treat.");
		q33.setAnsA(9);
		q33.setAnsB(7);
		q33.setAnsC(7);
		questionList.add(q33);

		Question q34 = new Question();
		q34.setTextQuestion("I depend on my friends and they know they can depend on me.");
		q34.setAnsA(5);
		q34.setAnsB(6);
		q34.setAnsC(2);
		questionList.add(q34);

		Question q35 = new Question();
		q35.setTextQuestion("I am independent and prefer to do things on my own.");
		q35.setAnsA(7);
		q35.setAnsB(4);
		q35.setAnsC(5);
		questionList.add(q35);

		Question q36 = new Question();
		q36.setTextQuestion("I can be detached and/or preoccupied.");
		q36.setAnsA(4);
		q36.setAnsB(2);
		q36.setAnsC(5);
		questionList.add(q36);

		Question q37 = new Question();
		q37.setTextQuestion("I can be moody and self-absorbed.");
		q37.setAnsA(9);
		q37.setAnsB(1);
		q37.setAnsC(4);
		questionList.add(q37);

		Question q38 = new Question();
		q38.setTextQuestion("I am known for being a comforting presence to my friends.");
		q38.setAnsA(8);
		q38.setAnsB(2);
		q38.setAnsC(9);
		questionList.add(q38);

		Question q39 = new Question();
		q39.setTextQuestion("I might be described as earnest and self-disciplined.");
		q39.setAnsA(7);
		q39.setAnsB(8);
		q39.setAnsC(1);
		questionList.add(q39);

		Question q40 = new Question();
		q40.setTextQuestion("I am not shy about telling people what I do well.");
		q40.setAnsA(5);
		q40.setAnsB(8);
		q40.setAnsC(3);
		questionList.add(q40);

		Question q41 = new Question();
		q41.setTextQuestion("Comfort and security is more important to me than pursuing "
				+ "my personal interests.");
		q41.setAnsA(4);
		q41.setAnsB(9);
		q41.setAnsC(1);
		questionList.add(q41);

		Question q42 = new Question();
		q42.setTextQuestion("I withdraw when faced with conflict.");
		q42.setAnsA(8);
		q42.setAnsB(5);
		q42.setAnsC(9);
		questionList.add(q42);

		Question q43 = new Question();
		q43.setTextQuestion("I give in too easily and am often pushed around by others.");
		q43.setAnsA(8);
		q43.setAnsB(9);
		q43.setAnsC(2);
		questionList.add(q43);

		Question q44 = new Question();
		q44.setTextQuestion("People admire my positive attitude and great sense of humor.");
		q44.setAnsA(6);
		q44.setAnsB(9);
		q44.setAnsC(7);
		questionList.add(q44);

		Question q45 = new Question();
		q45.setTextQuestion("My successes have been acheive in spite of, rather than because of,"
				+ "my interpersonal skills.");
		q45.setAnsA(3);
		q45.setAnsB(6);
		q45.setAnsC(5);
		questionList.add(q45);

	}


public static Scene takeTest(Stage testStage) {
		
		//creating and labeling the pane
		//adding the header with title and instructions
		//organizing and formatting header
		BorderPane testPane = new BorderPane();
		VBox header = new VBox();
		Label title = new Label("The Enneagram Test");
		title.setFont(new Font("Arial", 28));

		Text instructions = new Text("Respond to each statement according to whether you feel"
				+ " it applies to you always, sometimes, or never. For best results, "
				+ "be sure to answer every question.");
		instructions.setWrappingWidth(450);
		instructions.setTextAlignment(TextAlignment.CENTER);
		
		Insets insets1 = new Insets(25);
		
		header.getChildren().addAll(title, instructions);
		header.setAlignment(Pos.CENTER);
		
		BorderPane.setAlignment(header, javafx.geometry.Pos.CENTER);
		testPane.setTop(header);
		BorderPane.setMargin(header, insets1);
		
		//Create button to exit program
		Button exit = new Button("Exit\n");
		exit.setMinSize(70, 50);
		exit.setOnAction(e -> testStage.close());

		VBox questionPane = new VBox();
		
		for(Question q : questionList) {
			DisplayQuestion dq = new DisplayQuestion(q);
			VBox pane = new VBox(dq.displayQ(q));
			questionPane.getChildren().add(pane);
			answers.add(dq);
		}
		HBox buttons = new HBox(); //for organizing the buttons
		
		//Create button to calculate score
		Button next = new Button("Next\n");
		next.setMinSize(70, 50);
		next.setOnAction(e -> {
			//declares new UserType instance 
			UserType user = new UserType();
			
		//searches all displayed questions and updates score according to answers
		//allows skipped questions (easier for testing purposes)
			for(DisplayQuestion dq : answers) {
				if(dq.getA().isSelected()) {
					user.updateScore(dq.getQ().getAnsA());
				} else if(dq.getB().isSelected()) {
					user.updateScore(dq.getQ().getAnsB());
				} else if(dq.getC().isSelected()) {
					user.updateScore(dq.getQ().getAnsC());
				} else
					continue;
			}
			
			//calculates type
			int[] array = user.scoreArray();
			int type = user.calculateType(array);
			
			//displays window for calculated type
			switch (type){
			case 1:
				Stage stage1 = new Stage();
				stage1.setTitle("Type 1: The Reformer");
				stage1.setScene(Display1to9.createScene("Type 1: The Reformer", stage1));
				stage1.show();
				testStage.close();
				break;
			case 2:
				Stage stage2 = new Stage();
				stage2.setTitle("Type 2: The Helper");
				stage2.setScene(Display1to9.createScene("Type 2: The Helper", stage2));
				stage2.show();
				testStage.close();
				break;
			case 3:
				Stage stage3 = new Stage();
				stage3.setTitle("Type 3: The Achiever");
				stage3.setScene(Display1to9.createScene("Type 3: The Achiever", stage3));
				stage3.show();
				testStage.close();
				break;
			case 4:
				Stage stage4 = new Stage();
				stage4.setTitle("Type 4: The Individualist");
				stage4.setScene(Display1to9.createScene("Type 4: The Individualist", stage4));
				stage4.show();
				testStage.close();
				break;
			case 5:
				Stage stage5 = new Stage();
				stage5.setTitle("Type 5: The Investigator");
				stage5.setScene(Display1to9.createScene("Type 5: The Investigator", stage5));
				stage5.show();
				testStage.close();
				break;
			case 6:
				Stage stage6 = new Stage();
				stage6.setTitle("Type 6: The Loyalist");
				stage6.setScene(Display1to9.createScene("Type 6: The Loyalist", stage6));
				stage6.show();
				testStage.close();
				break;
			case 7:
				Stage stage7 = new Stage();
				stage7.setTitle("Type 7: The Enthusiast");
				stage7.setScene(Display1to9.createScene("Type 7: The Enthusiast", stage7));
				stage7.show();
				testStage.close();
				break;
			case 8:
				Stage stage8 = new Stage();
				stage8.setTitle("Type 8: The Challenger");
				stage8.setScene(Display1to9.createScene("Type 8: The Challenger", stage8));
				stage8.show();
				testStage.close();
				break;
			case 9:
				Stage stage9 = new Stage();
				stage9.setTitle("Type 9: The Peacemaker");
				stage9.setScene(Display1to9.createScene("Type ", stage9));
				stage9.show();
				testStage.close();
				break;
			default:
				Text error = new Text("Error.");
				buttons. getChildren().add(error);
			
			}
			});
		
		//putting everything together
		buttons.getChildren().addAll(exit, next);
		buttons.setAlignment(javafx.geometry.Pos.BOTTOM_CENTER);
		testPane.setCenter(questionPane);
		Insets insets2 = new Insets(50);
		BorderPane.setMargin(questionPane, insets2);
		
		testPane.setBottom(buttons);
		

		ScrollPane sp = new ScrollPane();
		sp.setContent(testPane);
		sp.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);

		Scene testScene = new Scene(sp,500, 500);

		return testScene;
}

}}