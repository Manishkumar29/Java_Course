import java.awt.print.Printable;
import java.util.Iterator;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Write a program to print months name using switch case");
		int months= 12;
		switch (months) {
		case 1: {
			
			System.out.println("January");
		}break;
        case 2: {
			
			System.out.println("February");
		}break;
       case 3: {
	
	 System.out.println("March");
     }break;
      case 4: {
	
	System.out.println("April");
     }break;
    case 5: {
	
	System.out.println("May");
    }break;
   case 6: {
	
	System.out.println("June");
    }break;
    case 7: {
	
	 System.out.println("July");
     }break;
      case 8: {
	
	  System.out.println("August");
      }break;
		
        case 9: {
			
			System.out.println("Septmeber");
		}break;
		
        case 10: {
			
			System.out.println("October");
		}break;
		
        case 11: {
			
			System.out.println("November");
		}break;
		
		
        case 12: {
			
			System.out.println("December");
		}break;
		
		default:
			System.out.println("ENter month");
		
		}
		
		System.out.println("2) write a program to print table of 42");
		for(int i=1;i<=10;i++) {
			System.out.println(7 + " "+"x"+" "+ i + " "+ 7*i);
		}
		
		System.out.println("3) write a program to check grades of student based on marks(create marks object and check using if else)");
		int marks =35;
		if (marks<=35) {
			System.out.println("You are failed in exam");
			
		}
		else {
			System.out.println("You have passd this exam");
		}
		
		System.out.println("4) Write numbers from 1 to 20, if number is 10 skip the number. and if number is 15 break the loop");
		for(int i=1;i<=20;i++) {
			System.out.print(i +" ");
			if (i==10) {
				
				continue;
			}
			if (i==15) {
				break;
			}
		}
		
		
		System.out.println();
		System.out.println("5)Print capital and small alphabets ");
		for(int i=65;i<=122;i++) {
			System.out.print((char)i);
		}
		
		
	}
	}
