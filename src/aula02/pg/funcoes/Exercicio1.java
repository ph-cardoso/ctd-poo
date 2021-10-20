package aula02.pg.funcoes;

public class Exercicio1 {
  public static void main(String[] args) {
    // Variáveis para teste
    int t1 = 4;
    int t2 = 2;

    // Impressão
    System.out.printf("%d %s divisível por %d\n", t1, isDivisible(t1, t2) ? "é" : "não é", t2);

    // Reatribuição
    t1 = 12;
    t2 = 7;

    // Impressão
    System.out.printf("%d %s divisível por %d\n", t1, isDivisible(t1, t2) ? "é" : "não é", t2);
  }

  public static boolean isDivisible(int n1, int n2){
    // Return da comparação
    return n1%n2 == 0;
  }
}
