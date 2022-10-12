package lec9;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a= {1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int f=sc.nextInt();
		int c=findindex(a,f);
		System.out.println(c);
		
	}
	public static int findindex(int [] b,int m) {
		for(int i=0;i<b.length;i++) {
			if(b[i]==m) {
				return i;
			}
		}
		return -1;
	}

}
