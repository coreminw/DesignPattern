public class CheesePizza extends AbstractPizza{
    String pizza1;
    public CheesePizza() {
        pizza1 = "CheesePizza";
    }

    @Override
    public String toString() {
        return "Pizza Type: Cheesepizza";
    }

    @Override
    public double weight() {
        return 280;
    }
}

