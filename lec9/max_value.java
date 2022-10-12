package lec9;

public class max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,1,3,2,4,422,-99};
		int a=max(arr);
		System.out.println(a);
		}
	public static int max(int []arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
