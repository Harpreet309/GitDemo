package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-------Arraylist-----------//
		
		ArrayList<String> AT = new ArrayList<String>();
		
		AT.add("ABC");
		AT.add("DEF");
		AT.add("KAK");
		AT.add(1, "AAA");
		AT.add("ABC");
		System.out.println(AT);
		
		HashSet<Integer> HS = new HashSet<Integer>();
		HS.add(1);
		HS.add(2);
		HS.add(0);
		HS.add(3);
		HS.add(-1); 
		HS.add(7);
	Iterator<Integer> it = HS.iterator();
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
	
		
		

	}

}
