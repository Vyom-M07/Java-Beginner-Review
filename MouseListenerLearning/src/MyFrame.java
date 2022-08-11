import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame implements MouseListener, ActionListener {

	JLabel label;
	JPanel clickPanel;
	JLabel displayClicks;
	JPanel CPSPanel;
	public static JLabel displayCPS;
	JPanel countdownPanel;
	public static JLabel displayScores;
	JPanel scoresPanel;
	public static JLabel displayCountdown;
	JPanel panelTop;
	public static int clickCount = 0;
	Countdown countdown;
	JButton button5, button10, button15, button20;
	String[] answers = { "5", "10", "15", "20" };
	String answer;
	double totalClicks;

	MyFrame() {
		countdown = new Countdown(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750, 750);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		label = new JLabel();
		label.setBounds(275, 275, 100, 100);
		label.setBackground(Color.red);
		label.setText("Click Me");
		// Fix Alignment of Text Above so it's at the center of the JLabel
		label.setOpaque(true);
		label.addMouseListener(this);

		clickPanel = new JPanel();
		clickPanel.setBounds(0, 615, 375, 100);
		clickPanel.setBackground(Color.black);
		displayClicks = new JLabel();

		displayClicks.setBackground(Color.black);
		displayClicks.setForeground(Color.white);
		displayClicks.setFont(new Font("Sans", Font.PLAIN, 50));
		displayClicks.setText("0 Clicks");
		displayClicks.setOpaque(true);
		clickPanel.add(displayClicks);
		
		CPSPanel = new JPanel();
		CPSPanel.setBounds(375, 615, 375, 100);
		CPSPanel.setBackground(Color.red);
		displayCPS = new JLabel();
		
		displayCPS.setBackground(Color.red);
		displayCPS.setForeground(Color.blue);
		displayCPS.setFont(new Font("Sans", Font.PLAIN, 33));
		displayCPS.setText("Clicks Per Second");
		CPSPanel.add(displayCPS);
		
		countdownPanel = new JPanel();
		countdownPanel.setBounds(0, 515, 750, 100);
		countdownPanel.setBackground(Color.green);
		displayCountdown = new JLabel();
		
		displayCountdown.setBackground(Color.green);
		displayCountdown.setForeground(Color.black);
		displayCountdown.setFont(new Font("Sans", Font.PLAIN, 33));
		displayCountdown.setText("Seconds remaining: ");
		countdownPanel.add(displayCountdown);
		
		scoresPanel = new JPanel();
		scoresPanel.setBounds(0, 100, 750, 100);
		scoresPanel.setBackground(Color.yellow);
		displayScores = new JLabel();
		
		displayScores.setBackground(Color.yellow);
		displayScores.setForeground(new Color(115, 3, 252));
		displayScores.setFont(new Font("Sans", Font.PLAIN, 33));
		displayScores.setText("Best Score: ");
		scoresPanel.add(displayScores);
		
		panelTop = new JPanel();
		panelTop.setBounds(0, 0, 750, 100);
		panelTop.setLayout(new GridLayout(0, 4));
		button5 = new JButton();
		button10 = new JButton();
		button15 = new JButton();
		button20 = new JButton();
		JButton[] buttons = { button5, button10, button15, button20 };
		for (int i = 0; i < 4; i++) {
			panelTop.add(buttons[i]);
			buttons[i].addActionListener(this);
			answer = answers[i];
			buttons[i].setText(answer);
			// buttons[i].setFocusable(false);
		}
		panelTop.setBackground(Color.blue);
		panelTop.setVisible(true);

		this.add(label);
		this.add(panelTop);
		this.add(CPSPanel);
		this.add(countdownPanel);
		this.add(clickPanel);
		this.add(scoresPanel);
		this.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a
		// component
		// System.out.println("I clicked");

		// implementation of while loop "While countdown != 0"
		if (countdown.countdownTime >= 1) {
			if (e.getClickCount() >= 1 && e.getSource() == label) {
				clickCount++;
				displayClicks.setText(Integer.toString(clickCount) + " Clicks");

				// System.out.println(clickCount);
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button5 && countdown.countdownTime == 0) {
			countdown.setCountdown(Integer.parseInt(button5.getText()));
			if (!countdown.started) {
				countdown.startCountdown();
			} else {
				System.out.println("Not working1");
			}
		} else if (e.getSource() == button10 && countdown.countdownTime == 0) {
			countdown.setCountdown(Integer.parseInt(button10.getText()));
			if (!countdown.started) {
				countdown.startCountdown();
			} else {
				System.out.println("Not working2");
			}
		} else if (e.getSource() == button15 && countdown.countdownTime == 0) {
			countdown.setCountdown((Integer.parseInt(button15.getText())));
			if (!countdown.started) {
				countdown.startCountdown();
			} else {
				System.out.println("Not working3");
			}
		} else if (e.getSource() == button20 && countdown.countdownTime == 0) {
			countdown.setCountdown((Integer.parseInt(button20.getText())));
			if (!countdown.started) {
				countdown.startCountdown();
			} else {
				System.out.println("Not working4");
			}
		}
	}

}
