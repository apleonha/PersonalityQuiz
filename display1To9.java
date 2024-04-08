// The Simplified Enneagram
// Emily Weed
// 08 April 2024
// These methods are primarily utilized to display information about each enneagram type. 

// Displays info for each type
private void display1To9() {
  JFrame frame = new JFrame("Enneagram Types");
  //Frame measurements

// Actual Info
  String[] typeInfo = {
    "Type 1: The Reformer: ....."
    //Display all enneagram types and in depth info about each type
  };

// Adds descriptions to text
  for(String info : typeInfo) {
    textArea.append(info + "\n");
  }

// Allows user to travel between pages
  JButton backButton = new JButton("Back to Homepage");
    //GUI for buttons
}
