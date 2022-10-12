package lec6;

import java.util.Scanner;

public class decimal_to_hexa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%6;
			sum=sum+rem*mul;
			n=n/6;
			mul=mul*10;
		}
		System.out.println(sum);
	}

}
