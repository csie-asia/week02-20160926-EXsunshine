package hw;
/*
 * 已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021057 張岳埕
 */
import java.util.*;
public class hw02_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int S = scn.nextInt();
if(S==1){
	int T = scn.nextInt();
	double M = (T-80)*0.7 ;
	System.out.println(M);
}else{
	if(S==2){
		int Y =scn.nextInt();
		double N = (Y-70)*0.6;
		System.out.println(N);
	}
}

	}

}
