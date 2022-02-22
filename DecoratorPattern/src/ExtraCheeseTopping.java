public class ExtraCheeseTopping extends AbstractTopping{
    AbstractPizza pizza1;

    public ExtraCheeseTopping(AbstractPizza pizza1) {
        super(pizza1.toString());
        this.pizza1 = pizza1;
    }

    @Override
    public double weight() {
        return pizza1.weight() + 40;
    }

    @Override
    public String toppingName() {
        return "extra cheese topping";
    }

    @Override
    public String toString() {
        return pizza1.toString() +", " + toppingName();
    }
}

