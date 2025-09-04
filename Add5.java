public class Add5
{
	public static void main(String args[])
	{
		int a=10,b=0;
		int e=a-b;
		System.out.println("the Substraction is : "+e);
		try{
		int c=a/b;
		System.out.println("the division is : "+c);
		}
		catch(Exception e1) {
		System.out.println("you donot divide by Zero : "+e1);
		}	
		int d=a+b;
		System.out.println("the Addition is : "+d);

	}
}