public class Quadrado implements CalculoFigura{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }


    public String gerar_conteudo() {
        return "Quadrado - Área: " + getArea() + ", Perímetro: " + getPerimetro();
    }
}
