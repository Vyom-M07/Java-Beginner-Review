
public class Main {

	public static void main(String[] args) {
		
	//	Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Berry");
		Food food3 = new Food("Melon");
		
		Food[] refrigerator = {food1, food2, food3};
		
		/*
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		*/
		
		System.out.println(refrigerator[0].getName());
		System.out.println(refrigerator[1].getName());
		System.out.println(refrigerator[2].getName());

		

	}
}
