 class Employe123
{
	int salary=5000;
 	public void display()
	{
		System.out.println("parent class");
	}
}
public class Program extends Employe123
{
	int bonous=1000;
	
	public void show()
{
	System.out.println(" in child class");

}
public static void main(String args[])
{
	Program p= new Program();
	int total=p.salary+p.bonous;
	System.out.println("total amount is "+total);
	p.show();
	p.display();
	
}
}

	