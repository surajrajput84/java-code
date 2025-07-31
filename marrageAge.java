import java.util.Scanner;
public class marrageAge
	{

		public static void main(String args[])
			{
				int agem,agef;
				Scanner scan=new Scanner(System.in);
				System.out.println("enter the ege of male person");
				agem=scan.nextInt();
				System.out.println("enter the ege of female person");
				agef=scan.nextInt();
				if(agem>=24&&agef>=21)
					System.out.println("both are eligible to married");
				else
					System.out.println("not eligible to married");
	
					
				