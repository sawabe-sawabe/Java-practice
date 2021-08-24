import java.util.HashMap;
import java.util.Map;

// HashMapを生成する場合

public class API02 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
		map1.put(0, "マスカット");

		map1.get(0);
		map1.get(1);

		map1.size();

		map1.remove(0);
		map1.remove(3, "もも");

		System.out.println(map1);
	}
}
