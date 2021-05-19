package SampleCode;

public class MaxNum_MinNumColoumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1  2  3
		 4  5  6
		 7  8  9
		 */
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int min = a[0][0];
		int mincount = 0;
		
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					mincount = j;	
				}
			}
		}
		
		int maxcount = a[0][mincount];
		int k=0;
		while(k<3)
		{
			if(a[k][mincount]>maxcount)
			{
				maxcount = a[k][mincount];
			}
			k++;
		}
		
		System.out.println(maxcount);

	}

}
