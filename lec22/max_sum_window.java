package lec22;

public class max_sum_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,3,4,2,5,1,4,2,1};
		int k=3;
		System.out.println(maxsum(arr,k)      );
		}
	public static int maxsum(int[] arr, int k) {
		int max=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		max=sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i];//window size increase
			sum=sum-arr[i-k];//window size decrease
			max=Math.max(max,sum);
		}
		return max;
	}

}
