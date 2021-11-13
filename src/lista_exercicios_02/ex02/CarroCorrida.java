package lista_exercicios_02.ex02;

public class CarroCorrida {
    // Atributos
    private int numeroCarro;
    private String piloto;
    private String equipe;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    //Métodos
    public void acelerar(float velocidade) {
        if (!ligado){
            System.out.println("Não é possível acelerar com o carro desligado.");
        } else {
            if((this.velocidadeAtual + velocidade) > this.velocidadeMaxima){
                this.velocidadeAtual = this.velocidadeMaxima;
            } else {
                this.velocidadeAtual += velocidade;
            }
        }
    }

    public void frear(float percentualFrenagem) {
        if (!ligado){
            System.out.println("Não é possível frear com o carro desligado.");
        } else {
            this.velocidadeAtual *= (1 - percentualFrenagem);
        }
    }

    public void parar() {
        this.frear(1f);
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        if (this.velocidadeAtual > 0){
            System.out.println("Não é possível desligar o carro em movimento.");
        } else {
            this.ligado = false;
        }
    }

    // Getters and Setters
    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}