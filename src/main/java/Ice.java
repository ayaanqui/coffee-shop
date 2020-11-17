public class Ice extends CoffeeDecorator {
    private double cost = .10;

    Ice(Coffee specialCoffee) {
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addIce();
    }

    private double addIce() {
        return cost;
    }
}
