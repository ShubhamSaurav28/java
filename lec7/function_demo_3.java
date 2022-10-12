package lec7;

public class function_demo_3 {
	static int val=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int a=7;
		int b=9;
		System.out.println(addition(a,b));
		System.out.println(val);
	}
	public static int addition(int a,int b) {
		//no return value
		
		int c=a+b;
		val=val+5;
		return c;
	}
}


