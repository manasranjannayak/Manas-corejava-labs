package Lab1.q4;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n,c;
		System.out.println("Enter the number limit:");
		n=sc.nextInt();
		System.out.println("Prime number are:");
		for(i=2;i<=n;i++) {
			c=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i+" ");
			}
		}

	}

}
