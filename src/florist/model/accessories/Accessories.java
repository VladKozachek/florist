package florist.model.accessories;

public abstract class Accessories {
    private String nameAccessories;
    private double price;
    private Color color;

    public Accessories(String nameAccessories, Color color, double price) {
        this.color=color;
        this.price = price;
        this.nameAccessories=nameAccessories;
    }


    public Color getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public String getNameAccessories(){
        return nameAccessories;
    }
}
