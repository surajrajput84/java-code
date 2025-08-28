abstract class Bank
{
	abstract void deposite();
	abstract void withdraw();
	abstract void balance();
	void getDetail()
	{
		System.out.println("Name : suraj-----age : 19");
	}
}
 class Saving extends  Bank
{
	void deposite()
{
	System.out.println("4000 is deposite");
}
	void withdraw()
{
	System.out.println("5000 is withdraw");
}
	void balance()
{
	System.out.println("The current of saving account is : 10000");
}

	
}
public class Current extends Bank
{
	void deposite()
{
	System.out.println("10000 is deposite");
}
	void withdraw()
{
	System.out.println("180000 is withdraw");
}
	void balance()
{
	System.out.println("The current of current account is : 10459994");
}

public static void main(String args[])
{
	 Bank b=new Saving();
	b.getDetail();
	b.deposite();
	b.withdraw();
	b.balance();
	Bank c=new Current();
	c.getDetail();
	c.deposite();
	c.withdraw();
	c.balance();
}
}
	
	
	
	



	

	