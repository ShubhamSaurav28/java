package lec7;

import java.util.Scanner;

public class boston_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int sum=0;
		int t=n;
		while(i<=n) {
			while(n%i==0) {
				sum=sum+sod(i);
				n=n/i;
			}
			i++;
		}
		if(sum==sod(t))
		System.out.println("Yes");
		else 
		System.out.println("No");
	}
	
	public static int sod(int a) {
		int i=0;
		int sum=0;
		while(a>0) {
			i=a%10;
			sum=sum+i;
			a=a/10;
		}
		return sum;
	}

}
