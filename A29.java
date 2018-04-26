//29. 由亂數產生一1~1000的價格,
//並跟據此價格在螢幕上印出「?仟?佰?拾?元」字樣。
import java.util.Random;
public class A29
{
	public static void main(String[]args)
	{
		Random scn = new Random();
		int date[]= new int[5];
		date[1]=scn.nextInt(9);
		date[2]=scn.nextInt(9);
		date[3]=scn.nextInt(9);
		if(date[1]==0&&date[2]==0&&date[3]==0){
			date[4]=1;
		}else{
			date[4]=0;
		}
		
		System.out.println("商品價格:"+date[4]+date[3]+date[2]+date[1]+"元");
		System.out.println(date[4]+"仟"+date[3]+"佰"+date[2]+"拾"+date[1]+"元");
	}
}
