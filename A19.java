
/*19. 輸入一個字元,  
利用其  ASCII code 大小判斷是大寫或小寫或是其他字元*/
import java.util.Scanner;
public class A19
{
	public static void main(String[]args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入一個字元");
		char a=scn.next().charAt(0);
	
		   if(a>=65&&a<=90)
		   {
			   System.out.println("為大寫");
			   
		   }else if(a>=97&&a<=122){
			   
			   System.out.println("為小寫");
			   
		   }else if(a>=48&&a<=57){
			   
			   System.out.println("為數字");
			   
		   }else{
			   
			   System.out.println("為其它字元");
		   }
			
	}
}
