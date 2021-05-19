package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class ArrayList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ReverseString ccc = new ReverseString();
		
		
ArrayList<String> ABC =  new ArrayList<String>();

ArrayList<String> list=new ArrayList<String>();

List<String> lll = new ArrayList<String>();
lll.add("A");
lll.add("B");
lll.add("C");
lll.add("D");
lll.add("C");
lll.add("G");
lll.add("H");
lll.add("I");
lll.add("k");
lll.add("l");

System.out.println(lll.indexOf("C"));

// ---- addALL() method ------------//

ABC.addAll(lll);
System.out.println(ABC);

//-----------------------------------------------------//

	 
//------------ Iterating through Loop---------------------//		
		
		  for(int i=0; i<10; i++) {
		  
		  ABC.add(lll.get(i));
		  
		  
		  System.out.print(ABC);
		  
		  }
		  
//------------------------------------------------------------//		  
		  
		  
//---------------Iterating Data using Iterator---------------//
		  
		  Iterator itr = lll.iterator();
		  
		  
		  
		  while(itr.hasNext())
			  
		  { 
		  Object kkk = itr.next(); 
		  System.out.println(kkk);
		  
		  }
//-------------------------------------------------------------//		 
		
		  for(String charact : lll) 
		  
		  { System.out.print(charact);
		  
		  }
		 

//-------------using scanner------------------------------------//
		
		/*
		 * Scanner sp = new Scanner(System.in); int i = 0;
		 * 
		 * while(sp.hasNext()) { list.add(sp.next()); i++; if(i==10) { sp.close();
		 * System.out.print(list); break;
		 * 
		 * } }
		 */
//---------------------------------------------------------------//
		  
//------------------Using ListIterator-------------------------// 		  
		  
		  ListIterator<String> list1 = list.listIterator(list.size());
		  while(list1.hasPrevious())
		  { 
		  String str = list1.previous();
		  System.out.println(str); 
		  }
//------------------------------------------------------------------//		  
		  

//------------------Usage of Get and set methods--------------------//
		  
System.out.println("Value of get method: " + " " + ABC.get(4));	  

System.out.println("Value after Set method: " + " " + ABC.set(4, "Set"));

for(String C : ABC)
{
	System.out.println(C);
}

		
		
		
		
	}

}
