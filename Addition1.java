public class Addition1
{
	int a,b;
	public Addition1()
	{
		this(12,34);
		System.out.println("no argument");
	}
	public Addition1(int a, int b)
	
	{
		int c=a+b;
		System.out.println("the addition is : " +c);
	}
	public static void main(String args[])
	{
		Addition1 s= new Addition1();
	}
}
		
 
