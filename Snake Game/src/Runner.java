import java.awt.Color;
import javax.swing.Timer;

public class Runner {
	
	public static void main(String[] args) {
		SnakeDisplay snakegame = new SnakeDisplay(Color.green);
		Timer time = new Timer(42, snakegame);
		time.start();
		
	}
}
