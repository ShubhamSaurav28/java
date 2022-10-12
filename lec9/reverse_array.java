package lec9;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,1,2,4,422,-99};
		reverse(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void reverse(int []arr) {
		int i=0;
		int j=arr.length-1;
		while (i<j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
		
	}
}







// don't use this
//int []a= new int [arr.length];
//		int i=0;
//		int j=0;
//		for(i=0;i<arr.length;i++) {
//			a[i]=arr[i];
//		}
//		for(j=arr.length-1,i=0;j>=0;j--,i++) {
//			arr[i]=a[j];
//		}
//		for(i=0;i<arr.length;i++)
//		System.out.println(arr[i]);