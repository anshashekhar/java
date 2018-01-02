package basics;

public class RunHouse {

	public static void main(String[] args) {
		
		run();
	}
	
	private static void run() {
		// create the houses
		House anshahouse = new House("ansha house", "cream", 3, "3 numpn",
							"420 Glenmoor Circle", "Milpitas", "CA", "USA");
		House suhanihouse = new House("suhani house", "blue", 4, "4 numpn",
							"420 Glenmoor Circle", "Milpitas", "CA", "USA");
		House shiprahouse = new House("shipra house", "red", 6, "6 numpn",
							"420 Glenmoor Circle", "Milpitas", "CA", "USA");
		House avikhouse = new House("avik house", "green", 0, "7 numpn",
							"420 Glenmoor Circle", "Milpitas", "CA", "USA");
		House bobhouse = new House("bob house", "purple", 5,"8 numpn",
							"420 Glenmoor Circle", "Milpitas", "CA", "USA");
		
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
