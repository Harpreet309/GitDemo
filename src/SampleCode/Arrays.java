package SampleCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,6,7,8,9}; // This is one method to assign values in array
		String k[] = new String[5];
		
		
		int b[] = new int[5];
		
		b[0] = 6;
		b[1] = 7;
		b[2] = 8;
		b[3] = 10;
		b[4] = 11;
		
		List<Integer> abc = new ArrayList<Integer>(Arrays.asList(a));

	
	
		
		 
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		for(int c : b)
		{
			int j = c;
			
			System.out.println(j);
		}

	}

	private static Collection<? extends Integer> asList(int[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
