package apoo.raw_example;

public class Food extends Product {
    public Food(double price) {
        super(price);
    }

    @Override
    public double calcularImposto(String estado) {
        return switch (estado) {
            case "SP" -> price * 0.07;
            case "BA" -> price * 0.06;
            case "RJ" -> price * 0.05;
            default -> throw new IllegalArgumentException("Estado inválido.");
        };
    }

    @Override
    public String getTipo() {
        return "Alimento";
    }
}