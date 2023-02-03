package pkg1;

public class mobile extends Electronics
{

	public void method1() 	
{   System.out.println("Child default method");	
}
	
	public void method2(int a) 
{
	System.out.println("Child 1 parametrized method");	
}
    public void method3(int a, int b) 
{       super.m1();
    	super.m3(7, 8);
    	super.m2(5);
    	super.m4(1, 2, 3);
    System.out.println("Child 2 parametrized method");
}
	public void method4(int a, int b, int c) 
{       this.method3(21, 22);
		this.method1();
		this.method2(22);
    System.out.println("Child 3 parametrized method");		

}
	public static void main(String[] args) {
		
		mobile obj = new mobile();
		obj.method4(11, 12, 13);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
