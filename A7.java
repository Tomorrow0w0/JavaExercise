//7. 輸入一個字元, 轉換其大小寫輸出
//(大寫 ->小寫, 小寫->大寫)
import java.util.Scanner;
public class A7
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入一個字元:");
		char n=scn.next().charAt(0);

		if(Character.isUpperCase(n)==true){
				System.out.println("小寫： "+Character.toLowerCase(n));
		     }else{
				 System.out.println("大寫： "+Character.toUpperCase(n));
			 }
		}
	
}
