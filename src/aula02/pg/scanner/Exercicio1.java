package aula02.pg.scanner;

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    // Inicialização do scanner
    Scanner scanner = new Scanner(System.in);

    // Input do nome
    System.out.println("Digite o seu nome: ");
    String nome = scanner.nextLine();

    // Input do sobrenome
    System.out.println("Digite o seu sobrenome: ");
    String sobrenome = scanner.nextLine();

    // Concatenação das iniciais de nome e sobrenome na String iniciais
    String apelido = "";
    apelido += nome.charAt(0);
    apelido += ".";
    apelido += sobrenome.charAt(0);
    apelido += ".";

    // Impressão
    System.out.printf("Olá %s %s! Posso te chamar de %s?", nome, sobrenome, apelido.toUpperCase());

    scanner.close();
  }
}