package gayathri;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		System.out.println("Year:" + year);
		int month=scan.nextInt();
		System.out.println("Month:" + month);
		isYear y=new isYear();
		boolean l=y.display(year);
		System.out.println("The year is" + (l?"leap year":"not leap year"));
		int day=0;
		if(month==1){
			day=31;			
		}
		else if(month==2){
			day=l?29:28;			
		}
		else if(month==3){
			day=31;			
		}
		else if(month==4){
			day=30;			
		}
		else if(month==5){
			day=31;			
		}
		else if(month==6){
			day=30;			
		}
		else if(month==7){
			day=31;			
		}
		else if(month==8){
			day=31;			
		}
		else if(month==9){
			day=30;			
		}
		else if(month==10){
			day=31;			
		}
		else if(month==11){
			day=30;			
		}
		else if(month==12){
			day=31;			
		}
		else{
			System.out.println("Invalid month");
		}
		System.out.println(day);
	}

}
class isYear{
	public boolean display(int y1) {
		return (y1%4==0 && y1%400==0);
	}
}
