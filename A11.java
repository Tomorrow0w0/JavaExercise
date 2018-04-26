//11. 輸入兩個整數, 計算其合, 差, 乘積.
import java.util.Scanner;

public class A11
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入整數a");
		int a = scn.nextInt();
		System.out.println("請輸入整數b");
		int b = scn.nextInt();
		
		
		
		int end= a+b;
		int end2= a-b;
		int end3= a*b;
		
		System.out.println("合： "+end);
		System.out.println("差： "+end2);
		System.out.println("乘積： "+end3);
    }
}
