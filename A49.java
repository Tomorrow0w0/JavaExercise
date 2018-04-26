//49. 讓使用者輸入一正整數n，判斷並輸出該整數為幾位數
import java.util.Scanner;

public class A49
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入一正整數n:");
		
		String n = scn.next();
		
		System.out.println("為"+n.length()+"位數");// '字串'.length()長度
    }
}
