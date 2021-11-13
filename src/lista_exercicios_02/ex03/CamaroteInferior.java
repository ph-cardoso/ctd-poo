package lista_exercicios_02.ex03;

public class CamaroteInferior extends Vip {
    private String localizacao = "Camarote Inferior";

    public CamaroteInferior(double valor, double valorAdicionalVip) {
        super(valor, valorAdicionalVip);
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.printf("%s", this.localizacao);
    }
}