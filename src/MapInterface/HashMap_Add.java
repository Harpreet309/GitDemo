package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Add {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
		
	    System.out.println("Initial list of elements: "+hm); 
	    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      hm.put(101, "Kaku");
	      
	      System.out.println("After Invoking put() method");
	      
	      for(Map.Entry m : hm.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      
	      hm.putIfAbsent(103, "Gaurav");
	      
          System.out.println("After Invoking putifAbsent() method");
	      
	      for(Map.Entry m : hm.entrySet())
	      {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"Sharma");
	      map.putAll(hm);
	      System.out.println("After invoking putAll() method ");
	      
	      for(Map.Entry m : map.entrySet())
	      {
	    	  System.out.println(m.getKey()+ " " + m.getValue());
	      }
	      
	      //key-based removal  
	      map.remove(100);
	      map.remove(101, "Kaku");
	      System.out.println("After invoking key-based removal");
	      for(Map.Entry m : map.entrySet())
	      {
	    	  System.out.println(m.getKey()+ " " + m.getValue());
	      }
	      
	      
	      
	      

	      
	      
	      
		
		
		
		
		

	}

}
