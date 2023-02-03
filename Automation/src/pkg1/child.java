package pkg1;

public class child extends parent
{

public child() 
{   this(11,22);
   System.out.println("Child default constructor ");
}
	
public child (int a) 
{  
	this(11,22,33);
System.out.println("Child 1 parametrized constructor");
}	
	
public child (int a, int b) 
{    
	super(11,22);
System.out.println("Child 2 parametrized constructor");
}
	
public child (int a, int b, int c) 
{     
	this();
    System.out.println("Child 3 parametrized constructor");	
}	
  public static void main(String[] args) 
{

       child obj = new child(11);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
