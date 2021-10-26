package aula05.aula;

public class Aula {
  public static void main(String[] args) {
    Cliente c = new Cliente(456, "Gustavo");
    System.out.println(c.getNome());
    c.setNome("Guilherme");
    System.out.println(c.getNome());
    c.aumentarDivida(100);
  }
}
