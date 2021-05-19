package SampleCode;

public class Function_Overriding1 {
	
	public void Method1()
	{
		System.out.println("Child Class Method1");
	}
	public void Method2(int a)
	{
		System.out.println("Child Class Method2");
		a =5;
		System.out.println(a);
	}
	public String Method3(String a)
	{
		System.out.println(a);
		return a;
	}

}
