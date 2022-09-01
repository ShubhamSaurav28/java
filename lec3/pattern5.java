package lec3;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=n;
		int space=n-1;
		int star=1;
		int i=1;
		
		while (i<=row) {
			int j=1;
			while (j<=space) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while (k<=star) {
				if (k%2==0) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				k++;
			}
			System.out.println();
			star+=2;
			space--;
			i++;
		}
	}
//if and else
}
