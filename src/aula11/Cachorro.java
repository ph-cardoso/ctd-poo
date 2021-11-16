package aula11;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons de cachorro.mp3");
    }

    public void correr(){
        System.out.println("Correndo...");
    }
}