//25. 讓使用者輸入一合法三角形的三邊長a, b, c(a<=b<=c)，     
//判斷並輸出該三角形為「直角Δ」，「鈍角Δ」，或「銳角Δ」。
import java.util.Scanner;
public class A25
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
				if(a*a+b*b==c*c){
					System.out.println("為直角三角形");
				   }else{
					   if(a*a+b*b>c*c){
						   System.out.println("為銳角三角形");
					   }else{
						   System.out.println("為鈍角三角形");
					   }
				   }

			 }else{
				System.out.println("為不合法三邊.無法形成三角形");
			      }

		}else{
			System.out.println("輸入各式錯誤");
		     }
		
		
	}
}
