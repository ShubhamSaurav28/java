package lec26;

import java.util.Scanner;

public class a_power_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
//		System.out.println(power(a,b));
		System.out.println(power(a,b,1));
	}
	//head
//	public static int power(int a,int b) {
//		if(b==0) {
//			return 1; 
//		}
//		return a*power(a,b-1);
//	}
	//tail
	public static int power(int a,int b,int ans) {
		if(b==0) {
			return ans;
		}
		return power(a,b-1,ans*a);
	}
}
