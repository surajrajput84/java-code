public class ArrayTest
{	public static void main(String args[])
{
	int arr[]={2,5,3,8,6,7};
	try{
	System.out.println(arr[6]);
	}
	catch(Exception e)
	{
		System.out.println("the array is out of bound"+e);
		System.out.println(arr[3]);
	}
}
}
