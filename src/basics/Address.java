package basics;


public class Address {
 
	public String street; 
	public String city;
	public String state;
	public String country;
	
	public Address(String st, String c, String s, String co) {
		street = st;
		city = c;
		state = s;
		country = co;
				
	}
	
	public void print() {
		System.out.println("Street is "+street);
		System.out.println("City is "+city);
		System.out.println("State is "+state);
		System.out.println("Country is "+country);
		
	}
}
