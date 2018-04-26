/*31. 讓使用者輸入x,並計算y值輸出,其公式如下:  
y = 3 * x^2         若 x < -1   
y = x^3 + 3 * x - 3 若 -1 <= x <= 1   
y = 2 * x + 3       若 x > 1*/
import java.util.Scanner;
public class A31
{
	public static void main(String[]args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("請輸入x值：");
	double X=scn.nextDouble();
	double Y1,Y2,Y3;
	
	if(X<-1)
	{
		Y1= 3 * Math.pow(X,2);
		System.out.println("y值:"+Y1);
	}else if(X>=-1&&X<=1){
		Y2 = Math.pow(X,3) + (3*X) - 3;
		System.out.println("y值:"+Y2);
	}else if(X>1){
		Y3=2*X+3;
		System.out.println("y值:"+Y3);
	}
	
	}
}
