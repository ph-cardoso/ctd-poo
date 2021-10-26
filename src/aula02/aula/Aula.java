package aula02.aula;

import java.util.Scanner;

public class Aula {
  public static void main(String[] args) {
    // Inicialização do scanner
    Scanner scanner = new Scanner(System.in);

    // Input do nome
    System.out.println("Digite o seu nome:");
    String nome = scanner.nextLine();

    // Input do sobrenome
    System.out.println("Digite o seu sobrenome:");
    String sobrenome = scanner.nextLine();

    // Input do dia
    System.out.println("Digite o dia do seu nascimento:");
    String day = scanner.nextLine();

    // Input do mês
    System.out.println("Digite o mês do seu nascimento:");
    String month = scanner.nextLine();

    // Input do ano
    System.out.println("Digite o ano do seu nascimento:");
    String year = scanner.nextLine();

    // Primeira letra do nome
    char firstLetterNome = nome.charAt(0);

    // Priemira letra do sobrenome
    char firstLetterSobrenome = sobrenome.charAt(0);

    // Impressão das informações
    System.out.printf("%s %s (%c.%c.) nasceu em %s/%s/%s", nome, sobrenome, firstLetterNome, firstLetterSobrenome, day, month, year);

    scanner.close();
  }
}
