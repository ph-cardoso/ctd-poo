package aula02.pg.linguagem_java;

public class Exercicio2 {
  public static void main(String[] args) {
    // n1 maior que n2
    // Declaração dos Integers
    Integer n1 = 50;
    Integer n2 = 40;

    // Comparação dos valores
    int compare = n1.compareTo(n2);

    // Impressão baseada na comparação
    if(compare == 0){
      System.out.printf("%d e %d são iguais\n", n1, n2);
    } else if(compare > 0){
      System.out.printf("%d é maior que %d\n", n1, n2);
    } else {
      System.out.printf("%d é menor que %d\n", n1, n2);
    }

    // n1 menor que n2
    // Reatribuição dos Integers
    n1 = 30;
    n2 = 40;

    // Comparação dos valores
    compare = n1.compareTo(n2);

    // Impressão baseada na comparação
    if(compare == 0){
      System.out.printf("%d e %d são iguais\n", n1, n2);
    } else if(compare > 0){
      System.out.printf("%d é maior que %d\n", n1, n2);
    } else {
      System.out.printf("%d é menor que %d\n", n1, n2);
    }

    // n1 igual a n2
    // Reatribuição dos Integers
    n1 = 25;
    n2 = 25;

    // Comparação dos valores
    compare = n1.compareTo(n2);

    // Impressão baseada na comparação
    if(compare == 0){
      System.out.printf("%d e %d são iguais\n", n1, n2);
    } else if(compare > 0){
      System.out.printf("%d é maior que %d\n", n1, n2);
    } else {
      System.out.printf("%d é menor que %d\n", n1, n2);
    }
  }
}
