package aula19;

public class Bola extends Produto {
    private double raio;

    public Bola(double raio, double peso) {
        super(peso);
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        return (4.0/3.0) * Math.PI * Math.pow(this.raio, 3);
    }
}