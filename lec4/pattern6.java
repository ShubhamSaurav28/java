package lec4;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		while (row<=2*n-1) {
			int i=1;
			while (i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while (j<=star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			if (row<n) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			row++;
		}
	}

}
