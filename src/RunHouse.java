
public class RunHouse {

	public static void main(String[] args) {
		
		run();
	}
	
	private static void run() {
		// create the houses
		House anshahouse = new House("ansha house", "cream", 3, "milpitas, ca","3 numpn");
		House suhanihouse = new House("suhani house", "blue", 4, "milpitas, ca","4 numpn");
		House shiprahouse = new House("shipra house", "red", 6, "fremont, ca","6 numpn");
		House avikhouse = new House("avik house", "green", 0, "milpitas, ca","7 numpn");
		House bobhouse = new House("bob house", "purple", 5,"san fran, ca", "8 numpn");
		
		// print the details of the houses
		anshahouse.print();
		suhanihouse.print();
		shiprahouse.print();
		avikhouse. print();
		bobhouse.print();
		
		
		// find the total number of bedrooms in all the houses
		int totalbed = anshahouse.numBedrooms + suhanihouse.numBedrooms + shiprahouse.numBedrooms + avikhouse.numBedrooms + bobhouse.numBedrooms;
		System.out.println("total number of bedrooms "+totalbed);
	}
	
}
