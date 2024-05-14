
public class Exception {

	
		
		
		    public static void main(String[] args) {
		        try {
		            // Code that may cause an exception
		            int[] numbers = {1, 2, 3};
		            System.out.println(numbers[2]); // Trying to access an index out of bounds
		        } catch (ArrayIndexOutOfBoundsException e) {
		            // Catch block handling the exception
		            System.out.println("An ArrayIndexOutOfBoundsException occurred!");
		        }
		        try {
		            // Code that may cause an exception
		            int number = 55;
		         
		            int res= number/0;
		            System.out.println(res); // Trying to access an index out of bounds
		        } catch (ArithmeticException b) {
		            // Catch block handling the exception
		            System.out.println("An ArithmeticException occurred!");
		        }
		        try {
		        Object obj = new Object();
		        String str = (String) obj; // This will throw a ClassCastException
		        }
		        catch(ClassCastException c) {
		        	 System.out.println("An ClassCastException occurred!");
		        }
		    
		


	}

}
