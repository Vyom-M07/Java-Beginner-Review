import java.util.Random;

public class Die {
	
	int numFaces;
	
	public Die() {
		numFaces = 6;
	}
	public Die(int faces) {
		this.numFaces = faces;
	}
	public int roll() {
		Random rand = new Random();
		return rand.nextInt(numFaces) + 1;
	}
}
