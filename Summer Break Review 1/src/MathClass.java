
public class MathClass {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); // returns larger of two numbers
		System.out.println(Math.min(y, z));	// returns smaller of two numbers
		System.out.println(z);
		
		System.out.println(Math.abs(y)); // returns absolute value of a number
		System.out.println(Math.sqrt(x)); // returns the square root of a number
		System.out.println(Math.round(x)); // rounds a number to the nearest whole number
		System.out.println(Math.ceil(x)); // rounds a number to the higher whole number
		System.out.println(Math.floor(x)); // rounds a number to the lower whole number
		
	}
}
