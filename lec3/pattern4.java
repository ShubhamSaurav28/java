package lec3;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=2*n-1;
		int space=0;
		while (row<=n) {
			int j=1;
			while (j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while (k<=star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			star-=2;
			space++;
			row++;
		}
	}

}
