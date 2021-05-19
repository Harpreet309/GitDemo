package Problems;

import java.util.Scanner;

 class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=100; i++)
		{
		 N = sc.nextInt();
		 
		 if((N>=0) && (N<=100))
		 {	 
		 if(N%2==0)
			{
				System.out.println(N-3);
				
			}
			else
			{
				System.out.println(N-1);
			}
		 }
		 else
		 {
			 System.out.println("Integer Out of Range");
			 break;
			 
		 }

		}
		
		
		
		
		
	}

}
