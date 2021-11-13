package lista_exercicios_02.ex03;

public class CamaroteSuperior extends Vip {
    private String localizacao = "Camarote Superior";
    private double valorAdicionalCamaroteSup;

    public CamaroteSuperior(double valor, double valorAdicionalVip, double valorAdicionalCamaroteSup) {
        super(valor + valorAdicionalCamaroteSup, valorAdicionalVip);
        this.valorAdicionalCamaroteSup = valorAdicionalCamaroteSup;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.printf("%s", this.localizacao);
    }

    public double getvalorAdicionalCamaroteSup() {
        return this.valorAdicionalCamaroteSup;
    }
}