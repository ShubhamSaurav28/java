package lec13;

import java.util.Scanner;

public class First_bad_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		System.out.println(firstBadVersion(arr.length));
	}
	public static int firstBadVersion(int n) {
		int hi=n;
		int lo=1;
		int ans=0;
		while(lo<=hi) {
			int mid=(hi+lo)/2;
			if(isBadVersion(mid)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public static boolean isBadVersion(int n) {
		if(n==4) {
			return true;
		}
		else {
			return false;
		}
	}
}
