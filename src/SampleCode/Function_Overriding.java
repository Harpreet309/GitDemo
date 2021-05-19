package SampleCode;

public class Function_Overriding extends Function_Overriding1 {
	
	public void Method1()
	{
		System.out.println("Parent Class Method1");
	}
	public void Method2(int a)
	{
		System.out.println("Parent Class Method2");
		System.out.println(a);
	}
	public String Method2(String a)
	{
	System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_Overriding FO = new Function_Overriding();
		FO.Method1();
		FO.Method2(5);
		FO.Method2("Hello Parent");
		FO.Method3("Child Method");
		
		
		
	}

}
