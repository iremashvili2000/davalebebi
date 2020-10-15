import java.util.Scanner;

public class Test {
	static int minSplit(int amount) {
		
		int sum=0;
		int k;
		while(amount!=0) {
			if(amount>=50) {
				k=amount/50;
				amount=amount-(k*50);
				sum+=k;
			}
			
			if(amount>=20) {
				k=amount/20;
				amount=amount-(k*20);
				sum+=k;
			}
			
			if(amount>=10) {
				k=amount/10;
				amount=amount-(k*10);
				sum+=k;
			}
			
			if(amount>=5) {
				k=amount/5;
				amount=amount-(k*5);
				sum+=k;
			}
			
			if(amount>=1) {
				k=amount/1;
				amount=amount-(k*1);
				sum+=k;
			}
			
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob1=new Scanner(System.in);
		System.out.println("enter number:");
		int money=ob1.nextInt();
		
		System.out.println(minSplit(money));
		
	}

}
