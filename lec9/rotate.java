package lec9;

public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7};
		int k=3;
		rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		
	}
		}
	 public static void rotate(int[] nums, int k) {
	        int i=0;
	        int j=nums.length-1;
	        int t=j;
	        k=k%nums.length;
	        while(i<k){
	            int n=nums[j];
	        while(j>=0){
	            if(j==0){
	                nums[0]=n;
	                break;
	            }
	            nums[j]=nums[j-1];
	            j--;
	        }
	            j=t;
	            i++;
	        }
	}
	

}
