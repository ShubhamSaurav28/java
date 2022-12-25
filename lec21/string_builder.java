package lec21;

public class string_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb.length());
		sb.append('c');
		System.out.println(sb.capacity());
		StringBuilder sb1=new StringBuilder();
		sb.append("Bye"); 
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append("HellocBhelo1");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append('a');
		System.out.println(sb.capacity());
	}

}
//charAt, reverse, substring