package aula15;

public class Iate extends Embarcacao implements Comparable<Iate> {
    private int cabines;

    public Iate(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento, int cabines) {
        super(capitao, precoBase, valorAdicional, anoFabricacao, comprimento);
        this.cabines = cabines;
    }

    public int compareTo(Iate iate){
        if(this.cabines == iate.cabines){
            return 0;
        } else if(this.cabines < iate.cabines){
            return -1;
        } else {
            return 1;
        }
    }
}