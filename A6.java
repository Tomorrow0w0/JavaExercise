//6. 輸入一個字元, 判斷是大寫或小寫或是其他字元

import java.util.Scanner;

public class A6
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入一個字元:");
		char n=scn.next().charAt(0);
		
	
		if(Character.isDigit(n)==true)//Character字元符號 Digit數字
		{
			System.out.println("為數字");
		 }
		 
		if(Character.isLetter(n)==true)//Letter 字母
		{
			System.out.println("為字母");
		}
			
		if(Character.isDigit(n)==false&&Character.isLetter(n)==false){
			System.out.println("為特殊字元");
		}
	}
}
