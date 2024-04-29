package application;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class UserType{
	//stores a score for the user for each type
	int t1, t2, t3, t4, t5, t6, t7, t8, t9;

	//constructor, initializes all scores to zero at beginning of test
	public UserType() {
		t1 = 0;
		t2 = 0;
		t3 = 0;
		t4 = 0;
		t5 = 0;
		t6 = 0;
		t7 = 0;
		t8 = 0;
		t9 = 0;

	}

	//updates score for specified type based on user's answer to each individual question
	public void updateScore(int type){
		switch (type){
			case 1:
				t1++;
				break;
			case 2:
				t2++;
				break;
			case 3:
				t3++;
				break;
			case 4:
				t4++;
				break;
			case 5:
				t5++;
				break;
			case 6:
				t6++;
				break;
			case 7:
				t7++;
				break;
			case 8:
				t8++;
				break;
			case 9:
				t9++;
				break;
			}
	}
	
	//storing user's score for traversal
	int[] scoreArray(){
		int[] array = new int[]{t1, t2, t3, t4, t5, t6, t7, t8, t9};
		return array;
	}
	
	//calculating which type had highest score for the user
	int calculateType(int[] array){
		int largest = 0;
		int type = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest){
       			largest = array[i];
       			type = i+1;
       		}
	}
	return type;


}
}



class Question{
	//stores questions, answers, and types corresponding to each answer
	String textQuestion;
	static String textA = "Never";
	static String textB = "Sometimes";
	static String textC = "Always";
	int ansA, ansB, ansC;


	//constructors
	public Question(){
		textQuestion = "";
		ansA = 0;
		ansB = 0;
		ansC = 0;
	}

	//set methods for all vars
	public void setTextQuestion(String text) {
		textQuestion = text;
	}

	public void setAnsA(int a) {
		ansA = a;
	}

	public void setAnsB(int b) {
		ansB = b;
	}

	public void setAnsC(int c) {
		ansC = c;
	}


	//get methods for all vars
	public String getTextQuestion() {
		return textQuestion;
	}

	public int getAnsA() {
		return ansA;
	}

	public int getAnsB() {
		return ansB;
	}

	public int getAnsC() {
		return ansC;
	}

}



class DisplayQuestion{
	//stores parts for displaying each question
	public RadioButton a;
	public RadioButton b;
	public RadioButton c;
	public ToggleGroup group;
	public Question q;
	
	//constructor, sets up all pieces given just the question
	public DisplayQuestion(Question q) {
		a = new RadioButton(Question.textA);
		b = new RadioButton(Question.textB);
		c = new RadioButton(Question.textC);
		
		group  = new ToggleGroup();

		a.setToggleGroup(group);
		b.setToggleGroup(group);
		c.setToggleGroup(group);
		this.q = q;
		
	}
	
	//get methods for each node
	public ToggleGroup getGroup() {
		return this.group;
	}
	
	public RadioButton getA() {
		return this.a;
	}
	
	public RadioButton getB() {
		return this.b;
	}
	
	public RadioButton getC() {
		return this.c;
	}
	
	public Question getQ() {
		return this.q;
	}
	
	//displays each question in its own pane and returns it
	public Pane displayQ(Question q) {
		VBox questionPane = new VBox();
		
		Text questionText = new Text(q.getTextQuestion());
		questionText.setWrappingWidth(350);
		
		questionPane.getChildren().addAll(questionText, this.a, this.b, this.c);
		return questionPane;
	}
}