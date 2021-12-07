package aula22;

public class Triangulo implements Figura {
    private double largura;
    private double altura;

    public Triangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea() {
        return (largura * altura) / 2;
    }
}