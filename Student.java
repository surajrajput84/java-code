public class Student
{
	int roll;
	String name;
	int marks;
	public Student(int roll,String name,int marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	public void display()
	{
		System.out.println("roll : " +roll+ "name : " +name+ "marks : "+marks);
	}
	public static void main(String args[])
	{
		Student s=new Student(21,"suraj",90);
		s.display();
	}
}
	