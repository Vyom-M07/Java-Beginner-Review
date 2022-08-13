
public class Friend {
	private String name;
	static int numberOfFriends;
	
	Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	static void displayFriends() {
		System.out.println("You have " + numberOfFriends + " friends");
	}
}
