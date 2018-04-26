//36. 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
import java.util.Scanner;

public class A36
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入一個整數");
		int n = scn.nextInt();
		int i=1;
		int end=1;
		while(i<=n){
			end = end*i;
			i++;
		};
		System.out.println("n!= "+end);
}
}
