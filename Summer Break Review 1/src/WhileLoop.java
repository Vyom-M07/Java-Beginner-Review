import java.util.Scanner;

public class WhileLoop {
	public static void main(String args[]) {

		// while loop = executes a block of code as long as it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		
		// difference between while loop and do-while loop,
		// is the block of code inside the do-while loop above will run at least once
		// AND THEN check the condition
		System.out.println("Hello, " + name);
		
		
	}
}
