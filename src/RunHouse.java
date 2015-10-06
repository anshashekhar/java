
public class RunHouse {

	public static void main(String args[]) {
		
		run();
	}
	
	private static void run() {
		// create the houses
		House anshahouse = new House("ansha house", "cream", 3, "milpitas, ca");
		House suhanihouse = new House("suhani house", "blue", 4, "milpitas, ca");
		House shiprahouse = new House("shipra hose", "red", 6, "fremont, ca");
		
		// print the details of the houses
		anshahouse.print();
		suhanihouse.print();
		shiprahouse.print();
		
		
		// find the total number of bedrooms in all the houses
		int totalbed = anshahouse.numBedrooms + suhanihouse.numBedrooms + shiprahouse.numBedrooms;
		System.out.println("total number of bedrooms "+totalbed);
	}
	
}
