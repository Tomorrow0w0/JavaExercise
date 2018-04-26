/*12. 輸入國文, 英文和數學成績, 
      計算其總分數及每科平均成績*/
import java.util.Scanner;
public class A12
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println("請輸入國文成績：");
		int a=scn.nextInt();
		
		System.out.println("請輸入英文成績：");
		int b=scn.nextInt();
		
		System.out.println("請輸入國文成績：");
		int c=scn.nextInt();
		
		int end=a+b+c;
		float end2=end/3f;
		
		System.out.println("總分："+end+"\t平均："+end2);
	}
}
