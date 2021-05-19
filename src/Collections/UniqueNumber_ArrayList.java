package Collections;

import java.util.ArrayList;

public class UniqueNumber_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ak[] = {8,9,8,9,4,6,6,4,8,9,10};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<ak.length; i++)
		{
			int k=0;
			
			if(!al.contains(ak[i]))
			{
				al.add(ak[i]);
				
				k++;
				
				for(int j=i+1; j<ak.length; j++)
				{
					if(ak[i]==ak[j])
					{
						k++;
					}
				}
				
				System.out.println(ak[i]);		
				System.out.println(k);
				if(k==1)
				{
					System.out.println(ak[i] + " " +"is unique number");
				}
			}
		}
		
	}

}
