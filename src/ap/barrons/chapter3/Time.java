package ap.barrons.chapter3;

public class Time 
{
	private int hrs;
	private int mins;
	private int secs;

	
	public static void main(String[] args)
	{
		
		// constructors
		Time t1 = new Time();
		System.out.println(t1.toString());
		
		Time t2 = new Time(3, 5, 8);
		System.out.println(t2.toString());
		
		// resetTime
		t2.resetTime(23, 59, 59);
		System.out.println(t2.toString());
		
		// increment
		t2.increment();
		System.out.println(t2.toString());
		
		// equals
		Time t3 = new Time(3,5,8);
		Time t4 = new Time(3,5,9);
		
		boolean result = t3.equals(t4);
		System.out.println("Result of equals : " + result);
	}
		

	@Override
	public String toString()
	{
		return "hrs : "+hrs+ " mins : "+mins+" secs : "+secs;
	}
	public Time()
	{
		hrs = 0;
		mins = 0;
		secs = 0;			
	}
	
	public Time(int h, int m, int s)
	{
		hrs = h;
		mins = m;
		secs = s;
	}
	public void resetTime(int h, int m, int s)
	{
		hrs = h;
		mins = m;
		secs = s;
	}
	
	public void increment()
	{
		secs++;

		if(secs>=59)
		{
			secs = 0;
			mins++;
		}
		if(mins>=59)	
		{
			mins=0;
			hrs++;
		}
		if(hrs>=24)	
		{
			hrs=0;
		}
	}
	
	public boolean equals(Time t)
	{
		if (t.hrs == hrs && t.mins == mins && t.secs == secs)
		{
			return true;
		}
		
		return false;
	}
    

  
}
