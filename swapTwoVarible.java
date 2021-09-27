package basic;

public class swapTwoVarible {

	public static void main(String[] args) {
		//4. Write a program to swap two variables 
		//(with and without third variable)

		int a=46;
		int b=60;
		System.out.println("before swapping =");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("After Swaping= ");
		  int temp=a;
		      a=b;
		      b=temp;
		      
		      System.out.println("a ="+a);
				System.out.println("b ="+b);
				System.out.println("===========================================");
		//without third variable		
	    int c=69;
	    int d=89;
	    System.out.println("before swapping =");
		System.out.println("c ="+c);
		System.out.println("d ="+d);
		
		     c=c+d;
		     d=c-d;
		     c=c-d;
		    
		 	System.out.println("c ="+c);
			System.out.println("d ="+d);
		      

	}

}
