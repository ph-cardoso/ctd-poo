package aula06.mesa_de_trabalho;

public class App {
  public static void main(String[] args) {
    Cachorro astolfo = new Cachorro("Vira lata", 2018, 8.25, true, false, "Astolfo");
    Cachorro rodolfo = new Cachorro("Shih-tzu", 2021, 3.5, false, false, "Rodolfo");

    astolfo.encaminharAdocao();
    rodolfo.encaminharAdocao();
  }
}