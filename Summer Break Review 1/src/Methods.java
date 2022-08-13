
public class Methods {

	public static void main(String[] args) {

		// method = a block of code that is executed whenever it is called upon
		String name = "Vyom";
		int age = 15;
		hello(name, age);
		
		int x = 3;
		int y = 4;
		System.out.println(add(x, y));
		
	}
	
	public static void hello(String name, int age) {
		System.out.println("Hello, " + name);
		System.out.println("You are " + age + " years old!" );
	}
	
	public static int add(int a, int b) {
		
		return a + b;
	}
}
