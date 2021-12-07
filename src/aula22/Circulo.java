package aula22;

public class Circulo implements Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}