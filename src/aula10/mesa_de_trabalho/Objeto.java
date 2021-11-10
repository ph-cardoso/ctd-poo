package aula10.mesa_de_trabalho;

public class Objeto {
    private int posx;
    private int posy;
    private char direcao;

    Objeto(int x, int y, char direcao) {
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA(int x, int y, char direcao) {
        this.posx += x;
        this.posy += y;
        this.direcao = direcao;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
}
