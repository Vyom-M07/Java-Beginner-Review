import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class WordleDisplay extends JComponent implements KeyListener, ActionListener {

	public int CELL_SIZE = 130;
	public static final int NUM_ROWS = 6;
	public static final int NUM_COLS = 5;

	private Image image;
	private JFrame frame;
	public String target;
	public String confirm = "";

	public ArrayList<char[]> letters = new ArrayList<char[]>();
	public ArrayList<String> guesses = new ArrayList<String>();
	public ArrayList<String> words;

	public String error = "None";
	public boolean over = false;

	private void setup() {
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, NUM_COLS * CELL_SIZE, NUM_ROWS * CELL_SIZE);
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, NUM_ROWS * CELL_SIZE, NUM_COLS * CELL_SIZE, CELL_SIZE);
	}

	private void drawGrid() {
		int i;
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.BLACK);
		for (i = 0; i < NUM_ROWS; i++) {
			graphics.drawLine(0, i * CELL_SIZE, NUM_ROWS * CELL_SIZE, i * CELL_SIZE);
		}
		for (i = 0; i < NUM_COLS; i++) {
			graphics.drawLine(i * CELL_SIZE, 0, i * CELL_SIZE, (NUM_COLS + 1) * CELL_SIZE);
		}
	}

	private void paint(int row, int col, Color color) {
		Graphics graphics = image.getGraphics();
		graphics.setColor(color);
		graphics.fillRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
	}

	private void text(double row, int col, String text, String e) {
		Graphics graphics = image.getGraphics();
		if (e == "None") {
			graphics.setColor(Color.BLACK);
			graphics.setFont(new Font("SansSerif Bold", Font.PLAIN, (int) (CELL_SIZE * 1.25)));
		} else {
			graphics.setColor(Color.WHITE);
			graphics.setFont(new Font("SansSerif Bold", Font.PLAIN, (int) (CELL_SIZE * 0.25)));
		}
		graphics.drawString(text, col * CELL_SIZE, (int) ((row + 1) * CELL_SIZE));
	}

	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}

	public WordleDisplay(String t, ArrayList<String> w) {
		image = new BufferedImage(NUM_COLS * CELL_SIZE, (NUM_ROWS + 1) * CELL_SIZE, BufferedImage.TYPE_INT_RGB);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(NUM_COLS * CELL_SIZE, (NUM_ROWS + 1) * CELL_SIZE));
		frame.add(this);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
		// frame.setAlwaysOnTop(true);
		target = t;
		words = w;
		setup();
		drawGrid();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setup();
		drawGrid();

		int i;
		for (i = 0; i < guesses.size(); i++) { 	
			for (int j = 0; j < 5; j++) {
				if (Character.isLetter(letters.get(i)[j])) {
					if (Character.isUpperCase(letters.get(i)[j])) {
						paint(i, j, Color.GREEN);
					} else {
						paint(i, j, Color.YELLOW);
					}
				} else {
					paint(i, j, Color.LIGHT_GRAY);
				}
				text(i, j, String.valueOf(guesses.get(i).charAt(j)).toUpperCase(), "None");
			}
		}
		if (i < 6) {
			for (int k = 0; k < confirm.length(); k++) {
				text(i, k, String.valueOf(confirm.charAt(k)), "None");
			}
		} else {
			over = true;
			text(5.75, 0, "The word was " + target + ". Nice try!", "");
		}
		if (guesses.size() > 0 && guesses.get(guesses.size() - 1).toLowerCase().equals(target)) {
			over = true;
			text(5.75, 0, "You win! The word was " + target + "!", "");
		}
		 if (error != "None") {
			text(5.75, 0, error, "");
		}
 
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		// try using a JTextField for this part
		if (!over) {
			String keycode = KeyEvent.getKeyText(e.getKeyCode());
			if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(keycode) && confirm.length() < 5) {
				confirm = confirm + keycode;
				error = "None";
			} else if (keycode == "Backspace" && confirm.length() > 0) {
				confirm = confirm.substring(0, confirm.length() - 1);
				error = "None";
			} else if (keycode == "Enter") {
				if (confirm.length() == 5) {

					if (words.contains(confirm.toLowerCase())) {
						System.out.println(confirm);
						Guess guess = new Guess(confirm.toLowerCase(), target);
						letters.add(guess.getResults());
						guesses.add(confirm);

						confirm = "";

					} else {
						error = "That is not a word!";
					}
				} else {
					error = "None";
				}
			}
		}

		actionPerformed(null);
	}
}
