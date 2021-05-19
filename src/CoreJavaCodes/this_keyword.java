package CoreJavaCodes;

public class this_keyword {
	
	int a = 5;
	int k = 9;
	int b = 10;
	
	public this_keyword()
	{
		
		System.out.println("Implicit Constructor");
		
	}
	
	public this_keyword(int k, int b)
	{
		this();
		int d = this.k + this.b;
		int j = k + b;
		
		System.out.println("value of int j is"+ " " + j);
		System.out.println("value of int d is"+ " " + d);
		this.DemoMethod();
	}
	
	public void DemoMethod()
	{
		
		int a = 9;
		
		System.out.println("Value of Method Variable a is:" + " " + a);
		
		System.out.println("Value of Global Variable a is" + " " + this.a);
		
		int c = a + this.a;
		
		System.out.println("Result of Sum is:" + " " + c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		this_keyword th = new this_keyword(10,20);
		
		

	}

}
