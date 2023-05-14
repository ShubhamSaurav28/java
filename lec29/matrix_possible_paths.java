package lec29;

import java.util.Scanner;

public class matrix_possible_paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int e1=sc.nextInt();
		int e2=sc.nextInt();
//		matrix(0,0,e1,e2,"");
		System.out.println(count(0,0,e1,e2,""));
	}
//	public static void matrix(int s1,int s2,int e1,int e2,String ans) {
//		if(s1==e1-1 && s2==e2-1) {
//			System.out.println(ans);
//			return;
//		}
//		if(e1>=s1)
//		matrix(s1+1,s2,e1,e2,ans+"h");
//		if(e2>=s2)
//		matrix(s1,s2+1,e1,e2,ans+"v");
//	}
	public static int count(int s1,int s2,int e1,int e2,String ans) {
		if(s1==e1-1 && s2==e2-1) {
			return 1;
		}
		int a=0,b=0;
		if(e1>=s1)
		a=count(s1+1,s2,e1,e2,ans+"h");
		if(e2>=s2)
		b=count(s1,s2+1,e1,e2,ans+"v");
		return a+b;
	}
}
