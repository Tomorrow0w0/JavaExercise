/*59. 設計一個程式，
讓使用者輸入一個正整數n，
判斷並輸出n的多少次方才會大於10000.*/
import java.util.Scanner;
public class A59
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個整數：");
		int n= scn.nextInt();
		int end=0;
		do{
		   end++;
		}while(Math.pow(n,end)<10000);
		System.out.println(n+"的"+end+"次方="+(int)Math.pow(n,end)+"大於10000");
	}
}
