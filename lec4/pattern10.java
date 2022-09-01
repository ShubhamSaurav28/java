package lec4;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			int i=1;
			while (i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			int k=1;
			while(j<=star) {
				if()
				System.out.print(k);
				j++;
				k++;
			}
			System.out.println();
			star+=2;
			space--;
			row++;
		}
	}

}
//vertical mirroring