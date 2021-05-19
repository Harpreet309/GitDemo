package SampleCode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String demo = "rahul";
		
		String empty = "";
		
		for(int i = demo.length()-1; i>=0 ; i--)
		{
			empty = empty + demo.charAt(i);
		}
		
		System.out.println(empty);
		
		if(demo.equalsIgnoreCase(empty))
		{
			System.out.println("String is palendrome");
		}

	}

}
