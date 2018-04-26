//23. 亂數產生三個1~100間的正整數亂數，
//判斷並輸出三數中之最大值及最小值。
import java.util.Random;
public class A23
{
	public static void main(String[]args)
	{
		Random scn= new Random();
		int a,b,c;
		a=scn.nextInt(99)+1;
		b=scn.nextInt(99)+1;
		c=scn.nextInt(99)+1;
		int MAX=Math.max(Math.max(a,b),c);//a.b中最大值.在跟c比
		int MIN=Math.min(Math.min(a,b),c);//      小
		System.out.println("三數："+a +","+ b+","+ c);
		System.out.println("MAX:"+ MAX);
		System.out.println("min:"+ MIN);
		
	}
}
