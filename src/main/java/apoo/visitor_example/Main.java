package apoo.visitor_example;

import apoo.visitor_example.domain.Electronic;
import apoo.visitor_example.domain.Food;
import apoo.visitor_example.domain.Product;
import apoo.visitor_example.visitor.BahiaTaxVisitor;
import apoo.visitor_example.visitor.SaoPauloTaxVisitor;
import apoo.visitor_example.visitor.TaxVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> produtos = List.of(
                new Electronic(1000),
                new Food(100)
        );

        TaxVisitor sp = new SaoPauloTaxVisitor();
        TaxVisitor ba = new BahiaTaxVisitor();

        System.out.println("Impostos SP:");
        produtos.forEach(p -> p.accept(sp));

        System.out.println("\nImpostos MG:");
        produtos.forEach(p -> p.accept(ba));
    }
}
