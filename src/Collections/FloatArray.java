package Collections;

public class FloatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] abc = {12.5f,22.5f,16.5f,19.5f,17.5f,18.5f,21.2f,20.5f,22.6f};
		
		//System.out.println(abc.length);
		
		float f = abc[0];
		float Secondmax = 0;
		float Thirdmax = 0;
		float d = 22.6f;
		float min =0;
		
		for(int p=0; p<abc.length; p++)
		{
			if(abc[p]<=f) {
				
				min=abc[p];
			}
		}
		
		for(int i = 0; i<abc.length;i++)
		{
			if((f<abc[i]) && (abc[i]<d))		
		{
				
				  Secondmax = abc[i]; 
				
		}
			
		for(int j = 0; j<abc.length;j++)
		{
			if((f<abc[j]) && (abc[j]<Secondmax))
			{
				Thirdmax = abc[j];
						 
			}
		}
		}		

	

		 for(int k =0; k<abc.length; k++)
			 
		 { if((min<abc[k]) && (abc[k]<Thirdmax)) 
		 {
		 System.out.print(abc[k]);
		 System.out.println("");
		 }  
		 }
		
		System.out.println("Value is" + Secondmax);
		System.out.println("Value is" + Thirdmax);
	//	System.out.println("Value is" + min);
		
	}
}
