package lec7;

public class function_demo_4 {
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
		int val=90;
		int c=a+b;
		val=val+5;//local
		function_demo_4.val=val+10;
		System.out.println(val);
		return c;
	}
	}



