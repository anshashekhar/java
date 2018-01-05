package ap.year2017.digits;

public class multpractice {
	private int first;
	private int second;
	public void MultPractice(int num1, int num2)
	{
	first = num1;
	second = num2;
	}
	public String getProblem()
	{
	return first + " TIMES " + second;
	}
	public void nextProblem()
	{
	second++;
	}
}


