package lista_exercicios_02.ex03;

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.printf("R$ %.2f", this.valor);
    }

    public double getValor() {
        return this.valor;
    }
}
