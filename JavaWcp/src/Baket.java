
public class Baket<E extends Fruit> {
	private E elem;

	Baket(E e) {
		elem = e;
	}

	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}

	void printName() {
		System.out.println("籠の中身は" + elem.getName() + "です");
	}
}
