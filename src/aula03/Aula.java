package aula03;

import java.util.Scanner;

public class Aula {
  public static void main(String[] args) {
    // Inicialização do scanner
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o nome do cachorrinho: ");
    String nome = entrada.nextLine();

    System.out.println("Digite a quantidade de ração: ");
    String quantAux = entrada.nextLine();
    float quantidade = Float.parseFloat(quantAux);

    int qtdPacotes = quantPacotes(quantidade);

    System.out.printf("\n\n%s come %.2fkg de ração\n", nome, quantidade);
    System.out.printf("%s precisa de %d pacotes\n", nome, qtdPacotes);

    entrada.close();
  }

  public static int quantPacotes(float quantidade){
    float kilo = 0.0f;
    int qtdPacotes = 0;

    Scanner scanner2 = new Scanner(System.in);
    String pacoteAux;
    float pacote;

    while(kilo < quantidade){
      System.out.println("Digite o peso do pacote: ");
      pacoteAux = scanner2.nextLine();

      pacote = Float.parseFloat(pacoteAux);

      kilo += pacote;
      qtdPacotes++;
    }

    scanner2.close();
    return qtdPacotes;
  }
}