package Lab1.q7;

public class Exercise7 {
	 static boolean checkNumber(int number) 
	{
		String s = Integer.toString(number);
		char ch;
		int f = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			ch = s.charAt(i);
			if (ch > s.charAt(i + 1))
			{
				f = 1;
				break;
			}
		}
		if (f == 1)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		System.out.println(checkNumber(123456));

	}

}