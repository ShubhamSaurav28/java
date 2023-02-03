package lec23;

import java.util.Scanner;

public class kartik_bhaiya_and_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		int aflip=perfectness_max(str,k,'a');
		int bflip=perfectness_max(str,k,'b');
		System.out.println(Math.max(aflip, bflip));
		
	}
	public static int perfectness_max(String str, int k,char ch) {
		int si=0;
		int ei=0;
		int flip=0;
		int ans=0;
		while(ei<str.length()) {
			//window grow kiya hai
			if(str.charAt(ei)==ch) {
				flip++;
			}
			//window shrink krna hai
			while(flip>k) {
				if(str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			//call window size
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}

}
