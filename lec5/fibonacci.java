package lec5;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<n;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(a);
	}

}
//0 1 1 2 3 5 8 13 