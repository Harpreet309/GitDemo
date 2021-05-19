package SampleCode;

public class Function_Overloading {
	
	public void PaymentMode(int credit_card)
	{
		System.out.println(credit_card);
	}
	
	public void PaymentMode(int debit_card, int credit_card)
	{
		System.out.println(debit_card + "\t" + credit_card );
	}

	public static void PaymentMode(String UPI)
	{
		System.out.println(UPI);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function_Overloading pay = new Function_Overloading();
		
		pay.PaymentMode(123456789);
		pay.PaymentMode(123654, 789654);
		PaymentMode("harpreetparas308@axis");
	}

}
