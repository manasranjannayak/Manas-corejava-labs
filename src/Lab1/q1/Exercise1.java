package Lab1.q1;

public class Exercise1 {
	
	static int add(int a) {
		int sum=0,r,c=0;
		while(a>0) {
			r=a%10;
			 c=r*r*r;
			 a=a/10;
			sum=sum+c;
		}
		return sum;
	}

	public static void main(String[] args) {
           System.out.println(add(223));
	}

}
