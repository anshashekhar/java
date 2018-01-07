package ap.barrons.chapter3;

public class IntObject {
	
	private int num;
	
	public IntObject()
	{ num = 0; }
	
	public IntObject(int n )
	{ num = n; }
	
	public void increment()
	{ num++; }
	
	public static IntObject someMethod(IntObject obj)
	{
		IntObject ans = obj;
		ans.increment();
		return ans;
	}
	
	public String toString()
	{
		String str = ""+num;
		return str;
	}
	
	public static void main(String[] args)
	{
		IntObject x = new IntObject(2);
		System.out.println(x.toString());
		IntObject y = new IntObject(7);
		System.out.println(y);
		
		IntObject a = y;
		x = someMethod(y);
		a = someMethod(x);
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("a="+a);
	}
	
}



