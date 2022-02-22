public abstract class AbstractTopping extends AbstractPizza{
    public String toppingName(){
        return toppingName();
    }

    public AbstractTopping(String name) {
    }

    @Override
    public String toString() {
        return toppingName();
    }
}
