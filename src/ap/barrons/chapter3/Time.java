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
		
		// lessThan
		Time t5 = new Time(3, 6, 8);
		Time t6 = new Time (3, 6, 8);
		
		boolean result1 = t5.equals(t6);
		System.out.println("Result f equals : " + result1);
	
		Time t7 = new Time(5, 30, 49);
		System.out.println(t7.toString());
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
	public boolean lessThan(Time t)
	{
		if (hrs > t.hrs)
		{
			return false;
		}
		if (hrs < t.hrs)	
		{
			return true;
		}
		
		if (mins > t.mins)
		{
			return false;
		}
        if (mins < t.mins)
        {
        	return true;
        }
        if (secs > t.secs)
        {
        	return false;
        }
        if (secs > t.secs)
        {
        	return true;
        }
   
        return false;
	}
	public String toString()
	{ 
		String str = hrs+":"+mins+":"+secs;
		
		return str;
	}
	
}

