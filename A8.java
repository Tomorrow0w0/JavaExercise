//8. 讓使用者輸入一攝氏溫度，輸出相對應的華氏溫度。(F=C*9/5+32)
import java.util.Scanner;

public class A8
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入攝氏(C):");
		int C =scn.nextInt();
		float F = C*9/5+32;
		System.out.println("華氏(F)："+F);
		
	}
}
