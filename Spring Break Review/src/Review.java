import java.util.*;

// Problem Number 1
public class Review {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		// Problem 2
		// problem2();

		// Problem 3
		// problem3();

		// Problem 4
		// problem4();

		// Problem 5
		// problem5();

		// Problem 6
		// problem6();

		// Problem 7
		// problem7();
		
		// Problem 8 and 9
		problem8and9();
		
		// problem10
		// problem10();
		
		// Problem11
		// problem11();
	}

	private static void problem2() {
		System.out.println("How many pounds?");
		double pounds = console.nextDouble();
		System.out.println(pounds + " lbs. = " + pounds / 2.205 + " kg.");
	}

	private static void problem3() {
		System.out.println("Enter a number:");
		int num = console.nextInt();
		if (num == 0) {
			System.out.println("You're number is 0");
		} else if (num * -1 < num) {
			System.out.println("You're number is positive");
		} else {
			System.out.println("You're number is negative");
		}
	}

	private static void problem4() {
		System.out.println("Enter two numbers:");
		int a = console.nextInt();
		int b = console.nextInt();

		if (a <= 20 && a >= 10 || b <= 20 && b >= 10) {
			System.out.println("Within");
		} else {
			System.out.println("Not Within");
		}
	}

	private static void problem5() {
		System.out.println("Please enter, \"true\" or \"false\"");
		boolean isLoud = console.nextBoolean();
		System.out.println("Enter a number: ");
		int time = console.nextInt();
		if (isLoud == true && time < 6 || time > 18) {
			System.out.println("You're in trouble");
		} else {
			System.out.println("You're not in trouble");
		}
	}

	private static void problem6() {
		System.out.println("All even multiples of 3 to 1000: ");
		int fish = 0;
		while (fish < 1000) {
			fish = fish + 3;
			System.out.println(fish);
		}
	}

	private static void problem7() {
		System.out.println("All even mulitples of 9 to 1000: ");
		for (int i = 0; i <= 1000; i+=9) {
			if (i % 2 == 0 && i != 0) {
				System.out.println(i);
			}
		}
	}
	private static void problem8and9() {
		System.out.println("Enter and integer: ");
		int input = console.nextInt();
		double input2 = input;
		int numberOfTries = 1;
		while (input != 0) {
			System.out.println("Not the right number! Enter another one!");
			input = console.nextInt();
			input2 = input2 + input;
			numberOfTries++;
			}
		System.out.println("Sum of all numbers entered: ");
		System.out.println(input2);
		// Problem 9
		System.out.println("Average of all Numbers: ");
		double average = input2/numberOfTries;
		System.out.println(average);
	}
	
	private static void problem10() {
		int[] grades = new int[5];
		double gradesAll = 0;
		System.out.println("What do you want your grades to be!!");
		for (int i = 0; i < 5; i++) {
			grades[i] = console.nextInt();
			gradesAll = gradesAll + grades[i];
		}
		// System.out.println(Arrays.toString(grades));
		double average = gradesAll/5;
		System.out.println("Average of all your grades: ");
		System.out.println(average);
	}
	
	private static void problem11() {
		int[][] grid = new int[3][3];
		int idk = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				idk = idk+1;
				grid[i][j] = idk;	
				System.out.print(grid[i][j] + " ");		
			}
		System.out.println();
		}
				
			
	}
}
