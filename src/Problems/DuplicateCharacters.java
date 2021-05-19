package Problems;

public class DuplicateCharacters {
	
	public void multiply()
	{
		
	}
	
	public static void add()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String Duplicate = "Harpreet Harry";
		int count;
		
		char[] chars = Duplicate.toCharArray();
		
		for(int i=0; i<chars.length; i++)
		{
			count = 1;
			
			for(int j = i+1; j<chars.length; j++)
			{
				if(chars[i]==chars[j] && chars[i]!=' ')
				{
					count++;
					chars[j]=0;
				}
			}
			if(count>1 && chars[i]!= 0)
			{
				System.out.println(chars[i]);
			}

			
		}
		
	}

}
