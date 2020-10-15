import java.util.Scanner;

public class Test {
	static Boolean isProperly(String sequence) {
		int n=0;
		for(int i=0;i<sequence.length();i++) {
			if(n<0) {
				return false;
			}
			if(sequence.charAt(i)=='(') {
				n++;
			}else {
				n--;
			}
		}
		if(n==0)
			return true;
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob1=new Scanner(System.in);
		String text=ob1.next();
		Boolean k=isProperly(text);
		if(k) {
			System.out.println("corect word");
		}else System.out.println("not corect word");
		
		
	}

}
