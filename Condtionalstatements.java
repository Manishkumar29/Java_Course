import javax.swing.plaf.multi.MultiInternalFrameUI;

public class Condtionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		
			String food="Indian";

			switch(food) {

			case "Indian":System.out.println("Indian food available");

			break;

			case "Chinese": System.out.println("Chinese food available");

			break;

			default:System.out.println("We don't have this kind of anythind");

			

			}

			int marks=57;

			if(marks>=60) {

				System.out.println("Grade A");

			}

			else if(marks>=35&&marks<=60)

			{

				System.out.println("Grade B");

			}

			else if(marks<=30) {

				System.out.println("fail");

			}



		
		
		}
	}

}
