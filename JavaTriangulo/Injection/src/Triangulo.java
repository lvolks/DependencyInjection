public class Triangulo implements CalculoFigura { // CONSIDERANDO O TRIÂNGULO COMO TRIÂNGULO EQUILÁTERO
    private double lado;
    private double base;
    private double altura;

    public Triangulo(double base, double altura, double lado) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return lado * 3;
    }


    public String gerar_conteudo() {
        return "Triângulo - Área: " + getArea() + ", Perímetro: " + getPerimetro();
    }
}
