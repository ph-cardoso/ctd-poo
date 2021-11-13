package lista_exercicios_02.ex03;

public class Vip extends Ingresso {
    private double valorAdicionalVip;

    public Vip(double valor, double valorAdicionalVip) {
        super(valor + valorAdicionalVip);
        this.valorAdicionalVip = valorAdicionalVip;
    }

    public double getValorAdicionalVip() {
        return this.valorAdicionalVip;
    }
}