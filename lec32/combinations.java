package lec32;

import java.util.*;

public class combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<List<Integer>> l=new ArrayList<List<Integer>>();
		combination(n,k,li,l,1);
		System.out.println(l);
	}
	public static void combination(int n,int k,ArrayList<Integer> li,ArrayList<List<Integer>> l,int m) {
		if(li.size()==k) {
			l.add(new ArrayList<>(li));
		}
		for(int i=m;i<=n;i++) {
			li.add(i);
			combination(n,k,li,l,m+1);
			li.remove(li.size()-1);
		}
	}

}
