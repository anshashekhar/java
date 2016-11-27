
public class Cube {

	private double length;
	
	public Cube(double l) {
		length = l;
	
	}
	
	
	public double getvolume() {
		double volume = length * length * length;
		
		return volume;
	}
}
