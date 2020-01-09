package creational.Builder._01;

public class Director {
	public static void main(String[] args) {
		Product product = new ConcretreBuilder()
				.orderType(OrderType.ON_SITE)
				.breadType(BreadType.BEEF)
				.sauceType(SauceType.FISH_SAUCE).
				typeVegetable(VegetableType.SALAD).build();

		System.out.println(product);
	}
}
