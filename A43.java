/*43. 讓使用者輸入一正整數n，以字元 '*' 輸出高度為n的三角形如下所示：
(請利用迴圈, 不要直接用 printf方式直接輸出)   
ex. n=4       
*  
**     
***      
****/
	import java.util.Scanner;
	public class A43
	{
		public static void main(String[]args)
		{
			Scanner scn= new Scanner(System.in);
			System.out.println("請輸入邊長n：");
			int n = scn.nextInt();
			int i,j;
			for(i=n;i>0;i--)
			{
				System.out.print("");

				for(j=n;j>=i;j--)
				{
					System.out.print("*");
				}

				System.out.println("");

			}

		}
	}
