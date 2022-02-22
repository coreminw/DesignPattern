public class PineappleTopping extends AbstractTopping{
    AbstractPizza pizza1;

    public PineappleTopping(AbstractPizza pizza1) {
        super(pizza1.toString());
        this.pizza1 = pizza1;
    }

    @Override
    public double weight() {
        return pizza1.weight()+45;
    }

    @Override
    public String toppingName() {
        return "pineapple topping";
    }

    @Override
    public String toString() {
        return pizza1.toString()+", "+toppingName();
    }
}

