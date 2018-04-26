/*54. 電腦用亂數產生一四個位的正整數，
並讓使用者輸入一四位數，
判斷並輸出使用者猜中幾位數?*/
import java.util.Random;
import java.util.Scanner;

public class A54
{
	public static void main(String[]args)
	{
		 Scanner scn= new Scanner(System.in);
		 Random rcn= new Random();
		int date[]= new int[4];
		int [] date2 =new int[4];
		int i,j;
		int end=0;
	
		System.out.println("請輸入一四個位的正整數：");
		
	
		for(i=0;i<4;i++)
		{
			date[i] =scn.nextInt();
	    }
		
		System.out.println("電腦亂數：");
		
		for(j=0;j<4;j++)
		{
			date2[j]=rcn.nextInt(8)+1;
			System.out.print(date2[j]);
	     }
		 
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
		       if(date[i]==date2[j])
		       {
			      end++;
				   break;
				   
				}
			}
		 }
		
		   System.out.println("\t"+"你猜中了"+end+"位數");
		    
}
}
