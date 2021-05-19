package HashSet;

import java.util.Arrays;

import java.util.HashSet;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// -- HashSet : Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.--//

		
		//-----Add Elements in HashSet and iterate ----------------------//
		
		HashSet<String>  set = new HashSet<String>();
	
		String[] metals = {"Gold","Platinum","Silver","Iron","Copper","Diamond","Zinc","Gold","Silver"};
		
		
		
		System.out.print("Metals as Array: " +Arrays.toString(metals));
		
		System.out.println("");
		
		
		  for(String metal:metals) {
		  
		  
		  if(set.add(metal))
			  
		  { 
			  System.out.print(set);
		  } 
		  else 
		  {
		  System.out.println("Duplicate Value"+" "+metal);
		  
		  }
		  
		  
		  }
		 
	
		
		
		
		
	}

}
