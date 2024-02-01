package product;

public class Chocolate extends ProductForSale{

    private int cacaoPercantage;

    public Chocolate(String type, double price, String description, int cacaoPercantage) {
        super(type, price, description);
        this.cacaoPercantage = cacaoPercantage;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "cacaoPercantage=" + cacaoPercantage +
                '}';
    }
}
