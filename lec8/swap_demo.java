package lec8;

public class swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40,50};
		int [] other= {100,200,300,400,500};
		System.out.println(arr[0]+" "+other[0]);
		swap(arr,other);
		System.out.println(arr[0]+" "+other[0]);
		}
	
	public static void swap(int [] arr, int [] other) {
		int [] c =arr;
		arr=other;
		other=c;
	}

}
