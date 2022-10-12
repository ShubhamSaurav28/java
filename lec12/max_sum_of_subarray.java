package lec12;

public class max_sum_of_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,-4,-1,-5,-7};
		System.out.println(maxsum(arr));
		
	}
	public static int maxsum(int [] arr) {
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				ans=Math.max(sum, ans);
			}
		}
		return ans;
	}

}
