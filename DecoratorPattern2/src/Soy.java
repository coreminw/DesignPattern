public class Soy extends CondimentDecorator{
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage= beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", 콩";
    }
    public double cost() {
        return beverage.cost() + .20;
    }
}