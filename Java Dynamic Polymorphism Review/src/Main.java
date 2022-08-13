import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)
		
		// ex: a corvette is a: corvette, and a car, and a vehicle, and an object
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
	//	Animal animal2 = new Cat();
		
		System.out.println("What an imal do you want?");
		System.out.print("(1=dog) or (2=cat): ");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			animal.speak();
		}
		
	
	}
}
