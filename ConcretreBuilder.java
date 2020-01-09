package creational.Builder._01;

public class ConcretreBuilder implements ProductBuilder {
	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;

	@Override
	public ProductBuilder orderType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}

	@Override
	public ProductBuilder breadType(BreadType breadType) {
		this.breadType = breadType;
		return this;
	}

	@Override
	public ProductBuilder sauceType(SauceType sauceType) {
		this.sauceType = sauceType;
		return this;
	}

	@Override
	public ProductBuilder typeVegetable(VegetableType vegetableType) {
		this.vegetableType = vegetableType;
		return this;
	}

	@Override
	public Product build() {
		return new Product(orderType, breadType, sauceType, vegetableType);
	}

}
