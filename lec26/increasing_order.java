package lec26;

import java.util.Scanner;

public class increasing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		inc(n);
	}
	public static void inc(int n) {
		if(n==0) {
			return;
		}
		inc(n-1);
		System.out.println(n);
	}

}
