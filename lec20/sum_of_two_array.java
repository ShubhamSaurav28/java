package lec20;

import java.util.ArrayList;
import java.util.Scanner;

public class sum_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int []arr1= {1,0,2,9};
	        int []arr2= {3,4,5,6,7};
	        sumarray(arr1,arr2);
	}
	public static void sumarray(int[] arr1, int[] arr2) {
		int i=arr1.length-1;
		int j=arr2.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        int carry=0;
        while(i>=0 && j>=0) {
        	int sum=0;
        	sum=arr1[i]+arr2[j]+carry;
        	list.add(sum%10);
        	carry=sum/10;
        	i--;
        	j--;
        }
        while(i>=0){
        	int sum=0;
        	sum=arr1[i]+carry;
        	list.add(sum%10);
        	carry=sum/10;
        	i--;
        }
        while(j>=0){
        	int sum=0;
        	sum=arr2[j]+carry;
        	list.add(sum%10);
        	carry=sum/10;
        	j--;
        }
        if(carry!=0) {
        	list.add(carry);
        }
        for(int k=list.size()-1;k>=0;k--) {
        	System.out.print(list.get(k)+", ");
        }
        System.out.println("END");
	}

}
