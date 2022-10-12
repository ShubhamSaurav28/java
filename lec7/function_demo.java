package lec7;

public class function_demo {

	public static void main(String[] args) {
		System.out.println("Hello");
		addition();
	}
	public static void addition() {
		//no return value
		int a=7;
		int b=8;
		int c=a+b;
		sub();
		System.out.println(c);
	}
	public static void sub() {
		//no return value
		int a=7;
		int b=8;
		int c=a-b;
		System.out.println(c);
	}
}
