package lec9;

public class range_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,1,2,4,5,8,5,3,422,-99};
		reverse(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void reverse(int []arr) {
		int i=3;
		int j=arr.length-3;
		while (i<j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}

}
