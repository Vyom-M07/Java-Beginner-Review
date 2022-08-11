
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
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class SnakeDisplay extends JComponent implements KeyListener, ActionListener {
	public static final int CELL_SIZE = 15;
	public static final int NUM_ROWS = 50;
	public static final int NUM_COLS = 50;
	// color of the snake
	private Color color;
	// The list of Nodes that make up the snake.
	private LinkedList<Node> body;

	// The direction that the snake is traveling in the x direction (across
	// columns).
	private int directionX = 0;

	// The direction that the snake is traveling in the y direction (across rows).
	private int directionY = -1;

	// The image that we will draw to the frame.
	private Image image;

	// The frame that will contain the image.
	private JFrame frame;

	// The node that represents the apple.
	private Node apple;
	
	

	// This method paints a row and column of our game grid a certain color.
	private void paint(int row, int col, Color color) {
		Graphics graphics = image.getGraphics();
		graphics.setColor(color);
		graphics.fillRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
	}

	// This method will draw a matrix on the screen to make it easier to navigate

	// This method randomly generates a new location for the apple and paints it to
	// the game grid.
	private void spawnApple() {
		int randomRow = (int) (Math.random() * NUM_ROWS);
		int randomCol = (int) (Math.random() * NUM_ROWS);
		apple = new Node(randomRow, randomCol);
		paint(randomRow, randomCol, Color.red);
	}

	// This method will paint our image to the frame. This method is part of the
	// JComponent class, so make sure you spell everything correctly.
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
		g.setColor(Color.white);
		g.setFont(new Font("DialogInput", Font.BOLD, 20));
		g.drawString("Your Score: " + body.size(), 20, 30);
		for (int i = 0; i < CELL_SIZE * NUM_ROWS; i++) {
			g.drawLine(i * CELL_SIZE, 0, i * CELL_SIZE, CELL_SIZE * NUM_ROWS);
			g.drawLine(0, i * CELL_SIZE, CELL_SIZE * NUM_ROWS, i * CELL_SIZE);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Node head = body.peekFirst();
		Node tail = body.peekLast();
		Node newHead = new Node(head.getRow() + directionY, head.getCol() + directionX);
		for (Node loop : body) {
			if (newHead.getRow() == loop.getRow() && newHead.getCol() == loop.getCol()) {
				System.out.println("You Lost LLLLLLLLLLLL Get Rekt Bozo + Ratio + Didn't ask");
				// System.exit(0);

				// bug in code when you are going a direction and change direction while also
				// pressing the opposite direction of the direction you were originally going,
				// game thinks the snake crashed into itself
				// ^easier to do on lower frame rate and only works when you are two rectangles
				// or larger
			}
		}
		if (newHead.getRow() <= -1 || newHead.getRow() >= 51 || newHead.getCol() <= -1 || newHead.getCol() >= 51) {
			System.out.println("You Lost LLLLLLLLLLLL Get Rekt Bozo + Ratio + Didn't ask");

			// System.exit(0);
		}
		
		body.addFirst(newHead);
		if (newHead.getCol() == apple.getCol() && newHead.getRow() == apple.getRow()) {
			spawnApple();
		} else {
			body.pollLast();
			paint(tail.getRow(), tail.getCol(), Color.black);
		}
		for (Node loop : body) {
			paint(loop.getRow(), loop.getCol(), color);
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

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			switch (directionY) {
			case -1 :
				directionY = -1;
				directionX = 0;
				break;
			case 0 :
				directionY = -1;
				directionX = 0;
				break;
			}
			/* if (directionY != 1) {
				directionY = -1;
				directionX = 0;
				

			}*/
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			switch (directionY) {
			case 1 :
				directionY = 1;
				directionX = 0;
				break;
			case 0 :
				directionY = 1;
				directionX = 0;
				break;
			}
			/* if (directionY != -1) {
				directionY = 1;
				directionX = 0;
				
			} */

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
			switch (directionX) {
			case 1 :
				directionY = 0;
				directionX = 1;
				break;
			case 0 :
				directionY = 0;
				directionX = 1;
				break;
			}
		/*	if (directionX != -1) {
				directionY = 0;
				directionX = 1;
				
			} */

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			switch (directionX) {
			case -1 :
				directionY = 0;
				directionX = -1;
				break;
			case 0 :
				directionY = 0;
				directionX = -1;
				break;
			}
			/* if (directionX != 1) {
				directionY = 0;
				directionX = -1;
				

			} */
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
	public SnakeDisplay(Color c) {
		color = c;
		body = new LinkedList<Node>();
		Node firstSegment = new Node(NUM_ROWS / 2, NUM_COLS / 2);
		body.addFirst(firstSegment);
		directionX = 0;
		directionY = -1;
		image = new BufferedImage(CELL_SIZE * NUM_COLS, CELL_SIZE * NUM_ROWS, BufferedImage.TYPE_INT_RGB);
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimension = new Dimension(CELL_SIZE * NUM_COLS, CELL_SIZE * NUM_ROWS);
		this.setPreferredSize(dimension);
		frame.add(this);
		frame.addKeyListener(this);
		frame.setTitle("Snake");
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		spawnApple();
	}
}
