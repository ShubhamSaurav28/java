package lec27;

import java.util.Scanner;

public class count_no_two_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ht(a,"");
		System.out.println(count(a,""));
	}
	public static void ht(int n,String ans) {
		if(n==0) {
			System.out.println(ans+" ");
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			ht(n-1,ans+"H");
		}
		ht(n-1,ans+"T");
	}
	public static int count(int n,String ans) {
		if(n==0) {
			return 1;
		}
		int a =0;
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			a=count(n-1,ans+"H");
		}
		int b=count(n-1,ans+"T");
		return a+b;
	}
}
