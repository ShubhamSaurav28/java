package lec26;

import java.util.Scanner;

public class factorial_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n,1));
	}
	public static int fact(int n,int ans) {
		if(n==0) {
			return ans;
		}
		return fact(n-1,n*ans);
	}

}
