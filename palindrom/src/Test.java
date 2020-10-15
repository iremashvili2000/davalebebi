import java.util.Scanner;

public class Test {
	
	static Boolean isPalindrome(String text) {
		String ans="";
	
		for(int i=text.length()-1;i>=0;i--) {
			ans=ans+text.charAt(i);
		}
		
		if(ans.equals(text)) {
			return true;
		}else return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner text=new Scanner(System.in);
		System.out.println("enter word: ");
		String word=text.next();
		Boolean k=isPalindrome(word);
		if(k) {
			System.out.println("palindromia");
		}else {
			System.out.println("ar aris palindromi");
		}

	}

}
