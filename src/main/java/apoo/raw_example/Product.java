package apoo.raw_example;

public abstract class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calcularImposto(String estado);

    public abstract String getTipo();
}
