package aula11;

public class App {
    public static void main(String[] args) {
        Preguica preguica = new Preguica("Pablo", 6);
        Cachorro cachorro = new Cachorro("Scooby", 9);
        Cavalo cavalo = new Cavalo("José", 10);

        preguica.emitirSom();
        cachorro.emitirSom();
        cavalo.emitirSom();

        preguica.subirEmArvore();
        cachorro.correr();
        cavalo.correr();
    }
}