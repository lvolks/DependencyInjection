public class Figura {
    private CalculoFigura gerador;

    public Figura(CalculoFigura figura) {
        this.gerador = figura;
    }

    public double getArea() {
        return this.gerador.getArea();
    }

    public double getPerimetro() {
        return this.gerador.getPerimetro();
    }

    public String getConteudo() {
        return this.gerador.gerar_conteudo();
    }
}