//4. 請設計一樂透亂數選號程式，
//由1~42中選出6個不重覆的數字組合並輸出。
import java.util.Random;


public class A4
{
	public static void main(String[]args)
	{
		System.out.println("當期樂透");
		
		int date[]= new int[7];
		Random scn= new Random();
		int i,j;
		boolean flag;
		
		
		for(i=0;i<6;i++){
			do{
			flag=false;
			date[i]=scn.nextInt(41)+1;
		   if(i!=0){
			  for(j=0;j<i;j++){
				  if(date[i]==date[j]){
					  flag = true;
					  }
				   }
			     }
				 
		      }while(flag);
			
		
		
	
		if(i<6){
			System.out.println("第"+(i+1)+"個號碼:");
		  }
		
		if(date[i]<10){
			System.out.println("0"+date[i]);
			} else {
			System.out.println(date[i]);
		   }
		  
	}
}
}
