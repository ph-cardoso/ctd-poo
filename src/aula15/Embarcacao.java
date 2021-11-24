package aula15;

public abstract class Embarcacao {
    private Capitao capitao;
    private double precoBase;
    private double valorAdicional;
    private int anoFabricacao;
    private double comprimento;

    public Embarcacao(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento) {
        this.capitao = capitao;
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
    }

    public double calculaAluguel(){
        if(anoFabricacao > 2020){
            return precoBase + valorAdicional;
        } else {
            return precoBase;
        }
    }

    public Capitao getCapitao() {
        return capitao;
    }

    public void setCapitao(Capitao capitao) {
        this.capitao = capitao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }


}