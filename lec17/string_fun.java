package lec17;

public class string_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloHey";
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.substring(2,5));//last index not included
		System.out.println(s.substring(1,1));//loop not start
		String s1="kunal";
		String s2="komal";
		System.out.println(s1.compareTo(s2));
		System.out.println(compareTo(s1,s2));
	}
	public static int compareTo(String s1,String s2) {
		int i=0;
		int j=0;
		while(i<s1.length() && j<s2.length()) {
			if(s1.charAt(i)!=s2.charAt(j)) {
				return s1.charAt(i)-s2.charAt(j);
			}
			i++;
			j++;
		}
		return s1.length()-s1.length();
	}
}
