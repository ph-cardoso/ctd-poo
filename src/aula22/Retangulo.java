package aula22;

public class Retangulo implements Figura {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getArea() {
        return altura * largura;
    }
}