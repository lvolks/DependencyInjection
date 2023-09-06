public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(5, 4, 3);
        Circulo c = new Circulo(3.0);
        Quadrado q = new Quadrado(5);

        Figura f = new Figura(t);
        Figura f2 = new Figura(c);
        Figura f3 = new Figura(q);


        System.out.println(f.getConteudo());
        System.out.println(f2.getConteudo());
        System.out.println(f3.getConteudo());
    }
}