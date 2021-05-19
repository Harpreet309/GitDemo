package CoreJavaCodes;

public class Use_of_static {
	
	String name;
	String city;
	static String State;
	static int i;
	
	
	   static { 
		   State = "Punjab"; 
		    i = 0 ;  
	   }
	 	
	public Use_of_static(String name, String city)
	{
		this.name = name;
		this.city = city;
		
		i++;
	}
	
	public void without_Static()
	{
		System.out.println("Name is" + " " + name );
		System.out.println("City is" + " " + city);
		System.out.println("State is" + " " + State);
		
	}
	
	
	  public static void with_Static() { System.out.println("Name of the State is"
	  + " "+ State); }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use_of_static us = new Use_of_static("Harpreet" , "Amritsar");
		
		Use_of_static us1 = new Use_of_static("Singh", "Patiala");
		
		Use_of_static us2 = new Use_of_static("Thukral", "Chandigarh");
		
		us.without_Static();
		us1.without_Static();
		us2.without_Static();
		Use_of_static.with_Static();
		
		
		
	}

}
