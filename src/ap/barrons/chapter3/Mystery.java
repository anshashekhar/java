package ap.barrons.chapter3;

public class Mystery 
{
	public static void strangeMethod(int x, int y)
	{
		x += y;
		y *= x;
		System.out.println(x + " " + y);
	}
	public static void main(String[] args)
	{ 
		int a = 6, b = 3;
		strangeMethod(a, b);
		System.out.println(a + " " + b);		
	}

}
