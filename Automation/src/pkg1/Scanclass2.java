package pkg1;

import java.util.Scanner;

public class Scanclass2 {                  //(((((x1*x2)-x3)+x4)-x5)/x6)

	public int sum (int x1, int x2)
	{
				int c= x1+x2;
				return c;
	}
			public int sub (int x3, int x4) 
	{
			int d = x3-x4;
			return d;
	}
		   public int multi (int x5, int x6) 
	{
		    int d= x5*x6;
		    return d;
	}	
			public int div (int x7, int x8) 
	{
			int e= x7/x8;
			return e;
	}
			public static void main(String[] args) {
			
			Scanclass2 obj =new Scanclass2();
		    Scanner s= new Scanner(System.in);         
		    
			System.out.println("Enter the value of x1");	
			int x1 =s.nextInt();
			
			System.out.println("Enter the value of x2");	
			int x2=s.nextInt();
			
			System.out.println("Enter the value of x3");	
			int x3= s.nextInt();

		    
			System.out.println("Enter the value of x4");	
			int x4=s.nextInt();
			
			System.out.println("Enter the value of x5");	
			int x5 =s.nextInt();
			
			System.out.println("Enter the value of x6");	//(((((x1*x2)-x3)+x4)-x5)/x6)
			int x6 =s.nextInt();

	        int multiresult =obj.multi(x1, x2);
	        int subresult =obj.sub(multiresult,x3);
	        int sumresult =obj.sum(subresult, x4);
	        int result =obj.sub(sumresult, x5);
	        obj.div(result, x6);
	        System.out.println("Final result is = " + obj.div(result, x6) );
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
