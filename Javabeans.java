import java.util.function.BiConsumer;

public class Javabeans {

	public  void hello() {
		System.out.println("THis is demo");
	}
	
	public  static int add() {
		int a=10;
		int b = 20;
		int sum =a+b;
		return sum;
	}
	public  static int sumd(int a, int b) { // with argument
		
		int sum =a+b;
		return sum;
	}
	
	
	
	
	public  static boolean age() {
		int ag=16;
		boolean check = ag==16? true :false;
		return check;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Javabeans.hello();
		Javabeans b =  new Javabeans();
		b.hello();
	
		System.out.println(Javabeans.add());
		System.out.println(Javabeans.age());
		System.out.println(Javabeans.sumd(25, 39));
	
	}

}// float double char short
