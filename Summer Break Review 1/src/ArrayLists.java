import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		/*
		 * ArrayList = a resizeable array. Element can be added and removed after the
		 * compilation phase store reference data types
		 */

		ArrayList<String> food = new ArrayList<String>();

		food.add("Pizza");
		food.add("Churro");
		food.add("Waffles");

		food.set(0, "Sushi");
		// food.remove(2);
		// food.clear();

		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		// different way to print out (For-Each Loop)
		
	//  for each data type (named 'i') in the ArrayList food
		// print the food
		for (String i : food) {
			System.out.println(i);
		}
	}

}
