package lec3;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=0;
		int star=n;
		while (row<=n) {
			int i=1;
			while (i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while (j<=star) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			space++;
			star--;	
			row++;
	}

}}
