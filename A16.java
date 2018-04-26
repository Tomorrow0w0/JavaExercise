//16. 輸入一正整數, 判斷其奇偶.
import java.util.Scanner;
public class A16
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.print("請輸入一正數：");
		int n =scn.nextInt();
		
		if(n%2==0){
			System.out.println("此數為偶數");
		}else{
			System.out.println("此數為奇數");
		}
		
		}
}
