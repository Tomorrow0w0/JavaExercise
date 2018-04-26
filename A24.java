//24. 讓使用者輸入三角形的三邊長a, b, c(a<=b<=c)
//判斷並輸出a, b, c是否為合法三邊長。
import java.util.Scanner;
public class A24
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("三角形的三邊長a, b, c(a<=b<=c)．請輸入：");
		System.out.println("邊長a:");
		int a= scn.nextInt();
		
		System.out.println("邊長b:");
		int b= scn.nextInt();
		
		System.out.println("邊長c:");
		int c= scn.nextInt();
		
		if(a<=b&&b<=c){
			if((a+b)>c){
				System.out.println("為合法三邊.可形成三角形");
				
			}else{
				System.out.println("為不合法三邊.無法形成三角形");
			}
			
		}else{
			System.out.println("輸入各式錯誤");
		}
		
		
		
	}
}
