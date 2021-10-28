package Lab1.q2;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("1.Red");
System.out.println("2.Yellow");
System.out.println("3.Green");
System.out.println("Enter  colour out of three colour ");
 String colour =sc.next();


switch (colour) {
	case "red":
		System.out.println("colour is red-STOP");
		break;
	case "yellow":
		System.out.println("colour is yellow-Ready to GO");
		break;
	case "green":
		System.out.println("colour is Green-GO");
		break;
		default:
			System.out.println("No colour-code chooes");
	}

}

	
}