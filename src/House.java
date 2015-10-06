
public class House {

	public String name;
	public String color = "";
	public int numBedrooms;
	public String address;
	
	public House(String nm, String clr, int numbed, String addr) {
		name = nm;
		color = clr;
		numBedrooms = numbed;
		address = addr;
	}
	
	public void print() {
		System.out.println("Name is "+name);
		System.out.println("Color is "+color);
		System.out.println("Num Bedrooms is "+numBedrooms);
		System.out.println("Address is "+address);
		System.out.println("--------------");
	}
}
