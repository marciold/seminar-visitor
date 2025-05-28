package apoo.raw_example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> produtos = List.of(
                new Electronic(1000),
                new Food(100)
        );

        String[] estados = {"SP", "BA", "RJ"};

        for (String estado : estados) {
            System.out.println("Impostos " + estado + ":");
            for (Product p : produtos) {
                double imposto = p.calcularImposto(estado);
                System.out.printf("Imposto %s - %s: R$%.2f\n", estado, p.getTipo(), imposto);
            }
        }
    }
}
