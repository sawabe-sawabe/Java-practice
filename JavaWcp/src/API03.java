import java.util.HashSet;
import java.util.Set;

public class API03 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();

		set1.add("スイカ");
		set1.add("メロン");

		set1.contains("スイカ");
		set1.size();

		set1.remove("スイカ");
		System.out.println(set1);
	}

}
