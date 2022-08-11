import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
		
		this.setTitle("JFrame title goes here"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent this from being resized
		this.setLocationRelativeTo(null); // sets location of JFrame to middle
		this.setSize(420, 420); // sets the x-dimension, and y-dimension of our this
		this.setVisible(true); // make this visible

		ImageIcon image = new ImageIcon("earth.png"); // create an ImageIcon
		this.setIconImage(image.getImage()); // change icon of this
		this.getContentPane().setBackground(new Color(0x123456)); // change color of background
	}
}
