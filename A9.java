//9. 讓使用者輸入性別與身高，並依據男女不同, 幫她(他)計算並輸出其標準體重
//男：(身高-170)*0.6+62 女：(身高-158)*0.5+52。

import java.util.Scanner;
public class A9
{
	public static void main(String[]args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("請輸入性別(1)男生(2)女生");
		int n= scn.nextInt();
		System.out.println("請輸入身高");
		Double H = scn.nextDouble();
		if(n==1){
			Double W= (H-170)*0.6+62;
			System.out.println("你的標準體重：= "+W);
		}
		
		if(n==2){
			Double W2= (H-158)*0.5+52;
			System.out.println("妳的標準體重：= "+W2);
		}
	}
}
