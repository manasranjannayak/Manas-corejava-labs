package Lab1.q6;

public class Exercise6 {
	static int calculateDifference(int n) {
		int sumofsquare=0,squareofsum=0,sum=0,square=0;
		for(int i=1;i<=n;i++) {
			sumofsquare=sumofsquare+(i*i);
		}
		for(int j=1;j<=n;j++) {
		 square=j*j;
		}
		squareofsum=squareofsum+square;
		return sumofsquare-squareofsum;
	}

	public static void main(String[] args) {
		
    System.out.println(calculateDifference(10));
	}

}