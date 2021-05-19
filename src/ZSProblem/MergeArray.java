package ZSProblem;

import java.util.HashSet;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean Flag = false;
		int[] A1 = {1, 2, 3, 4, 5,77};
		
		int[] B1 = {2,3,1,0,5,65};
		
		/*for(int i=0; i<A1.length; i++)
		{
			for(int k=0; k<B1.length; k++) 
			
			{
				if((A1[i]==B1[k]))
				{
					break;	
						
				}
				
				if(k==B1.length);
				{
					System.out.print(A1[i] + " ");
				}
				
				
			}  */
			
		HashSet<Integer> HS = new HashSet<Integer>();
		
		for(int i=0; i<A1.length; i++)
		{
		HS.add(A1[i]);
		}
		
		for(int i=0; i<B1.length; i++)
		{
			if(!HS.contains(B1[i]))
			{
				System.out.print(B1[i] + " ");
			}
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
