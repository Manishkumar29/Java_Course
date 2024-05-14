
public class Lab_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	1   1        
//
//	    1  2
//
//	    1  2  3   
		for(int i=1;i<=3;i++) 
		{
				for(int j=1;j<=i;j++) {
					System.out.print(j+ " ");
				}System.out.println();
			}

	System.out.println("question 2");
	
	for(int i=4;i>=1;i--) 
	{
			for(int j=1;j<=i;j++) {
				System.out.print("*"+ " ");
			}System.out.println();
		}
	
	
	System.out.println("question 3");
	for(int i=1;i<=4;i++) 
	{
			for(int j=1;j<=i;j++) {
				System.out.print("*"+ " ");
			}System.out.println();
		}

	System.out.println("question 4");
	
	for(int i=4;i>=1;i--)
    {
        for (int j=i;j>0;j--) {
        System.out.print(j);
        }
        System.out.println();
    }
	
	
	System.out.println("question 5");
	for(int i=1;i<=10;i++) 
	{
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}System.out.println();
		}
	
	}

}
