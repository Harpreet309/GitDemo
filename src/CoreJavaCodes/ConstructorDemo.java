package CoreJavaCodes;

public class ConstructorDemo {
	
	String name = "Harpreet";
	public ConstructorDemo()
	{
		System.out.println("I am Explicit Constructor");
	}
	
	public ConstructorDemo(int a, int b)
	{
		int c = a+b;
		System.out.println("Constructor with parameters" +"\t"+ c);
	}
	
	public void getData()
	{
		System.out.println("I am in Const CLass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo(1,2);
		//ConstructorDemo cn = new ConstructorDemo();
	
	}

}


