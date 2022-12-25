package lec16;

import java.util.Scanner;

public class _90degree_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][]a=new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		RotateImage(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void Transpose(int [][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
	}
	public static void RotateImage(int [][]arr) {
		Transpose(arr);
		for(int i=0;i<arr.length;i++) {
		ReverseArray(arr[i]);
		}
	}
	public static void ReverseArray(int []arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}
}