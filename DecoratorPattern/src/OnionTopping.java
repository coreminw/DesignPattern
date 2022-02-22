public class OnionTopping extends AbstractTopping{
    AbstractPizza pizza1;

    public OnionTopping(AbstractPizza pizza1) {
        super(pizza1.toString());
        this.pizza1 = pizza1;
    }

    @Override
    public double weight() {
        return pizza1.weight()+30;
    }

    @Override
    public String toppingName() {
        return "onion topping";
    }

    @Override
    public String toString() {
        return pizza1.toString()+", "+toppingName();
    }
}

