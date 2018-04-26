//40. 讓使用者輸入一正整數n，並輸出
//2^1+2^2+2^3+...+2^n的值。
import java.util.Scanner;
public class A40
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入一正整數n:");
		int n=scn.nextInt();
		double end=0;
	
	for(int i=1;i<n+1;i++){
		end=end+Math.pow(2,i);//MAth.pow(2,i); 2的i次方
		
		}
		
		System.out.println("2^1+...+2"+"^"+n+"= "+end);
		
	
	}
}
