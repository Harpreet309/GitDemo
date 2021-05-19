package SampleCode;

public class India_Trafic_System implements Trafic_rules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trafic_rules a =	new India_Trafic_System(); 
		a.StopRed();
		a.WaitYellow();
		a.GoGreen();

	}

	@Override
	public void StopRed() {
		// TODO Auto-generated method stub
		System.out.println("Stop here!!!!");
	}
	

	@Override
	public void WaitYellow() {
		// TODO Auto-generated method stub
		System.out.println("Ready to Go");
	}

	@Override
	public void GoGreen() {
		// TODO Auto-generated method stub
		System.out.println("Start and Go");
	}

}
