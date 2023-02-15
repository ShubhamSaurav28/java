 package lec27;

import java.util.Scanner;

public class print_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ques="abc";
		printsub(ques,"");
	}
	public static void printsub(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		printsub(ques.substring(1),ans);
		printsub(ques.substring(1),ans+ch);

	}

}
