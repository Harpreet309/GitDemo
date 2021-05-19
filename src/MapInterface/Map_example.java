package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Map_example {

	public static void main(String[] args) {


	//	Map<Integer,String> map=new HashMap<Integer,String>();  
		
		 //Adding elements to map  
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Amit");
		map.put(2, "Kumar");
		map.put(3, "Suraj");
		map.put(4, "Singla");
		map.put(5, "Kaku");
		map.put(5, "Kaku");
		map.put(6, "shardha");
		map.put(7, "shardha");
		

		//--- New Style to iterate -----------------------//
		 //Traversing Map  
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//---Different old methods to iterate -----------------------//
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		Iterator itr1 = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		while(itr1.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr1.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//-----------------------------------------------------------------//
		
		

		
		
		
		
		
		

	}

}
