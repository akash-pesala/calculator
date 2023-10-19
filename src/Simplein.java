import java.util.*;

public class Simplein {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principal:");
		double p=sc.nextInt();
		System.out.print("Enter Rate of intrest % per annum:");
		double r=sc.nextInt();
		System.out.print("Enter Time for simple intrest:");
		double t=sc.nextDouble();
		System.out.println("Simple Intrest ="+(p*t*r)/100);
		sc.close();
		

	}

}
