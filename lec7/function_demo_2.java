package lec7;

public class function_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a=7;
		int b=9;
		addition(a,b);
	}
	public static void addition(int a,int b) {
		//no return value
		
		int c=a+b;
		sub(a,b);
		System.out.println(c);
	}
	public static void sub(int a,int b) {
		//no return value
		
		int c=a-b;
		System.out.println(c);
	}
	

}
