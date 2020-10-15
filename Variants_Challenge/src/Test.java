import java.util.Scanner;

public class Test {
	static int countVariants(int stearsCount) {
		if(stearsCount==1 || stearsCount==0)return 1;
		else {
			return countVariants(stearsCount-1)+countVariants(stearsCount-2);
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob1=new Scanner(System.in);
		System.out.println("enter stair length: ");
		int n=ob1.nextInt();
		if(n==0) {
			System.out.println(0);
		}else {
		System.out.println(countVariants(n));
		}
		
	}

}
