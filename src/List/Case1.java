package List;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-------------Different Lists-------------------------//
		
		//Creating a List of type String using ArrayList  
		List<String> list1=new ArrayList<String>();  
		  
		//Creating a List of type Integer using ArrayList  
		List<Integer> list2=new ArrayList<Integer>();  
		  
		//Creating a List of type Book using ArrayList  
		List<Book> list3=new ArrayList<Book>();  
		  
		//Creating a List of type String using LinkedList  
		List<String> list4=new LinkedList<String>(); 
		
		//------------------------------------------------------//
		
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Gauva");
		list1.add("Grapes");
		
		for(String fruit : list1)
		{
			System.out.println(fruit);
		}
		
		//----Creating Array and printing---------------//
		
		String[] Veges = {"Potato","Onion","Brinjal","Loki"};
		System.out.println("Printing Array" +" " + Arrays.toString(Veges));
		
		//----How to convert Array to List---------------//
		
		List<String> list = new ArrayList<String>();
		
		for(String lang : Veges)
		{
			list.add(lang);
		}
		
		System.out.println("Array to list: " + " " + list);
		
		//-------------How to convert List to Array---------------//
		
		Veges = list.toArray(new String[list.size()]);
		
		System.out.println(Arrays.toString(Veges));
		
		
		
		
		

	}

}
