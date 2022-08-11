
public class PigGame {
	Player player1;
	Player player2;
	Die die;
	int goal;
	
	boolean turn = true;
	
	
	public PigGame(int goalPoints, String p1, String p2, int faces) {
		goal = goalPoints;
		player1 = new Player(p1);
		player2 = new Player(p2);
		die = new Die(faces);
	}
	
	public void play() {
		while (player1.getScore() < goal && player2.getScore() < goal) {
			player1.takeTurn(die);
			if (player1.getScore() < goal && player2.getScore() < goal) {
				player2.takeTurn(die);
			}
		}
		if (player1.getScore() >= goal) {
			System.out.println(player1.getName() + " wins!");
		}
		else {
			System.out.println(player2.getName() + " wins!");
		}
	}
	public void printInstructions() {
		System.out.println("The game of Pig is a very simple jeopardy dice game in which two players race to reach 100 points. \n"
				+ "Each turn, a player repeatedly rolls a die until either a 1 is rolled or the player holds and scores the sum of the rolls (i.e. the turn total).\n"
				+ "At any time during a player's turn, the player is faced with two decisions:\r\n"
				+ "\r\n"
				+ "roll - If the player rolls a\r\n"
				+ "1: the player scores nothing and it becomes the opponent's turn.\r\n"
				+ "2 - 6: the number is added to the player's turn total and the player's turn continues.\r\n"
				+ "\n"
				+ "hold - The turn total is added to the player's score and it becomes the opponent's turn.\r\n");
	}
}
