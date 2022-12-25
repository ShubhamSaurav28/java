package lec21;

public class form_biggest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {54,546,548,60};
		biggestnum(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void biggestnum(int []arr) {
		for(int pass=1;pass<arr.length;pass++) {
			for(int i=0;i<arr.length-pass;i++) {
				if(compare(arr[i],arr[i+1])>0) {
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
	}
	public static long compare(int x,int y) {
		String xy=""+x+y;
		String yx=""+y+x;
		return Long.parseLong(yx)-Long.parseLong(xy);
	}

}
