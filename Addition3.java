public class Addition3
{
	public void sum()
	{
		int a=10;
		int b=30;
		int s=a+b;
		System.out.println("the sum of : " +s);
	}
	public int  sum(int a, int b)
	{
		int s= a+b;
		return s;
	}

	public double sum(double a, double b)
	{
		double s= a+b;
		return s;
	}
		public float sum(float a, float b)
	{
		float s= a+b;
		return s;
	}
	public static void main(String args[])
	{
		Addition3 a = new Addition3();
		a.sum();
		System.out.println("the sum of int is : " +a.sum(56,88));
		System.out.println("the sum of double is : " +a.sum(5.6,8.8));
		System.out.println("the sum of float is : " +a.sum(7.6f,9.8f));
	}

}

	
