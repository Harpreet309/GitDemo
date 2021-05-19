package MapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMap_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		String[] abc = {"Fruits","Veges","Roast","Meat"};
		
		for(int i=0; i<abc.length; i++)
		{
			for(int j=i; j<abc.length; j++)
			{
				map.put(j, abc[j]);
			}
		}
		System.out.println(map);
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//----------------------Compare By Key--------------------------------------------//
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		//----------------------Compare by key in descending order------------------------//
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
		//----------------------Compare By Value--------------------------------------------//
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//----------------------Compare by Value in descending order------------------------//
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
		
		
		
		
		   
	}

}
