import java.util.*;
public class Area 
{
static double AreaOfCircle(double r)
{
		return 	3.14*r*r;
}
static double AreaOfRect(double l,double b)
{
		return 	l*b;
}
static double AreaOfTri(double h,double b)
{
		return 	0.5*h*b;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
			
		System.out.println("1.Area of circle");
		System.out.println("2.Area of Rectangle:");
		System.out.println("3.Area of Triangle");
		System.out.println("Enter the your option:");
		int op=sc.nextInt();
		switch(op)
		{
		case 1: 
			{
				System.out.println("Enter the Radius of Circle:");
				double r=sc.nextDouble();
				System.out.println("Area of Circle with Radius"+r+"="+AreaOfCircle(r));
				break;
			}
		case 2:
		{
			System.out.println("Enter Length and breath of Rectangle:");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println("Area of Rectangle "+"="+AreaOfRect(l,b));
			break;
		}
		case 3:
		{
			System.out.println("Enter the Radius of Circle:");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println("Area of Triangle"+"="+AreaOfTri(l,b));
			break;
		}
		 
		}
		sc.close();
	}
}


