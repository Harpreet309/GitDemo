package String;



public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "Harpreet";
		
		char a;
		
		int count = 1;
		
		char[] ab = S.toCharArray();
		
		char[] ch = {'S','A','C','H','I','N'};
		
		String S1 = new String(ch);
		
		S = S.concat("Tendulkar");
		
		System.out.println(S);
		
		System.out.println(S1);
		
		System.out.println(S1.contains("C"));
		
		System.out.println(ab[0]);
		
		

	}

}
