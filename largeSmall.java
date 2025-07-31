import java.util.Scanner;
public class largeSmall
{
	public static void main(String args[])
	{
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the first number:");
	a=s.nextInt();
	System.out.print("enter the second number:");
	b=s.nextInt();
	if(a>b)
		System.out.println("a is greater");
	else if(a==b)
		System.out.println("a and b are equal");

		
	else
		System.out.println("b is greater");
	}
}
