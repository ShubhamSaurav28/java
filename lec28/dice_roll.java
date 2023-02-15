package lec28;

import java.util.Scanner;

public class dice_roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dice(0,n,""); 
	}
	public static void dice(int src, int des, String ans) {
		if(src==des) {
			System.out.println(ans);
			return;
		}
		if(src>des) {
			return;
		}
//		dice(src+1,des,ans+1);
//		dice(src+2,des,ans+2);
//		dice(src+3,des,ans+3);
		for(int i=1;i<=3;i++) {
			dice(src+i,des,ans+i);

		}

	}
}
