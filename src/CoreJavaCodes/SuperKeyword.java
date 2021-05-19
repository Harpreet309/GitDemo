package CoreJavaCodes;

public class SuperKeyword extends ConstructorDemo {

	String name = "Rahul";
	
	public SuperKeyword()
	{
		super(5,6);
		System.out.println("I am Super Constructor");
	}
	
	public void getData()
	{
		System.out.println("I am in Super CLass");
		System.out.println(name);
		System.out.println(super.name);
		super.getData();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyword SK = new SuperKeyword();
		SK.getData();
		
		
		
	}

}
