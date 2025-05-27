package apoo.visitor_example.domain;

import apoo.visitor_example.visitor.TaxVisitor;

public class Food implements Product{
    private double price;

    public Food(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }
}
