package lec29;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abca";
		per(ques,"");
	}
    public static void per(String ques,String ans){
		if(ques.length()==0) {
			System.out.println(ans);
			return;  
		}
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				String s1=ques.substring(0,i);
				String s2=ques.substring(i+1);
				per(s1+s2,ans+ch);
			}			
		}
      }
	
}

//for "abc"
//  public static void per(String ques,String ans){
//		if(ques.length()==0) {
//			System.out.println(ans);
//			return;  
//		}
//		for(int i=0;i<ques.length();i++) {
//			String s1=ques.substring(0,i);
//			String s2=ques.substring(i+1);
//			char ch=ques.charAt(i);
//			per(s1+s2,ans+ch);
//		}
//      }