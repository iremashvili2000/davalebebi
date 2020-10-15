
import java.util.Scanner;

public class Test {
	static int notCountains(int[] array) {
		int i=0;
		int k=0;
		while(true) {
			i++;
			for(int j=0;j<array.length;j++) {
				if(i==array[j]) {
					k=1;
					break;
				}
					
			}
			if(k==0) {
				return i;
			
			}
			k=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k;
		Scanner ob1=new Scanner(System.in);
		
		System.out.println("enter array's size: ");
		int n=ob1.nextInt();
		int[] array=new int[n];
		System.out.println("enter array's elements: ");
		for(int i=0;i<n;i++) {
			array[i]=ob1.nextInt();
			
			
		}
	//	System.out.println(array);
		
		int min_number=notCountains(array);
		System.out.println("min number is "+min_number);
		
		

	}

}
