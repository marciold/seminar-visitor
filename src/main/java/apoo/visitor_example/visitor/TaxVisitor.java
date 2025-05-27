package apoo.visitor_example.visitor;

import apoo.visitor_example.domain.Electronic;
import apoo.visitor_example.domain.Food;

public interface TaxVisitor {
    void visit(Electronic electronic);
    void visit(Food food);
}
