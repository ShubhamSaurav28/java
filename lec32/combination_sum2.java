package lec32;

import java.util.*;

public class combination_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] c={10,1,2,7,6,1,5};
		int t=8;
		Arrays.sort(c);
		List<Integer> li=new ArrayList<Integer>();
		List<List<Integer>> l=new ArrayList<List<Integer>>();
		combination(c,t,li,0,l);
		System.out.println(l);
	}
	public static void combination(int [] c,int t,List<Integer> li,int idx,List<List<Integer>> l){
		if(t==0){
			l.add(new ArrayList<>(li));
			return;
		}
		for(int i=idx;i<c.length;i++){
			if(i==idx || c[i]!=c[i-1]) {
				if(t>=c[i]){
					li.add(c[i]);
					combination(c,t-c[i],li,i+1,l);
					li.remove(li.size()-1);
				}
			}
		}
	}
	

}
