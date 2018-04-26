/*86. 寫一個程式，讓使用者輸入一字串，
將字串中所出現的數字相加，並將答案輸出。*/
import java.util.Scanner;
public class A86
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("請數入一字串：");
		String a=scn.nextLine();
		int b=a.length();//取得a字串的長度
		int date[]=new int[b];//長度=b,建b個一維陣列
		
		int i,end=0;
		for(i=0;i<b;i++)
		{
			date[i]=Integer.parseInt(String.valueOf(a.charAt(i)));
	       //將字串中的字元轉換為整數
		    end=end+date[i];//整數總和
		}
		
		System.out.println("串中所出現的數字總和為："+end);
	}
}
