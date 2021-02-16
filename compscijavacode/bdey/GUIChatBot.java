package bdey;

import javax.swing.*;
import java.awt.*;

public class GUIChatBot{
	public static void main(String[]args){
		 //Creating the Frame
        JFrame frame = new JFrame("FlightBot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 850);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        
        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter a message for FlightBot!");
        JTextField tf = new JTextField(75); // accepts upto 10 characters
        tf.setColumns(45);
        JButton send = new JButton("Send");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);

        // Text Area at the Center
        JTextArea ta = new JTextArea();
        ta.setSize(50,50);

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
	}
}