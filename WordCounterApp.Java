package task;


    // Importing necessary packages
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class WordCounterApp {

        public static void main(String[] args) {
            // Create a new frame (window)
            JFrame frame = new JFrame("Word Counter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200); // Set size of the window

            // Create a text area for inputting the paragraph
            JTextArea textArea = new JTextArea("Enter your text here...");
            textArea.setBounds(20, 20, 340, 60); // Position and size of the text area

            // Create a label to display the result
            JLabel resultLabel = new JLabel("Word Count: 0");
            resultLabel.setBounds(20, 100, 200, 30); // Position of the result label

            // Create a button to trigger the word counting action
            JButton countButton = new JButton("Count Words");
            countButton.setBounds(240, 100, 120, 30); // Position of the button

            // Add action listener to handle button click event
            countButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Get the text from the text area
                    String text = textArea.getText();
                    // Split the text by spaces and count the words
                    int wordCount = text.trim().split("\\s+").length;
                    // Display the word count
                    resultLabel.setText("Word Count: " + wordCount);
                }
            });

            // Add components to the frame
            frame.add(textArea);
            frame.add(resultLabel);
            frame.add(countButton);
            frame.setLayout(null); // Use absolute layout
            frame.setVisible(true); // Show the window
        }
    }


