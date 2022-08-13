
public class Arrays {

	public static void main(String[] args) {

		// array = used to store multiple valies in a single variable

		String[] cars1 = { "Camero", "Corvette", "Tesla", "BMW" };
		cars1[0] = "Mustang";
		System.out.println(cars1[0]);
		
		// different way to make an array
		
		String[] cars2 = new String[3];
		
		cars2[0] = "Camero";
		cars2[1] = "Corvette";
		cars2[2] = "Tesla";
		
		System.out.println(cars2[0]);
		System.out.println();
		
		for(int i = 0; i < cars1.length; i++) {
			System.out.println(cars1[i]);
		}
		
	}
}
