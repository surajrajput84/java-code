public class NullException
{
	public static void main(String args[])
	{	try{
		String n=null;
		System.out.println("the stringlength is "+n.length());
		}
		catch(Exception e)
		{
			System.out.println("the string is null");
		}
	}
}
	