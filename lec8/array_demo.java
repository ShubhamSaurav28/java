package lec8;

public class array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int [5];
		int a []= new int [5];//c type declaration
		System.out.println(arr);
		int [] other=arr;
		System.out.println(a.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//set
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
	    arr[4]=50;
	    System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
