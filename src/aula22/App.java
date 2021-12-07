package aula22;

public class App {
    public static void main(String[] args) {
        Retangulo retang1 = new Retangulo(5, 4);
        Circulo circ1 = new Circulo(1);
        Circulo circ2 = new Circulo(1);
        Circulo circ3 = new Circulo(1);

        VagaoComposite vagao = new VagaoComposite();
        vagao.addFigura(retang1);
        vagao.addFigura(circ1);
        vagao.addFigura(circ2);
        vagao.addFigura(circ3);

        System.out.println("Vagão: " + vagao.getArea());

        Retangulo retang2 = new Retangulo(6, 4);
        Circulo circ4 = new Circulo(1);
        Circulo circ5 = new Circulo(1);
        Triangulo triang1 = new Triangulo(2, 2);

        VagaoComposite locomotiva = new VagaoComposite();
        locomotiva.addFigura(retang2);
        locomotiva.addFigura(circ4);
        locomotiva.addFigura(circ5);
        locomotiva.addFigura(triang1);

        System.out.println("Locomotiva: " + locomotiva.getArea());
    }
}