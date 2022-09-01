package lec2;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		if (m>=75) {
			System.out.println("A");
		}
		else if (m>=65) {
			System.out.println("B");
		}
		else if (m>=55) {
			System.out.println("C");
		}
		else if (m>=45) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
