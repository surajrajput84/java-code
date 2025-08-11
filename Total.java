 class Marks
{
	int maths=56;
	int hindi=50;
 	public void display()
	{
		System.out.println("maths : "+maths);
		System.out.println("hindi : "+hindi);
	}
}
public class Total extends Marks
{
	int eng=77;
	
	public void show()
{
	System.out.println(" eng : "+eng);

}
public static void main(String args[])
{
	Total t= new Total();
	int total=t.maths + t.hindi + t.eng;
	System.out.println("total marks is "+total);
	t.show();
	t.display();
	
}
}

	