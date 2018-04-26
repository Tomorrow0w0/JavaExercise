//27. 由亂數產生三個1~3000間的正整數代表西元年
//並求該年是平年或閏年。
//(4年一潤，逢100不潤，逢400又潤)
import java.util.Random;

public class A27
{
	public static void main(String[]args)
	{

		Random rcn=new Random();
		int a,b,c;
		a =rcn.nextInt(2999)+1;
		b =rcn.nextInt(2999)+1;
		c =rcn.nextInt(2999)+1;
		System.out.println(a+"年");
		System.out.println(b+"年");
		System.out.println(c+"年");
		
		if(a%4==0&&a%100!=0||a%400==0)
		{
			System.out.println(a+"是閏年");
		}else{
			System.out.println(a+"是平年");
		}
		   
		if(b%4==0&&b%100!=0||b%400==0)
		{
			System.out.println(b+"是閏年");
		}else{
			System.out.println(b+"是平年");
		}
		
		if(c%4==0&&c%100!=0||c%400==0)
		{
			System.out.println(c+"是閏年");
		}else{
			System.out.println(c+"是平年");
		}
			
		
		
	}
}
