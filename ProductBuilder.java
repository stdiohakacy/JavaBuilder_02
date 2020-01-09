package creational.Builder._01;

public interface ProductBuilder {
	ProductBuilder orderType(OrderType orderType);

	ProductBuilder breadType(BreadType breadType);

	ProductBuilder sauceType(SauceType sauceType);

	ProductBuilder typeVegetable(VegetableType vegetableType);

	Product build();
}
