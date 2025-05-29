package gayathri;
import java.util.Scanner;
public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		String gender=scan.next();
		String a="";
		char g=gender.charAt(0);
		if(age<=17)
		{
			if(g=='m')
			{
				a="Room 1";
			}
			else if(g=='f')
			{
				a="Room 3";
			}
		}
		else
		{
			if(g=='m')
			{
				a="Room 2";
			}
			else if(g=='f')
			{
				a="Room 4";
			}
		}
		System.out.println("The room is " + a);

	}

}
