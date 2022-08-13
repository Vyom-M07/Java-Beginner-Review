
public class Car {
	
	private String make;
	private String model;
	private int year;
	

	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car(Car x) {
		this.copy(x);
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
	
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
		
		/*
		Can be written like this too:
		this.make = x.make;
		this.model = x.model;
		this.year = x.year;
		*/
		
	}
	
}
