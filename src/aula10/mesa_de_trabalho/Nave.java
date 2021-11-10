package aula10.mesa_de_trabalho;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int x, int y, char direcao, double velocidade){
        super(x, y, direcao);
        this.velocidade = velocidade;
        this.vida = 100;
    }

    @Override
    public void irA(int x, int y, char direcao){
        super.setPosx(getPosx() + (int)(x * velocidade));
        super.setPosy(getPosy() + (int)(y * velocidade));
        super.setDirecao(direcao);
    }

    public void girar(char direcao){
        super.setDirecao(direcao);
    }

    public void restaVida(int valor){
        this.vida -= valor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}