import java.util.Scanner;
public class A44
{  //反直角三角形
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入整數:");
		int a=scn.nextInt();
		
		/*int i=a-1,j;
		while(i>=0)
		{    j=0;
			do{
				if(i>j)
				{
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
				j++;
			}while(j<a);
		        i--;
			System.out.println();
		}*/
		int i,j;
		for(i=a-1;i>=0;i--)
		{
			for(j=0;j<a;j++)
			{
				if(i>j)
				{
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
}
