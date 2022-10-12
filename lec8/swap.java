package lec8;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,6,-7};
		System.out.println(arr[0]+" "+arr[1]);
		swap(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);
	}
	public static void swap(int [] arr, int a,int b) {
		int c=arr[a];
		arr[a]=arr[b];
		arr[b]=c;
	}
}
//public static void swap(int a,int b) {
//	int c=a;
//	a=b;
//	b=c;
//} no change in array, only change in local variable  
