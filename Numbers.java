package gayathri;
import java.util.Scanner;
public class Numbers {
	static String words(int e) {
	if(e==1)
	{
		return "one";
	}
	else if(e==2)
	{
		return "two";
	}
	else if(e==3)
	{
		return "three";
	}
	else if(e==4)
	{
		return "four";
	}
	else if(e==5)
	{
		return "five";
	}
	else if(e==6)
	{
		return "six";
	}
	else if(e==7)
	{
		return "seven";
	}
	else if(e==8)
	{
		return "eight";
	}
	else
	{
		return "nine";
	}
	}
static String letters(int e) { 
	if(e==1)
	{
		return "ten";
	}
	else if(e==2)
	{
		return "twenty";
	}
	else if(e==3)
	{
		return "thirty";
	}
	else if(e==4)
	{
		return "fourty";
	}
	else if(e==5)
	{
		return "fifty";
	}
	else if(e==6)
	{
		return "sixty";
	}
	else if(e==7)
	{
		return "seventy";
	}
	else if(e==8)
	{
		return "eighty";
	}
	else
	{
		return "ninty";
	}
}
static String teen(int e) {
	if(e==1)
	{
		return "eleven";
	}
	else if(e==2)
	{
		return "twelve";
	}
	else if(e==3)
	{
		return "thirteen";
	}
	else if(e==4)
	{
		return "fourteen";
	}
	else if(e==5)
	{
		return "fifteen";
	}
	else if(e==6)
	{
		return "sixteen";
	}
	else if(e==7)
	{
		return "seventeen";
	}
	else if(e==8)
	{
		return "eighteen";
	}
	else
	{
		return "ninteen";
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		String ans="";
		int n=num;
		int one=n%10;
		n=n/10;
		int ten=n%10;
		int hundred=n/10;
		if(num>=100 && num<1000) {
			ans+=words(hundred) + " hundred ";
			if(ten!=0 && !(ten>10 && ten<20))
			{
				ans+=letters(ten);
				if(one!=0)
				{
					ans+=" " + words(one);
				}
			}
			else if(ten==1 && one!=0)
			{
				ans+=teen(ten);
			}
		}
		
		System.out.println(" " + ans);
	}

}
