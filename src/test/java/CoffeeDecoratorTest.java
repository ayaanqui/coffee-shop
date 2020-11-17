import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoffeeDecoratorTest {

	private final double basicCoffeePrice = 3.99;
	private final double extraShotPrice = 1.20;
	private final double creamPrice = .50;
	private final double sugarPrice = .50;
	private final double whippedCreamPrice = 1.50;
	private final double icePrice = 0.10;

	@Test
	void basicCoffeeTest() {
		Coffee basicCoffee = new BasicCoffee();
		assertEquals(this.basicCoffeePrice, basicCoffee.makeCoffee());
		// Calling makeCoffee again shouldn't change the price
		assertEquals(this.basicCoffeePrice, basicCoffee.makeCoffee());
	}

	@Test
	void creamTest() {
		Coffee cremeCoffee = new Cream(new BasicCoffee());
		assertEquals(this.basicCoffeePrice + this.creamPrice, cremeCoffee.makeCoffee());
	}

	@Test
	void sugarTest() {
		Coffee sugarCoffee = new Sugar(new BasicCoffee());
		assertEquals(this.sugarPrice + this.basicCoffeePrice, sugarCoffee.makeCoffee());

		Coffee sugarCremeCoffee = new Cream(sugarCoffee);
		assertEquals(this.sugarPrice + this.creamPrice + this.basicCoffeePrice,
				sugarCremeCoffee.makeCoffee());
	}

	@Test
	void extraShotTest() {
		Coffee extraShotCoffee = new ExtraShot(new BasicCoffee());
		assertEquals(this.extraShotPrice + this.basicCoffeePrice, extraShotCoffee.makeCoffee());

		Coffee extraShotCreamCoffee = new Cream(extraShotCoffee);
		assertEquals(this.extraShotPrice + this.creamPrice + this.basicCoffeePrice,
				extraShotCreamCoffee.makeCoffee());

		Coffee extraShotSugarCoffee = new Sugar(extraShotCoffee);
		assertEquals(this.extraShotPrice + this.sugarPrice + this.basicCoffeePrice,
				extraShotSugarCoffee.makeCoffee());

		Coffee extraShotSugarCreamCoffee = new Sugar(extraShotCreamCoffee);
		assertEquals(this.extraShotPrice + this.sugarPrice + this.creamPrice + this.basicCoffeePrice,
				extraShotSugarCreamCoffee.makeCoffee());

		Coffee crazyCoffee = new ExtraShot(extraShotSugarCreamCoffee);
		assertEquals(this.extraShotPrice * 2 + this.sugarPrice + this.creamPrice + this.basicCoffeePrice,
				crazyCoffee.makeCoffee());
	}

	@Test
	public void iceTest() {
		Coffee iceCoffee = new Ice(new BasicCoffee());
		assertEquals(this.icePrice + this.basicCoffeePrice, iceCoffee.makeCoffee());
	}

	@Test
	public void whippedCreamTest() {
		Coffee whippedCreamCoffee = new WhippedCream(new BasicCoffee());
		assertEquals(this.whippedCreamPrice + this.basicCoffeePrice, whippedCreamCoffee.makeCoffee());
	}

}
