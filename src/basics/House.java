package basics;

public class House {

	public String name;
	public String color = "";
	public int numBedrooms;
	public String pens;
	
	public Address address;
	
	public House(String nm, String clr, int numbed, String numpn, 
			String street, String city, String state, String country) {
		name = nm;
		color = clr;
		numBedrooms = numbed;
		pens = numpn;
		
		address = new Address(street, city, state, country);
	}
	
	public void print() {
		System.out.println("Name is "+name);
		System.out.println("Color is "+color);
		System.out.println("Num Bedrooms is "+numBedrooms);
		System.out.println("--------------");
		System.out.println("Num pens is "+pens);
		
		address.print();
	}
}

