//2. 輸入一個字串, 並把它反向輸出
import java.util.Scanner;

public class A2
{
	public static void main(String[]args)
	{
		/*Scanner scn = new Scanner(System.in);
		System.out.println("請輸入字串：");

		String str=scn.nextLine();

		char[] data = str.toCharArray();//將字串轉字元陣列
		int len = data.length;//取得陣列長度
		char[] data1 =new char[len];

		for(int i=0;i<len;i++){
			data1[i] = data[len-i-1];
		}

		String new_str = new String(data1);
		System.out.println(new_str);*/
		
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入字串：");
		String a =scn.nextLine();
		char [] date=a.toCharArray();
		for(int i=date.length-1;i>=0;i--)//倒序
		{
			System.out.print(date[i]);
		}
	}
}

/*next(); 從控制台獲取字符串，
如果字符串中包含空格，
只會獲取第一個作為接收的字符串。
ex：輸入hello I am a chinese!,
接收到的只是hello。

nextLine();從控制台獲取字符串，
字符串中可以包含空格，
ex：輸入hello I am a chinese!
接收到的是hello I am a chinese!。*/
