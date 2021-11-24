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
}