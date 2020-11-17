public class Order {
    private Coffee order;

    private final double basicCoffeePrice = 3.99;
    private final double extraShotPrice = 1.20;
    private final double creamPrice = .50;
    private final double sugarPrice = .50;
    private final double whippedCreamPrice = 1.50;
    private final double icePrice = 0.10;

    public Order() {
        this.order = new BasicCoffee();
    }

    public double addExtraShot() {
        this.order = new ExtraShot(this.order);
        order.makeCoffee();
        return this.extraShotPrice;
    }

    public double addCream() {
        this.order = new Cream(this.order);
        order.makeCoffee();
        return this.creamPrice;
    }

    public double addSugar() {
        this.order = new Sugar(this.order);
        order.makeCoffee();
        return this.sugarPrice;
    }

    public double addWhippedCream() {
        this.order = new WhippedCream(this.order);
        order.makeCoffee();
        return this.whippedCreamPrice;
    }

    public double addIce() {
        this.order = new Ice(this.order);
        order.makeCoffee();
        return this.icePrice;
    }

    public double total() {
        return order.makeCoffee();
    }
}
