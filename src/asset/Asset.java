package asset;

abstract class Asset {

    protected String name;
    protected double price;

    public Asset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void printInfo();
}
