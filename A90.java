/*90. 請設計一函數myrand(n,m)，
產生n個0~m之間的亂數，
傳回並輸出這n個數的平均值.*/
import java.util.Scanner;
import java.util.Random;
public class A90
{
    public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("n個0~m之間的亂數");
		System.out.println("請輸入n：");
		int n=scn.nextInt();
		System.out.println("請輸入m:");
		int m=scn.nextInt();
		
		myrand(n,m);
	}
	
	public static void myrand(int n,int m)
	{
		
		Random rcn=new Random();
		
		int date[]=new int[n];
		int i;
		int end=0; float end2;
		
		for(i=0;i<n;i++)
		 {
			 date[i]=rcn.nextInt(m);
			 System.out.println("亂數"+(i+1)+":");
			 System.out.println(date[i]);
			 end=end+date[i];
		 }
		     end2=end/n;
		     System.out.println(n+"個亂數的平均值:");
			 System.out.println(end2);
	}
	
}
