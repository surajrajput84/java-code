public class Shape
{
	public void area()
	{
		int b=10;
		int h=30;
		int t=b*h;
		System.out.println("the area of  rectangle is : " +t);
	}
	public double area(int b, int h)
	{
		double t=0.5*b*h;
		return t;
	}
		public double area(int r)
	{
		double t=3.14*r*r;
		return t;
	}
	public static void main(String args[])
	{
		Shape s = new Shape();
		s.area();
		System.out.println("the area of triangle is : "+s.area(14,16));
		System.out.println("the area of circle is : " +s.area(45));
	}
}
