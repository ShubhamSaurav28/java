package lec18;

import java.util.Scanner;

public class cb_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		substring(str);
	}
	public static void substring(String str) {
		int count=0;
		boolean[] visited=new boolean[str.length()];
		for(int len=1;len<=str.length();len++) {	//len     1		   2	   3    4	 5	  6
			for(int j=len;j<=str.length();j++) {	//j  	123456   23456   3456  456   56   6
				int i=j-len;						//i 	012345   01234   0123  012   01   0
				String s=str.substring(i,j);
				long num=Long.parseLong(s);
				if(iscbnumber(num)==true && isvisited(visited,i,j-1)==true) {
					count++;
					//marked
					for(int k=i;k<=j-1;k++) {
						visited[k]=true;
					}
				}
			}
		}
		System.out.println(count);
	}
	public static boolean isvisited(boolean[] visited,int i,int j) {
		for(int k=i;k<=j;k++) {
			if(visited[k]==true) {
				return false;
			}
		}
		return true;
	}
	public static boolean iscbnumber(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int []arr= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}
}
//generate length wise substring
//check cb number
//if it is with someone else
//visited
