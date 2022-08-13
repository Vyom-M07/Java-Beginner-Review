
public class Arrays2D {

	public static void main(String[] args) {

		// 2D Arrays = an array of arrays

		String[][] cars1 = new String[3][3];

		cars1[0][0] = "Camero";
		cars1[0][1] = "Corvette";
		cars1[0][2] = "Silverado";

		cars1[1][0] = "Mustang";
		cars1[1][1] = "Ranger";
		cars1[1][2] = "F-150";

		cars1[2][0] = "Ferrari";
		cars1[2][1] = "Lambo";
		cars1[2][2] = "Tesla";

		for (int i = 0; i < cars1.length; i++) {
			for (int j = 0; j < cars1[i].length; j++) {
				System.out.print(cars1[i][j] + " ");
			}
			System.out.println();
		}

		// different way to make a 2D Array

		String[][] cars2 = {
								{"Camero", "Corvette", "Silverado"}, 
								{"Mustang", "Ranger", "F-150"},
								{"Ferrari", "Lambo", "Tesla"}
							};

	}
}
