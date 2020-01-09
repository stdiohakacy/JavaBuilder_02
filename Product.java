package creational.Builder._01;

public class Product {
	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;

	public Product(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
		super();
		this.orderType = orderType;
		this.breadType = breadType;
		this.sauceType = sauceType;
		this.vegetableType = vegetableType;
	}

	@Override
	public String toString() {
		return "Order [orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType
				+ ", vegetableType=" + vegetableType + "]";
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public BreadType getBreadType() {
		return breadType;
	}

	public SauceType getSauceType() {
		return sauceType;
	}

	public VegetableType getVegetableType() {
		return vegetableType;
	}
}

enum BreadType {
	SIMPLE, OMELETTE, FRIED_EGG, GRILLED_FISH, PORK, BEEF,
}

enum OrderType {
	ON_SITE, TAKE_AWAY;
}

enum SauceType {
	SOY_SAUCE, FISH_SAUCE, OLIVE_OIL, KETCHUP, MUSTARD;
}

enum VegetableType {
	SALAD, CUCUMBER, TOMATO
}