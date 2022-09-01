package lec2;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if (a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
