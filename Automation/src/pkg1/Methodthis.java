package pkg1;

public class Methodthis {

	public void m() 
{
	System.out.println("Default method");	
		
		
}
	
   public void m1(int a){
	   this.m4(11, 22, 33, 44);
	   this.m();
	System.out.println("One parametrized method");
	

}
   public void m2(int a, int b) 
{      this.m1(22);
	   this.m3(1, 2, 3);
	System.out.println("Two parametrized method");  
    
}
	public void m3(int a, int b, int c) 
{
 System.out.println("Three parametrized method ");

}
	
	public void m4(int a, int b, int c,int d) 
{
 
System.out.println("Four parametrized method");
}
	
	public static void main(String[] args) {
	
		Methodthis obj = new Methodthis();
		obj.m2(11, 22);

}
	
	
	
	
	
	
	
	
}
