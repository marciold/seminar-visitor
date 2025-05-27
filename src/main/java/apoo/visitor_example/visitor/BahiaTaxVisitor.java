package apoo.visitor_example.visitor;

import apoo.visitor_example.domain.Electronic;
import apoo.visitor_example.domain.Food;

public class BahiaTaxVisitor implements TaxVisitor{
    @Override
    public void visit(Electronic electronic) {
        double tax = electronic.getPrice() * 0.19;
        System.out.println("Eletrônico: R$" + tax);
    }

    @Override
    public void visit(Food food) {
        double tax = food.getPrice() * 0.06;
        System.out.println("Alimento: R$" + tax);
    }
}
