package ap.year2017.digits;

import java.util.ArrayList;

// https://secure-media.collegeboard.org/secure/ap/pdf/ap-computer-science-a-frq-2017.pdf?__gda__=1514923347_d6023384cbfa0f33c19a5e0b2dbc0062

public class Digits
{
	static ArrayList<Integer> digitList = new ArrayList<Integer>();

	public static void main(String[] args) {
		int num = 0;
			
			if (num == 0);
			digitList.add(new Integer (0));
			
			while (num > 0);
			{
				digitList.add(0, new Integer(num % 10));
				num /= 10;
			}
	}
	public boolean isStrictlyIncreasing()
	{
		for (int i = 0; i < digitList.size()-1; i++)
		{
			if (digitList.get(i).intValue() >= digitList.get(i+1).intValue())
			{
				return false;
			}
		}
		return true;
	}
}

