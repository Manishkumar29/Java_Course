import java.util.Iterator;

public class Lab_typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("27 march 2024");
	System.out.println("1.  Convert all the integer type data(byte,short,int,long) to floating point(float,double) type data and vice versa.");
	byte a =1;
	System.out.println(a);
	short b =1345;
	System.out.println(b);
	int c =154582565;
	System.out.println(c);
	long di  =1485551545;
	System.out.println(di);
	
	float e =1455452.15165f;
	System.out.println(e);
	double f =1656556.146516;
	System.out.println(f);


	System.out.println((short)c);
	System.out.println((int)c);
	System.out.println((float)c);
	System.out.println((double)c);
	
System.out.println((int)a);
System.out.println((short)a);
System.out.println((float)a);
System.out.println((double)a);


System.out.println((int)di);
System.out.println((short)di);
System.out.println((float)di);
System.out.println((double)di);


System.out.println((byte)f);
System.out.println((int)f);
System.out.println((float)f);
System.out.println((double)f);

System.out.println((char)90);	
System.out.println();

System.out.println("2. Convert the character type data into int , float and tell the difference in both.");

char ch =122;
System.out.println((int)ch);
System.out.println("cannot cast from char to float");
System.out.println();
	
	System.out.println("3. Print alphabets Uppercase and lowercase using loops and casting");
	for(int i=65;i<=90;i++) {
		System.out.print((char)i +" " );
	}
	System.out.println();
	for(int i=97;i<=122;i++) {
		System.out.print((char)i +" " );
	}
	}

}
