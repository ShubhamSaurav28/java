package lec27;

import java.util.Scanner;

public class item_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a= {2,3,7,2,5,7,9,7};
		int b=sc.nextInt();
		System.out.println(search(a,b,0));
	}
	public static int search(int []a,int b,int i) {
		if(i==a.length) {
			return -1;
		}
		if(a[i]==b) {
			return i;
		}
		return search(a,b,i+1);
	}
}
