package lec27;

import java.util.Scanner;

public class head_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ht(a,"");
	}
	public static void ht(int n,String ans) {
		if(n==0) {
			System.out.println(ans+" ");
			return;
		}
		ht(n-1,ans+"H");
		ht(n-1,ans+"T");
	}

}
