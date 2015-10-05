
public class RunHouse {

	public static void main(String args[]) {
		House anshahouse = new House();
		anshahouse.color = "cream";
		anshahouse.numBedrooms = 3;
		
		House suhanihouse = new House();
		suhanihouse.color = "blue";
		suhanihouse.numBedrooms = 4;
		
		anshahouse.print();
		suhanihouse.print();
	}
	
}
