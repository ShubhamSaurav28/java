package lec27;

import java.util.Scanner;

public class no_two_HH {

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
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			ht(n-1,ans+"H");
		}
		ht(n-1,ans+"T");
	}
}
