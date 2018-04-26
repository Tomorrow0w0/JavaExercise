//53. 設計一猜數字程式，由電腦隨機產生一亂數(1~100)讓使用者來猜。
//每猜一次程式必須回應使用者<答對>、<太大>或<太小>，   
//一直到猜對才結束程式。
import java.util.Scanner;
import java.util.Random;
public class A53
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		Random rcn= new Random();
		
		System.out.println("請猜1～100.並數入其中一數字：");
		int a,i; int j=0;
		a=rcn.nextInt(99)+1;
		
		
		do{
		
		i=scn.nextInt();
		
		 if(i==a){
				System.out.println("恭喜你猜對了,數字為："+a);
			}else{
				System.out.println("你猜錯了");
				if(i>a){
					System.out.println("太大.再猜一次");
		        }else{  
		        System.out.println("太小.再猜一次");
				  }
				}
				j++;
			}while(i!=a);//至少執行1次 do while
			
			System.out.println("共猜了"+j+"次");
			}
		   
			
		 }
