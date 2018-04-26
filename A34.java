//34 電話費
import java.util.Scanner;
public class A34
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入單月使用分鐘數");
		int n= scn.nextInt();
		double end = 0;
		if(n<=600){
			end = n*0.5;
		}

		if(n>600 && n<=1200){
			end = n*0.5*0.9;
		}

		if(n>1200){
			end = n*0.79;
		}
		
		System.out.println("電話費：= "+end);
		}
}
