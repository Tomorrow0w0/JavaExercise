//13. 寫一函數square(n,c),以c字元,印出邊長為n之實心正方形。
import java.util.Scanner;
public class A13
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入邊長n：");
		 int n=scn.nextInt();
		System.out.println("請輸入字元c：");
		 char c= scn.next().charAt(0);
		 square(n,c);
	}
	
	public static void square(int n,char c)
	{

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
		 
	
}
