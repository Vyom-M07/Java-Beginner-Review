
public class Point {

	public int x;
	public int y;
	
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double calculateDistance(Point p) {
		return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y-p.y),2));
		
	}
	
	@Override
	public String toString() {
		return "(" + String.valueOf(x) + "," + String.valueOf(y) + ")";
		
		
	}
	
}
