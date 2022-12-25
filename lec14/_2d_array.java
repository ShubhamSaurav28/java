package lec14;

public class _2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int [3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		int [][]other=arr;
		System.out.println(other);	
		int col=arr[0].length;
		System.out.println(col);
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
