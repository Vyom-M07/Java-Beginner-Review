import java.util.Scanner;

public class GameRunner {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter goal points: ");
		int gamePoint = console.nextInt();
		System.out.println("How many many sides do you want the die to have?");
		int faces = console.nextInt();
		console.nextLine();
		System.out.println("Player 1 name? >>>");
		String player1 = console.nextLine();
		System.out.println("Player 2 name? >>>");
		String player2 = console.nextLine();
		PigGame game = new PigGame(gamePoint, player1, player2, faces);
		game.printInstructions();
		game.play();

	}

}
