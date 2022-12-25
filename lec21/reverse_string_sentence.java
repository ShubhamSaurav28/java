package lec21;

import java.util.Scanner;

public class reverse_string_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverse(str);
	}
	public static void reverse(String str) {
		str=str.trim();
		String [] s=str.split("\s+");//any number of space hatane ke liye
		String st="";
		for(int i=s.length-1;i>=0;i--){
            st=st+s[i]+" ";
        }
		st=st.trim();
		System.out.println(st);
	}

}
