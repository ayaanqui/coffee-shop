public class WhippedCream extends CoffeeDecorator {
    private double cost = 1.50;

    WhippedCream(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addWhippedCream();
    }

    private double addWhippedCream() {
        return cost;
    }
}
