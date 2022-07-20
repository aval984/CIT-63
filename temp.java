// Andrew Valenzuela Jan 13, 2021
import java.util.*;

public class temp {

	public static void cout(Object o){
		System.out.println(o);
	}
	public static void die(Optional<String> s){
		cout(s.orElse("BAD INPUT!"));
		System.exit(1);
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		cout("Enter the starting temperature of the body: ");
		double temp0 = cin.nextDouble();
		double temp1 = temp0 + (27 - temp0) * 0.2;
		double temp2 = temp1 + (27 - temp1) * 0.2;
		double temp3 = temp2 + (27 - temp2) * 0.2;
		double temp4 = temp3 + (27 - temp3) * 0.2;
		cout("Starting temperature: " + temp0);
		cout("Temperature after 1 Hour: " + temp1);
		cout("Temperature after 2 Hours: " + temp2);
		cout("Temperature after 3 Hours: " + temp3);
		cout("Temperature after 4 Hours: " + temp4);
	// code go here
	}
}

