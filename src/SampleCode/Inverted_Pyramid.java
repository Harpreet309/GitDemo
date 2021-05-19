package SampleCode;

public class Inverted_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int M = 1;
		 * 
		 * for(int i=2; i<6; i++) {
		 * 
		 * for(int j=0; j<i-1; j++) { System.out.print(M); System.out.print("\t"); M++;
		 * }
		 * 
		 * System.out.println(""); }
		 */
		
		int K = 1;
		
		for(int i=0; i<4;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(K);
				System.out.print("\t");
				K++;
			}
			System.out.println("");
		}


	}

}
