import java.util.Scanner;

public class Player {

	int score;
	String name;
	Scanner console = new Scanner(System.in);
	boolean turnOver = false;

	public Player(String pName) {
		this.name = pName;
		score = 0;

	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void takeTurn(Die d) {
		System.out.println(this.getName() + ", your score is " + this.getScore());
		int turnTotal = 0;
		turnOver = false;
		while (!turnOver) {
			String response = "";
			if (turnTotal > 0) {
				System.out.println("Total points made this round: " + score);
			}
			while (!response.equalsIgnoreCase("roll") && !response.equalsIgnoreCase("hold")) {
				System.out.println("Do you want to roll or hold? >>> ");
				response = console.nextLine();
				if (response.equalsIgnoreCase("roll")) {
					int roll = d.roll();
					if (roll != 1) {
						turnTotal = turnTotal + roll;
						System.out.println("You rolled a " + roll);
						System.out.println("Turn total = " + turnTotal);
					} else {
						System.out.println("You rolled a PIG!!!");
						turnTotal = 0;
						turnOver = true;
						
					}
				} else {
					score = score + turnTotal;
					turnTotal = 0;
					turnOver = true;	
				}
			}
			System.out.println(this.getName() + ", your currect score is " + score);
		}
	}
}
