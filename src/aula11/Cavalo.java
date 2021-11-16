package aula11;

public class Cavalo extends Animal{
    public Cavalo(String nome, int idade){
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Sons de cavalo.mp3");
    }

    public void correr(){
        System.out.println("Correndo...");
    }
}