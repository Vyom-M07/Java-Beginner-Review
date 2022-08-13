import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// JOptionPane = pop up a standard dialog box that prompts users for a value
		// 				 or informs them of something
		
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is more useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Your computer has a virus!", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call tech support now or else", "title", JOptionPane.ERROR_MESSAGE);	
		
// 		int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("What is your name?: ");
//		System.out.println("Hello " + name);
		
		String[] responses = {"No, you're awesome", "Thank you!", "*blush*"};
		ImageIcon icon = new ImageIcon("png-clipart-space-invaders-color-version-space-invader-wine-icon-thumbnail.png");
		
		JOptionPane.showOptionDialog(null,  "You are awesome", "secret nessage", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
	}
}
