package SampleCode;

public class SmallestNum_MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = {{10,0,55},{99,44,0},{55,55,3}};
		
		int min = abc[0][0];
		
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j]<min)
				{
					min = abc[i][j];
					
				}
			}
		}
		
		System.out.println(min);
		
       int max = abc[0][0];
		
		for(int i=0; i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				if(max<abc[i][j])
				{
					max = abc[i][j];
					
				}
			}
		}
		
		System.out.println(max);
		
	}

}
