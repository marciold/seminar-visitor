package apoo.raw_example;

public class Electronic extends Product{
    public Electronic(double price) {
        super(price);
    }

    @Override
    public double calcularImposto(String estado) {
        return switch (estado) {
            case "SP" -> price * 0.18;
            case "BA" -> price * 0.19;
            case "RJ" -> price * 0.20;
            default -> throw new IllegalArgumentException("Estado inválido.");
        };
    }

    @Override
    public String getTipo() {
        return "Eletrônico";
    }
}
