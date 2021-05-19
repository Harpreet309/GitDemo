package ArrayList;

import java.util.ArrayList;

import java.util.Collections;

 class ReverseString {
	
	
	public void abc()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> list = new ArrayList<String>();
	
	String[] color = {"red", "green", "blue", "grey", "magenta"};
	
	for(String col : color)
	{
		list.add(col);

	}
	
	   System.out.println("Before Sort " + list);
	
       Collections.sort(list); 
       
       System.out.println("After Sort with ascending order" + list);
       
       Collections.sort(list,Collections.reverseOrder());
       
       System.out.println("After Sort with Descending order" + list);
       
       
       
       
      
	


	}

}