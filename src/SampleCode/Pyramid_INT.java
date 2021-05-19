package SampleCode;

public class Pyramid_INT {

	public static void main(String[] args) {
		
		
		int rows = 6;
		/*
		 * for(int i=0; i<4; i++) {
		 * 
		 * for(int j=0; j<4-i; j++) { System.out.print(k); System.out.print("\t"); k++;
		 * }
		 * 
		 * System.out.println(""); }
		 */
		
		for(int m=1; m<=rows; m++)
		{
			for(int j=rows; j>=m; j--)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=m;j++) 
			{
				System.out.print("1 ");
			}
			
			System.out.println(); 
		}
		
	}
}
