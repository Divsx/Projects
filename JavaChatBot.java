
			import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatBot {

        public static void main(String[] args) {
            // Create the main frame
            JFrame frame = new JFrame("ChatBot");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 700);
            frame.setLocationRelativeTo(null);
            frame.setLocation(50, 60);
            frame.getContentPane().setBackground(Color.PINK);

            // Set the layout manager for the frame
            frame.setLayout(new BorderLayout());

            // Create and add the initial label
            JLabel label = new JLabel("Unlock by clicking");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            frame.add(label, BorderLayout.CENTER);

            // Create the initial button
            JButton button = new JButton("Chat with ChatBot ;)");
            button.setPreferredSize(new Dimension(100, 30));  // Width: 100, Height: 30

            // Create a text field
            JTextField field = new JTextField();
            field.setBackground(Color.WHITE);

            // Create a text area for chat history
            JTextArea ta = new JTextArea();
            ta.setBackground(Color.lightGray);
            ta.setEditable(false);

            // Create the send button
            JButton sendButton = new JButton("Send");

            // Add ActionListener to the initial button
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Remove the button and label, add chat components
                    frame.remove(button);
                    frame.remove(label);
                    frame.add(new JScrollPane(ta), BorderLayout.CENTER);

                    // Add text field and send button to the bottom
                    JPanel bottomPanel = new JPanel();
                    bottomPanel.setLayout(new BorderLayout());
                    bottomPanel.add(field, BorderLayout.CENTER);
                    bottomPanel.add(sendButton, BorderLayout.EAST);
                    frame.add(bottomPanel, BorderLayout.SOUTH);

                    // Refresh the frame to show the changes
                    frame.revalidate();
                    frame.repaint();
                }
            });

            // Add ActionListener to the send button
            sendButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String userInput = field.getText();
                    if (userInput.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please enter a message.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    ta.append("You: " + userInput + "\n");

                    // Handle the chatbot response
                    String botResponse = getResponse(userInput);
                    ta.append("ChatBot: " + botResponse + "\n");

                    // Clear the text field
                    field.setText("");
                }
            });

            // Add the initial button to the frame
            frame.add(button, BorderLayout.SOUTH);

            // Make the frame visible
            frame.setVisible(true);
        }


        public static String getResponse(String userInput) {

            userInput = userInput.toLowerCase(); // Convert to lowercase for case-insensitive comparison

            switch (userInput) {
                case "hi":
                case "hello":
                case "hey":
                    return "HIIIIII! IT'S SO NICE TO MEET YOU!!!!!";
                case "yes":
                case "yup":
                case "yeah":
                    return "yassssss!!";
                case "no":
                case "nope":
                case "nah":
                case "not good":
                    return "oh ;(";
                case "how are you":
                case "you good?":
                case "whats up":
                    return "im good wby?";
                case "same":
                case "ok":
                case null:
                    return "okkie";
                case "good":
                case "great":
                case "awesome":
                    return "yayy ";
                default:
                    return "sorry i dont understand";
            }
        }

    }



					
		
		
		
