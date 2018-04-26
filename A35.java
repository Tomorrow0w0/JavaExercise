//35 for n!
import java.util.Scanner;
public class A35
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入一個整數");
		int n = scn.nextInt();
		int end=1;

		for(int i=1;i<=n;i++){
			end=end*i;
		};

		System.out.println("n!= "+end);
	}

}

