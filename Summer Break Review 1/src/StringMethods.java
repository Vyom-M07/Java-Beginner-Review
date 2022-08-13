
public class StringMethods {

	public static void main(String[] args) {

		// String = a reference data type that can store one or more chracters
		//          reference data types have access to useful methods
		
		String name = "Vyom";
		
	//	boolean result = name.equalsIgnoreCase("vyom");
	//	int result = name.length();
	//	char result = name.charAt(0);
	//	int result = name.indexOf("m");
	//	boolean result = name.isEmpty();
	//	String result = name.toUpperCase();
	//	String result = name.toLowerCase();
	//	String result = name.trim();
		String result = name.replace('o', 'a');
		
		System.out.println(result);
		
	}
}
