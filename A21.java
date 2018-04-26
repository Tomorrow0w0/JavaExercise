//21. 設計一猜數字遊戲(由1~5之間選擇一亂數，讓使用者猜一次，並顯示結果
import java.util.Scanner;
import java.util.Random;
public class A21
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		Random rcn= new Random();
		
		System.out.println("請猜1～5：");
		int n= scn.nextInt();
		int date[]= new int[4];
		
		date[1]=rcn.nextInt(4)+1;
		
		System.out.println("結果："+date[1]);
		
		if(n==date[1]){
			System.out.println("你猜對了");
		}else{
			System.out.println("你猜錯了");
		}
	}
}
