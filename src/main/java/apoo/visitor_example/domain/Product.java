package apoo.visitor_example.domain;

import apoo.visitor_example.visitor.TaxVisitor;

public interface Product {
    void accept(TaxVisitor visitor);
}
