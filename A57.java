//57. 計算0到10各數的平方(square)和立方(cube),並印出結果如下:
//  數    平方    立方         
 // 0      0      0    
 // 1      1      1       
 // 2      4      8 



public class A57
{
	public static void main(String[]args)
	{
		System.out.println("數  平方  立方");
	int i;
		for(i=0;i<11;i++){
		
	     System.out.println(i+"   "+Math.pow(i,2)+"   "+Math.pow(i,3));
		}
	}
}
