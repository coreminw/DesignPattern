public class CombinationPizza extends AbstractPizza{
    String pizza2;

    public CombinationPizza() {
        pizza2 = "CombinationPizza";
    }

    @Override
    public String toString() {
        return "Pizza Type: CombinationPizza";
    }

    @Override
    public double weight() {
        return 300;
    }
}

