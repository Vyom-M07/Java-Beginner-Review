import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		// JFrame = a GUI window to add components to
	/*
		JFrame frame = new JFrame(); // creates a frame
		frame.setTitle("JFrame title goes here"); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(false); // prevent frame from being resized
		frame.setLocationRelativeTo(null); // sets location of JFrame to middle
		frame.setSize(420, 420); // sets the x-dimension, and y-dimension of our frame
		frame.setVisible(true); // make frame visible

		ImageIcon image = new ImageIcon("earth.png"); // create an ImageIcon
		frame.setIconImage(image.getImage()); // change icon of frame
		frame.getContentPane().setBackground(new Color(123, 50, 250)); // change color of background
	*/
		
		new MyFrame(); // JFrames use a Border Layout by default
		
	}
}
