//47. 在螢幕上印出九九乘法表

public class A47
{
	public static void main(String[]args)
	
	{
		System.out.println("99乘法表");
		int i,j;
		for(i=1;i<=9;i++){
			for(j=1;j<=9;j++){
				System.out.println("\n"+i+"x"+j+"="+i*j);
			}
		}
	}
}
