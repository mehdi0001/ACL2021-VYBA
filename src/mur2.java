import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mur2 {

	public static void main(String[] args) {
		String input = "12345";

		// To array
		String[] arr = input.split("");

		// To fixed-size list
		List<String> l = Arrays.asList(input.split(""));

		// To ArrayList
		//List<String> l2 = new ArrayList<>(Arrays.asList(input.split(",")));
		System.out.println(l);

	}

}
