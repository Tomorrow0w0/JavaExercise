//55. 設計一個程式讓使用者輸入5位學生的考試成績，並分別印出
//(1)全班成績平均分數、
//(2)不及格人數(低於60分者)、
//(3)最高及最低分數。
import java.util.Scanner;


public class A55
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		int date[]=new int[15];
		System.out.println("請輸入五位學生的成績:");
		int i;
		int sum=0;
		
		for(i=1;i<6;i++)
		{
			date[i]=scn.nextInt();
				
			if(date[i]<60){
				sum++;
			}
		}
			
		date[7]=(date[1]+date[2]+date[3]+date[4]+date[5])/5;
		
		
		
		
		date[8]=Math.max(Math.max(Math.max(Math.max(date[1],date[2]),date[3]),date[4]),date[5]);
		date[9]=Math.min(Math.min(Math.min(Math.min(date[1],date[2]),date[3]),date[4]),date[5]);
		
		System.out.println("全班平均成績："+date[7]);
		System.out.println("不及格人數："+sum);
		System.out.println("最高分："+date[8]);
		System.out.println("最底分："+date[9]);
	}
}
