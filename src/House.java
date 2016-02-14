
public class House {

	public String name;
	public String color = "";
	public int numBedrooms;
	public String address;
	public String pens;
	
	public House(String nm, String clr, int numbed, String addr,String numpn) {
		name = nm;
		color = clr;
		numBedrooms = numbed;
		address = addr;
		pens = numpn;
	}
	
	public void print() {
		System.out.println("Name is "+name);
		System.out.println("Color is "+color);
		System.out.println("Num Bedrooms is "+numBedrooms);
		System.out.println("Address is "+address);
		System.out.println("--------------");
		System.out.println("Num pens is "+pens);
	}
}

