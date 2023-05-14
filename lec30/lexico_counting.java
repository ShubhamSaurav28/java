package lec30;

import java.util.Scanner;

public class lexico_counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		counting(0,n);
	}
	public static void counting(int c,int n) {
		if(c>n) {
			return;
		}
		System.out.println(c);
		int i=0;
		if(c==0) {
			i=1;
		}
		for(;i<=9;i++) {
			counting(c*10+i,n);
		}
	}
}
// 386 leetcode submit
