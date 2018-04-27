package florist.model.flowers;


public abstract class Flowers {
    private final String name;
    private final double price;
    private final FreshFlowers freshFlowers;
    private final double lengthOfStem;

    protected Flowers(String name, double price, FreshFlowers freshFlowers, double lengthOfStem) {
        this.name = name;
        this.price = price;
        this.freshFlowers = freshFlowers;
        this.lengthOfStem = lengthOfStem;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public FreshFlowers getFreshFlowers() {
        return freshFlowers;
    }

    public double getLengthOfStem() {
        return lengthOfStem;
    }
}
