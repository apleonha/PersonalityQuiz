package GroupProjectX;


public class UserType{
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
		
		int[] array = new int[]{t1, t2, t3, t4, t5, t6, t7, t8, t9};
	}
	
	//updates score based on user's answer to question
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
	
	int[] scoreArray(){
		int[] array = new int[]{t1, t2, t3, t4, t5, t6, t7, t8, t9};
		return array;
	}
	
	int calculateType(){
		int largest = 0;
		int[] array = scoreArray();
		
		for (int i = 0; i < array.length; i++){
			int current = array[i];
  			if (current > largest){
       			largest = current;
       		}
	}
	return largest;
	
}
}

class Question{
	String textQuestion;
	static String textA = "Never";
	static String textB = "Sometimes";
	static String textC = "Always";
	int ansA, ansB, ansC;
	

	//constructors
	public Question(){
		textQuestion = "";
		
	}
	
	public Question(String question, String a, String b, String c, int typeA, int typeB, int typeC){
		textQuestion = question;
		textA = a;
		textB = b;
		textC = c;
		
		ansA = typeA;
		ansB = typeB;
		ansC = typeC;
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
