package basic;

public class YearConvertedIntoDAyANdMonth {

	public static void main(String[] args) {
//		5. Write a program to convert days into years,
		//weeks and days.{Hint:Input-373 daysOutput-1Year,1Weak,1day}
	
		
		int input=373;
		int year=input/365;
		int rem1=input%365;
		System.out.println("Year= "+year);
		int month=rem1/30;
		int rem2=rem1%30;
		System.out.println("month= "+month);
		int week=rem2/7;
		int days=rem2%7;
		System.out.println("Week ="+week);
		System.out.println("Day ="+days);

	}

}
