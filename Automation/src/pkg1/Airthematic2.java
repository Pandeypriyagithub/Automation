package pkg1;

public class Airthematic2 {                                                 

	public int Div(int a, int b)
{
		int c =a/b;
		System.out.println("Div is " +c);
		return c;
}
	public int Sub(int d, int e) 
{
		int f = d-e;
		System.out.println("Sub is "+ f);
		return f;
}
   public int Sum(int g, int h)
{
	   int i = g+h;
	   System.out.println("Sum is "+ i);
        return i;
}
	
	public void Multi (int j, int k) 
{     int l=j*k;
	  System.out.println("Multi is "+ l);	
	  System.out.println("Final result of ((((10/2)-2)+2)-2)*2) = "+ l);	

}
	public static void main(String[] args) {                            //(((((10/2)-2)+2)-2)*2)
		Airthematic2 priya1 = new Airthematic2();
		int divresult =priya1.Div(10, 2);
	    int subresult = priya1.Sub(divresult, 2);
	    int sumresult = priya1.Sum(subresult, 2);
	    int result = priya1.Sub(sumresult, 2);
	    priya1.Multi(result, 2);
}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
