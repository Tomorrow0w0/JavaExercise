//28. 由亂數產生一1~1000的貨品價格,
//求出若以仟元鈔付款購買,
//應找回最少的錢幣個數 500元,100元,50元,10元,5元,1元各為若干個。
import java.util.Scanner;
import java.util.Random;
public class A28
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		Random rnd = new Random();
		int date[] =new int[3];
		date[1]=rnd.nextInt(999)+1;
		
		System.out.println("商品價格：= "+date[1]);
		date[2]=1000-date[1];
		System.out.println("以1000元付款找"+date[2]+"元");
		
		int end,end2,end3,end4,end5,end6,end7,end8,end9,end10,end11;
		
		end = date[2]/500;
		end2= date[2]%500;

		end3= end2/100;
		end4= end2%100;

		end5 = end4/50;
		end6= end2%50;

		end7 = end6/10;
		end8= end2%10;

		end9 = end8/5;
		end10= end2%5;

		end11 = end10/1;
		
		System.out.println("最少錢幣個數");
		System.out.println("500元"+end+"張");
		System.out.println("100元"+end3+"張");
		System.out.println("50元"+end5+"個");
		System.out.println("10元"+end7+"個");
		System.out.println("5元"+end9+"個");
		System.out.println("1元"+end11+"個");
		
		
		}
}
