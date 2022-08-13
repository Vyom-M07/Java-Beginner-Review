
public class Main {

	public static void main(String[] args) {

		// static = modifier. A single copy of a variable/method is created and shared
		//			The class "owns" the static member (All instances of the class share the variable)
		
		Friend friend1 = new Friend("Jainam");
		Friend friend2 = new Friend("Mama");
		Friend friend3 = new Friend("Papa");
		Friend friend4 = new Friend("Dada");


		Friend.displayFriends();
		
	}

}
