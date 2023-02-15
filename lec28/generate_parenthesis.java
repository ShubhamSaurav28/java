package lec28;

import java.util.*;

public class generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> h=new ArrayList<>();
		para(n,"",0,0,h);
		System.out.println(h);
	}
	public static void para(int n,String ans,int open,int close, List<String> h) {
		if(open==n && close==n) {
			h.add(ans);
			return;
		}
		if(open<n) {
			para(n,ans+"(",open+1,close,h);
		}
		if(close<open) {
			para(n,ans+")",open,close+1,h);
		}
	}
}
