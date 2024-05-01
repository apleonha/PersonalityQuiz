// The Simplified Enneagram
// Steven Pursley
// 8 April 2024
// These methods help create the homepage and also allow the user to take the enneagram personality test.

import java.util.HashMap;
import javax.swing.*;
import javax.swing.JTextArea;
import java.awt.*; 
import java.awt.event.*;

class Homepage {     
	private JTextArea textArea = new JTextArea(); 

public void displayHomePage() {         
	JFrame frame = new JFrame("Enneagram Personality Quiz");


String welcomeMessage = "Welcome to the Enneagram Personality Quiz!\n";

 String options = "Please select an option:\n1. Start Test\n2. View Enneagram Types\n3. Exit Program";

 textArea.append(welcomeMessage + options);

 JButton startTestButton = new JButton("Start Test");

startTestButton.addActionListener(new ActionListener() {
		@Override  
		public void actionPerformed(ActionEvent e) {
			TakeTest test = new TakeTest();                 
			test.startTest();
		}         
	}); 

	JButton viewTypesButton = new JButton("View Enneagram Types");

	viewTypesButton.addActionListener(new ActionListener() {
		@Override
		 public void actionPerformed(ActionEvent e) {
			displayTypes();             
		}         
	});

	JButton exitButton = new JButton("Exit Program"); 

	exitButton.addActionListener(new ActionListener() {
		@Override  
		public void actionPerformed(ActionEvent e) { 
			System.exit(0);             
		}         
	}); 

class TakeTest {     

	private JTextArea textArea = new JTextArea();     
	private int questionIndex = 0;
	private Question[] questions = new Question[];

public void startTest() {         
	displayQuestion();     
	} 

private void displayQuestion() {         
	if (questionIndex < questions.length) { 
		textArea.setText(questions[questionIndex].getTextQuestion());
			 } 
			else {             
				calculateResult();      
			}     
		} 




       	//call display method for calculated type
       	switch (type){
			case 1: 
				display1();
			case 2:
				display2();
				break;
			case 3:
				display3();
				break;
			case 4:
				display4();
				break;
			case 5:
				display5();
				break;
			case 6:
				display6();
				break;
			case 7:
				display7();
				break;
			case 8:
				display8();
				break;
			case 9:
				display9();
				break;
			}
	}

}
