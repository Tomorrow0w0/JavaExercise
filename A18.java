/*18. 輸入兩個整數, 輸出 C(m,n). 
   C(m,n)=m!/[n!(m-n)!]*/
import java.util.Scanner;
public class A18
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println("請輸入整數m：");
		int m=scn.nextInt();
		System.out.println("請輸入整數n：");
		int n=scn.nextInt();
		C(m,n);
	}
	
	public static void C(int m,int n)
	{   
	    int end1=1,end2=1,end3=1,end4;
		if(m>n){
		for(int i=1;i<=m;i++)
		{
			end1=end1*i;
		}
		
		for(int j=1;j<=n;j++)
		{
			end2=end2*j;
		}
		
		for(int k=1;k<=m-n;k++)
		{
			end3=end3*k;
		}
		
		  end4=end1/(end2*end3);
		  
			System.out.println(m+"!/["+n+"!*("+m+"-"+n+")!]"+"="+end4);
		}else{
			System.out.println("m必須大於等於n");
		}
	}
}
