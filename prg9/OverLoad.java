import java.util.Scanner;
public class OverLoad{
	void are(float x){
		System.out.println("the area of sqr is "+Math.pow(x,2)+"sq units:");
	}
	void area(float x,float y){
		System.out.println("the area of rect is"+x*y+"sq units");
	}
	void area(double x){
		double z=3.14 *x*x;
		System.out.println("the radius of a circle is"+z+"sq unit");
	}
}
class Over_Load{
	public static void main(String[] args)
	{
		OverLoad o= new OverLoad();
		Scanner s=new Scanner(System.in);
		Scanner ar= new Scanner(System.in);
		while(true){
			System.out.println("\n enter your choice: \n 1. Area of Square \n 2. Area of Rectangle \n 3. Radius of circle \n 4. Exit");
			int ch;
			float a,b;
			double x;
			ch = s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the lenght of Square:");
					a=ar.nextFloat();
					o.area(a);
					break;
				case 2:
					System.out.println("Enter the lenght and bridth of the rectangle:");
					a=ar.nextFloat();
					b=ar.nextFloat();
					o.area(a,b);
					break;
				case 3:
					System.out.println("Enetr the Radius of the Circle");
					x=ar.nextDouble();
					o.area(x);
					break;
				case 4:
					System.out.println("Exiting...");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid command");
					break;
			}
		}
	}
}	
