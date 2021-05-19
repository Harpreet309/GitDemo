package SampleCode;

public class Abstract_examples extends Abstract_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_examples ab = new Abstract_examples();
		
		System.out.println(ab.AirplaneColor());
		ab.FlyingGuidelines();
		ab.EngineRules();

	}

	@Override
	public String AirplaneColor() {
		// TODO Auto-generated method stub
		
		String a = "Blue";
		return a;
	}

}
