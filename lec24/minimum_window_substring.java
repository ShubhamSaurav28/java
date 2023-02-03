package lec24;

import java.util.Scanner;

public class minimum_window_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		System.out.println(minimumwindow(s,t));
	}
	public static String minimumwindow(String s,String t) {
		int [] fr=new int [123];
		for(int i=0;i<t.length();i++) {
			char ch=t.charAt(i);
			fr[ch]++;
		}
		int [] frs=new int [123];
		int di=0;
		int ei=0;
		int start=-1;
		int len=Integer.MAX_VALUE;
		int count=0;
		while(ei<s.length()) {
			//grow 
			char ch=s.charAt(ei);
			frs[ch]++;
			if(fr[ch]>=frs[ch]) {
				count++;
			}
			//shrink
			if(count==t.length()) {
				char c=s.charAt(si);
				while(frs[s.charAt(si)>fr[s.charAt(si)] && si<=ei) {
					frs[s.charAt(si)]--;
					si++;
				}
			
				//size
				if(len>ei-si+1) {
					len=ei-si+1;
					start=si;
				}
			}	
			ei++;
		}
		if(start==-1) {
			return "";
		}
		return s.substring(start,start+len);
	}

}
