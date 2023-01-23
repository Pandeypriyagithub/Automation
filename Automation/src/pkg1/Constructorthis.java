package pkg1;

public class Constructorthis {

	public Constructorthis ()
{
	this(11,22,33);
 System.out.println("Default constructor");	
		
}
	
	public Constructorthis (int a) 
{      this();
	System.out.println("One parametrized constructor ");	
		
}
   public Constructorthis (int a, int b) 
{  
	   this(11,22,33,44);
  System.out.println("Two parametrized constructor ");
}
	
   public 	Constructorthis(int a, int b, int c) 
{
	
System.out.println("Three parametrized constructor "); 	
}

   public Constructorthis (int a, int b, int c, int d)
{  
	   this(11);
	System.out.println("Fourth parametrized constructor");
}
	
	public static void main(String[] args) {
		
	Constructorthis obj = new Constructorthis(22,11);
				
}
	
	
	
	
	
	
}
