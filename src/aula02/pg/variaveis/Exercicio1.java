package aula02.pg.variaveis;

public class Exercicio1 {
  public static void main(String[] args) {
    // Exemplo verdadeiro
    // Declaração das variáveis
    int n1 = 25, n2 = 5;

    // Checa se n1 é divisível por n2
    boolean isDivisible = n1%n2==0;


    // Impressão e comparação
    System.out.printf("%d %s divsível por %d\n", n1, isDivisible ? "é" : "não é", n2);

    // Exemplo falso
    // Reatribuição das variáveis
    n1 = 30;
    n2 = 7;

    // Checa se n1 é divisível por n2
    isDivisible = n1%n2==0;

    // Impressão e comparação
    System.out.printf("%d %s divsível por %d", n1, isDivisible ? "é" : "não é", n2);
  }
}
