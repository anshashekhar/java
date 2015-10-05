
public class PrintNumbers {
	
	public static void main(String args[]) {
		print(3, 6);
	}
	
	public static void print(int a, int b) {
		int i = a;
		
		while (i <= b) {
			System.out.println("i is " + i);
			//i++;
			i = i+1;
		}
	}
	
}


