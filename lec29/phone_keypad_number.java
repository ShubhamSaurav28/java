package lec29;

public class phone_keypad_number {
	static String[] key= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad("12","");
		}
	public static void keypad(String ques,String ans) {
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String press=key[ch-'0'];
		for(int i=0;i<press.length();i++) {
			keypad(ques.substring(1),ans+press.charAt(i));
		}
	}
}
