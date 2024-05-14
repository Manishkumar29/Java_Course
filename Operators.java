import java.awt.geom.Area;
import java.nio.channels.Pipe;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmetic operator
		 int a =10;
		 int b =5;
		 System.out.println(a+b);
		 System.out.println(a-b);
		 System.out.println(a/b);
		 System.out.println(a%b);
		 
		 
		 
		//ternary
		int num1 = 10;
	String t = num1 > 18 ? "True" :"False";
		System.out.println(t);
	
	
		
		
		
		//perimeter of circle and area
		int r = 10;
	float	Pi = 3.14f;
 float	perimeter = 2 * Pi * r;
 float area = Pi * r*r;
 System.err.println("Area od cirlce = "+area );
 System.out.println("Perimeter of circle ="+perimeter);
	
 Scanner sc = new Scanner(System.in);
		 int ad = sc.nextInt();
		 System.out.println(ad+"numbs is234");
	
	}
	

}
