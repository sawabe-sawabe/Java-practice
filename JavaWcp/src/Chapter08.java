
public class Chapter08 {
	public static void main(String[] args) {
		int number = 3;
		while(number < 5) {
			System.out.println(number*number);
			number++;

		}

		int[] array = {1, 4, 9, 12} ;
		for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
		   // 3. 拡張「for」文
        for (int val : array) {
            if (val % 2 == 0) {
                continue;
            }
            System.out.println(val);
        }

	}

}
