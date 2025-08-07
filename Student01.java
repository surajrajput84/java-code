public  class Student01
{
	public void display()
	{
		this.show();
		System.out.println("in display method");
	}
	 public void show()
	{
		System.out.println("in show method");
	}
	public static void main(String args[])
	{
		Student01 s = new Student01();
		s.display();
	}
}