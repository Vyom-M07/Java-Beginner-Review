
public class Vehicle {
	private double speed; 
	
	void go() {
		System.out.println("This vehicle is moving");
	}
	
	void stop() {
		System.out.println("This vehicle is stopped");
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
