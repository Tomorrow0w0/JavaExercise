//30. 讓使用者輸入六個數
//統計正數, 負數及零各有多少個。
import java.util.Scanner;
public class A30
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		int date[]=new int[10];
		int i; 
		int end=0,end2=0,end3=0;
		System.out.println("請輸入6個數：");
		for(i=0;i<6;i++){
			date[i]=scn.nextInt();
			if(date[i]!=0){
				if(date[i]>0){
					end++;
				}else{
					end2++;
				}
				
			}else{
				end3++;
	        }
		}
		
			
			System.out.println("正數有："+end+"個");
		    System.out.println("負數有："+end2+"個");
		System.out.println("零有："+end3+"個");
			
			
	}
  }
