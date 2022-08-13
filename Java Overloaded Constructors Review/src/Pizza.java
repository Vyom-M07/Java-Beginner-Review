
public class Pizza {
	
	private String bread;
	private String sauce;
	private String cheese;
	private String topping;
	
	Pizza(String bread, String sauce, String cheese, String topping) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
	Pizza(String bread, String sauce, String cheese) {
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread, String sauce) {
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread) {
		this.bread = bread;
	}
	
	Pizza() {
		
	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
}
