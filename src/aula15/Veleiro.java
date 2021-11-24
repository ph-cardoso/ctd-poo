package aula15;

public class Veleiro extends Embarcacao {
    private int mastros;

    public Veleiro(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento, int mastros) {
        super(capitao, precoBase, valorAdicional, anoFabricacao, comprimento);
        this.mastros = mastros;
    }

    public boolean seGrande(){
        return mastros > 4 ? true : false;
    }
}