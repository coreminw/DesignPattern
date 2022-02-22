public class PepperoniTopping extends AbstractTopping{
    AbstractPizza pizza1;

    public PepperoniTopping(AbstractPizza pizza1) {
        super(pizza1.toString());
        this.pizza1 = pizza1;
    }

    @Override
    public double weight() {
        return pizza1.weight()+25;
    }

    @Override
    public String toppingName() {
        return "pepperoni topping";
    }

    @Override
    public String toString() {
        return pizza1.toString()+", "+toppingName();
    }
}

