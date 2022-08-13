
public class Car {

	private String make;
	private String model;
	private int year = 2020;
	private String color = "red";
	private double price = 50000.00;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void drive() {
		System.out.println("You drive the car");
	}

	public void brake() {
		System.out.println("You step on the breaks");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}