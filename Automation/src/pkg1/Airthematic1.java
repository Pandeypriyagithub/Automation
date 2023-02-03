package pkg1;

public class Airthematic1 {        
	public int sum(int a, int b) 
{
	int c= a+b;
	System.out.println("Sum is " + c);
	return c;
		
}
	public int sub(int d, int e)
{
	int f = d-e;
	System.out.println("Sub is "+ f);
	return f;
}
   public int multi (int g, int h)	{
	   
   int i= g*h;
   System.out.println("Multi is "+ i);
   return i;
	   
}
	public void div(int j, int k)	
{
	int l= j/k;
	System.out.println("Div is " +l );
	System.out.println("Final result of (((((10+2)+2)-2)*2)/2) = "+ l);	
}
	
	public static void main(String[] args) {
	Airthematic1 priya = new Airthematic1();           //(((((10+2)+2)-2)*2)/2)
	int  sumresult =priya.sum(10, 2);
	int result =priya.sum(sumresult, 2);
	int subresult=priya.sub(result, 2);
	int multiresult =priya.multi(subresult, 2);
	priya.div(multiresult, 2);
		
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	