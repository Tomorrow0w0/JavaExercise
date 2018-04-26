import java.util.Scanner;
//正三角形
public class A45
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個整數：");
		int h= scn.nextInt();
		int last =(2*h)-1;
		int two =(last-1)/2;
		int i,j;
		for(i=1;i<=h;i++)
		{
			for(j=0;j<two;j++)
			{
                System.out.print(" ");
                 two--;
			}
			
			for(j=0;j<(2*i)-1;j++)
			{
				System.out.print("*");
			}
			
			
			 System.out.println();
		}
		
		
	}
}
