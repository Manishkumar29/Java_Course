
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int number = 89;
         
           
            System.out.println(number/0);
        } catch (ArithmeticException b) {
            
            System.out.println("An ArithmeticException occurred!"+b);
        }

	}

}
