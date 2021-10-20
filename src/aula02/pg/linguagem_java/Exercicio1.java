package aula02.pg.linguagem_java;

public class Exercicio1 {
  public static void main(String[] args) {
    // Exemplo verdadeiro
    // Definição das Strings
    String s1 = "Rato";
    String s2 = "Rato";

    // Comparação das Strings e armazenamento do resultado no booleano isEqual
    boolean isEqual = s1.equals(s2);

    // Impressão baseada na comparação
    System.out.printf("\"%s\" e \"%s\" %s\n", s1, s2, isEqual ? "são iguais" : "não são iguais");

    // Exemplo falso
    // Reatribuição das Strings
    s1 = "Rato";
    s2 = "Cachorro";

    // Nova comparação das Strings
    isEqual = s1.equals(s2);

    // Impressão baseada na comparação
    System.out.printf("\"%s\" e \"%s\" %s", s1, s2, isEqual ? "são iguais" : "não são iguais");
  }
}
