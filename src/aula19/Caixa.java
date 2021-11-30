package aula19;

public class Caixa extends Produto {
    private double comprimento;
    private double altura;
    private double largura;

    public Caixa(double comprimento, double altura, double largura, double peso) {
        super(peso);
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularEspaco() {
        return this.comprimento * this.altura * this.largura;
    }
}