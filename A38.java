//38. 讓使用者輸入一正整數n，
//計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
import java.util.Scanner;
public class A38
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入一正整數n:");
		int n=scn.nextInt();
		int i,end=0;
		for(i=1;i<n+1;i++){
			end=end+i*(i+1);
		
		}
		System.out.println("1*(1+1) +2*(2+1)+ … + "+n+"*"+"("+n+"+"+1+")"+"=" +end);
	}
}
