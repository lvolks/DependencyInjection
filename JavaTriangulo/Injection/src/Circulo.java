
public class Circulo implements CalculoFigura {

    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String gerar_conteudo() {
        return "Círculo - Área: " + Math.round(getArea()) + ", Perímetro: " + Math.round(getPerimetro());
    }
}
