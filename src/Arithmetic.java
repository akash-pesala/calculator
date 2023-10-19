import java.util.*;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	  int x=sc.nextInt();
	  int y=sc.nextInt();
         Arithmetic c=new Arithmetic();
              c.Addition(x,y);
              c.Subtraction(x, y);
              c.Multiplication(x,y);
              c.Division(x, y);
	}
   public static void Addition(int a,int b)
   {
	   System.out.println(a+b);
   }
   public static void Subtraction(int a,int b)
   {
	   if(a>b)
		   System.out.println(a-b);
	   else
		   System.out.println(b-a);
   }
   public static void Multiplication(int a,int b)
   {
	   System.out.println(a*b);
   }
   public static void Division(int a,int b)
   {
	   float f=(float)(a/b);
	   System.out.println(f);
   }
}
