package Lab1.q5;

import java.util.*;
public class Exercise5 {
	static int calculateSum(int x) {
		int sum=0;
		for(int i=0;i<=x;i++) {
			 if(i%3==0||i%5==0) {
				 sum=sum+i;
			  }
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int s=calculateSum(n);
		System.out.println(s);
	}

}