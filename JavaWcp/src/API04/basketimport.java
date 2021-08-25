package API04;

public class basketimport {
	public static void main(String[] args){
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());	
		
		appleBasket.replce(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());
	}

}
