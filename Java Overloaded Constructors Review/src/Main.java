
public class Main {

	public static void main(String[] args) {

		/* 
		 * overloaded constructors = multiple constructors within a class with the same name
		 * 							 but have different parameters
		 * 							 name + parameters = signature
		 */
		Pizza pizza = new Pizza("Thicc crust");
		System.out.println("Here are the ingridiants of your pizza: ");
		System.out.println(pizza.getBread());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getCheese());
		System.out.println(pizza.getTopping());
	}
}
