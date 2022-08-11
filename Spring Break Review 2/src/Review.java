import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Review {

	public static void main(String[] args) {

		// Problem 1
		String[] colors = new String[] { "red", "blue", "yellow", "purple" };

		for (String i : colors) {
			System.out.println(i);
		}

		// Problem 2
		Point pointA = new Point(3, 4);
		Point pointB = new Point(7, 10);
		// Problem 3
		System.out.println("Distance between point A and point B: " + pointA.calculateDistance(pointB));
		// Problem 4
		System.out.println(pointA);
		// Problem 5
		Point[][] grid = new Point[4][5];

		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 5; column++) {
				grid[row][column] = new Point(column, row);

			}
			System.out.println(Arrays.toString(grid[row]));
		}

		// Problem 6
		Car c = new Car("pink", 65);
		System.out.println(c);
		// Problem 7
		c.setColor("green");
		c.setSpeed(90);
		System.out.println();
		System.out.println(c);
		// Problem 8
		Random rand = new Random();
		int idk = rand.nextInt(101);
		System.out.println();
		System.out.println("A random number: ");
		System.out.println(idk);
		System.out.println();
		// Problem 9

		ArrayList<Car> cars = new ArrayList<Car>();
		for (int i = 0; i < 10; i++) {
			Car fish = new Car();
			int r = rand.nextInt(131) + 20;
			fish.setSpeed(r);
			cars.add(fish);
			System.out.println(cars.get(i));
		}
		// System.out.println(cars);
		System.out.println();
		Car fast = cars.get(0);
		// Problem 10
		for (Car fastest : cars) {
			if (fast.getSpeed() < fastest.getSpeed()) {
				fast = fastest;
			}
		}
		System.out.println("The fastest car goes a speed of: " + fast.getSpeed() + " Light years per second");
	}
}
