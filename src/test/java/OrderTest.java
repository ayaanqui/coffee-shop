import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderTest {

    private final double basicCoffeePrice = 3.99;
    private final double extraShotPrice = 1.20;
    private final double creamPrice = .50;
    private final double sugarPrice = .50;
    private final double whippedCreamPrice = 1.50;
    private final double icePrice = 0.10;

    @Test
    void constructorTest() {
        Order o = new Order();
        assertEquals(this.basicCoffeePrice, o.total());
    }

    @Test
    void addExtraShotTest() {
        Order o = new Order();
        o.addExtraShot();
        assertEquals(this.basicCoffeePrice + this.extraShotPrice, o.total());
    }

    @Test
    void addCreamTest() {
        Order o = new Order();
        o.addCream();
        assertEquals(this.basicCoffeePrice + this.creamPrice, o.total());
    }

    @Test
    void addSugarTest() {
        Order o = new Order();
        o.addSugar();
        assertEquals(this.basicCoffeePrice + this.sugarPrice, o.total());
    }

    @Test
    void addIceTest() {
        Order o = new Order();
        o.addIce();
        assertEquals(this.basicCoffeePrice + this.icePrice, o.total());
    }

    @Test
    void addWhippedCreamTest() {
        Order o = new Order();
        o.addWhippedCream();
        assertEquals(this.basicCoffeePrice + this.whippedCreamPrice, o.total());
    }

}

