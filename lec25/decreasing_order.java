package lec25;

import java.util.Scanner;

public class decreasing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dec(n);
	}
	public static void dec(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		dec(n-1);
	}

}
