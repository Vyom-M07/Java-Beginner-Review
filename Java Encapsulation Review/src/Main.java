
public class Main {

	public static void main(String[] args) {
		
		// Encapsulation = attributes of a class will be hidden or private
		//				   Can be accessed only through methods (Getters & Setters)
		// 				   You should make attributes private if you don't have a reason so make them public/protected
		
		
		
		Car car1 = new Car("Chevrolet", "Camaro", 2021);
	//	Car car2 = new Car("Ford", "Mustang", 2022);
		
	//	Object Copying
	//	car2.copy(car1);
	//	You can also copy with overloaded constructor	
		Car car2 = new Car(car1);
	
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());


		
	}
}
