
import java.util.ArrayList;
import java.util.List;



public class API {
	 public static void main(String[] args) {
	List<String> list1 = new ArrayList<String>();

	list1.add("りんご");
	list1.add("みかん");
	list1.add(1, "バナナ");


	list1.get(0);

	list1.contains("バナナ");
	list1.contains("なし");

	list1.size();

	list1.remove("バナナ");
	list1.remove(0);
	System.out.println(list1);
	 }



}
