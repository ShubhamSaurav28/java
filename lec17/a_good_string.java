package lec17;

import java.util.Scanner;

public class a_good_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(playingoodstring(str));
		
	}
	public static int playingoodstring(String str) {
		int ans=0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(check(ch)==true) {
				count++;
			}
			else {
				ans=Math.max(ans,count);
				count=0;
			}	
		}
		ans=Math.max(ans,count);
			return ans;
	}
	public static boolean check(char ch) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				return true;
			}
			return false;
	}
}


//Scanner sc=new Scanner(System.in);
//String str=sc.nextLine();
//int c=0;
//int maxc=0;
//for(int i=0;i<str.length();i++) {
//	if(s.charAt(i))=='a'||s.charAt(i))=='e'||s.charAt(i))=='i'||s.charAt(i))=='o'||s.charAt(i))=='u'){
//		c++;
//		if(maxc<c) {
//			maxc=c;
//		}
//		else {
//			c=0;
//		}
//	}
//	System.out.println(maxc);
//}