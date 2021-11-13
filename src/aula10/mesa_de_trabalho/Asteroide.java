package aula10.mesa_de_trabalho;

public class Asteroide extends Objeto {
    private int danos;

    public Asteroide(int x, int y, char direcao, int danos) {
        super(x, y, direcao);
        this.danos = danos;
    }

    @Override
    public void irA(int x, int y, char direcao){
        super.setPosx(getPosx() + x);
        super.setPosy(getPosy() + y);
        super.setDirecao(direcao);
    }

    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }
}