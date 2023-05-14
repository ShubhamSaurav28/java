package lec32;

import java.util.*;

public class pallindrome_substrings {
	
	public static void main(String[] args) {
		String ques="nitin";
		List<String> li=new ArrayList<String>();
		List<List<String>> l=new ArrayList<List<String>>();
		Partition(ques,li,l);
		System.out.println(l);
	}
	public static void Partition(String ques,List<String> li,List<List<String>> l) {
		if(ques.length()==0) {
			l.add(new ArrayList<>(li));
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String part=ques.substring(0,i);
			if(pallindrome(part)) {
				li.add(part);
				Partition(ques.substring(i),li,l);
				li.remove(li.size()-1);
			}
		}
	}
	public static boolean pallindrome(String st) {
		int i=0;
		int j=st.length()-1;
		while(i<j) {
			if(st.charAt(i)!=st.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
