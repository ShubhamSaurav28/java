package lec6;

public class typecasting_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=(byte) 300;
		int i=10;//32 bit
		long l=10;//64 bit
		short s=10;//16 bit
		System.out.println(b);
		l=1000_000_000;
		System.out.println(l);
		double d=3.56;//64 bit
		float f=5.5f;//32 bit
		System.out.println(d);
		System.out.println(f);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		boolean b1=true;//1 bit
		System.out.println(b1);
		char ch='a';//16 bit
		System.out.println((int) (ch));
		ch++;
		System.out.println(ch);
		int j=Integer.MAX_VALUE;
		j++;//cyclic nature
		System.out.println(j);
		char a=99;
		System.out.println(a);
	}

}
