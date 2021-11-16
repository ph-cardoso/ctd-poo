package aula11;

public class Preguica extends Animal {
    public Preguica(String nome, int idade){
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Sons de preguiça.mp3");
    }

    public void subirEmArvore() {
        System.out.println("Subindo em árvore...");
    }
}