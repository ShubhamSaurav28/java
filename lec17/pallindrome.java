package lec17;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="helloolleh";
		pallindrome(str);
				
				
	}
	public static void pallindrome(String str) {
		int i,j,t=0;
		for(i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				t=1;
				break;
			}
		}
		if(t==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
