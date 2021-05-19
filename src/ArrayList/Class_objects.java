package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Class_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101,23,"Harpreet");
		Student s2 = new Student(102,24,"Rajveer");
		Student s3 = new Student(103,25,"Manpreet");
		
		ArrayList<Student> as = new ArrayList<Student>();
		as.add(s1);
		as.add(s2);
		as.add(s3);
		
		ListIterator<Student> itr = as.listIterator(as.size());
		while(itr.hasPrevious())
		{
			Student st = (Student) itr.previous();
			System.out.println(st.rollno+" "+st.age+ " "+st.name);
		}
		
		Iterator itr1 = as.iterator();
		while(itr1.hasNext())
		{
			Student st = (Student) itr1.next();
			System.out.println(st.rollno+" "+st.age+ " "+st.name);
		}


		

	}

}
