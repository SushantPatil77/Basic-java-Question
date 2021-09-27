package basic;

public class CompoundInterest {

	public static void main(String[] args) {
		
		//6. Write a program to find Compound Interest. (Variations)
		  int p=15000;
		  float r=12.3f;
		  int n=14;
		  int t=2;
		  
		  double a=(1+(r/n));
		  double b=n*t;
		  double c=Math.pow(a, b);
		  double finalamount=p*c;
		  System.out.println("Compound Interest ="+finalamount);

	}

}
