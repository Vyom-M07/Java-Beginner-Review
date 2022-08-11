
public class Car {
	String color;
	int speed;
	
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	Car() {
		color = "";
		speed = 0;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public String getColor() {
		return color;
	}

	public String toString() {
		return "Color: " + color + "\n" + "Speed: " + String.valueOf(speed);
		
	}
}
