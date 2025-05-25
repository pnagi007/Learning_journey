import java.util.*;
class DOB
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("Date:");
		int current_date=scan.nextInt();

		System.out.println("Month:");
                int current_month=scan.nextInt();

		System.out.println("Year:");
		int current_year=scan.nextInt();
	
		System.out.println("Date:");	
		int birth_date=scan.nextInt();

		System.out.println("Month:");
                int birth_month=scan.nextInt();

		System.out.println("Year:");
		int birth_year=scan.nextInt();

		int date=current_date - birth_date;
		int month=current_month - birth_month;
		int year=current_year - birth_year;

		date=(current_date - birth_date<0) ? date+30 : date;
		month=(current_date < birth_date) ? month-1 : month;
		year=(current_month < birth_month) ? year-1 : year;
		month=(current_month - birth_month<0) ? month+12 : month;
		System.out.println("Date:" + date + "month:" + month + "year:" + year);



	}
}