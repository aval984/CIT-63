// Andrew Valenzuela Jan 13, 2021
// this is a java template made for vim that i made a few years ago
// it was for my c++ class's one java assignment
// thats why it has a cout and a die function
import java.util.*;

public class joke {

	public static void cout(Object o){
		System.out.println(o);
	}
	public static void die(Optional<String> s){
		cout(s.orElse("BAD INPUT!"));
		System.exit(1);
	}
	public static void main(String[] args) {
	// code go here
		cout("Q. Why should you only put 239 beans in bean soup?");
		cout("A. Because one more will make it \"too farty\"");
	}
}

