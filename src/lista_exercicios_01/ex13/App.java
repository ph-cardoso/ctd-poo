package lista_exercicios_01.ex13;

import java.util.Scanner;

/*
Dado uma string com uma frase informada pelo usuário (incluindo
espaços em branco), conte:
1. quantos espaços em branco existem na frase.
2. quantas vezes aparecem as vogais a, e, i, o, u.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input
    System.out.println("\nInsira a frase a ser analisada?");
    String frase = sc.nextLine().toLowerCase();

    // Contadores
    int blankSpaceCount = 0;
    int vowelCount = 0;
    int aCount = 0;
    int eCount = 0;
    int iCount = 0;
    int oCount = 0;
    int uCount = 0;

    // Loop que percorre todos os caracteres da String
    for(int i = 0; i < frase.length(); i++){
      if(frase.charAt(i) == ' '){
        blankSpaceCount++;
      } else if (frase.charAt(i) == 'a'){
        aCount++;
        vowelCount++;
      } else if (frase.charAt(i) == 'e'){
        eCount++;
        vowelCount++;
      } else if (frase.charAt(i) == 'i'){
        iCount++;
        vowelCount++;
      } else if (frase.charAt(i) == 'o'){
        oCount++;
        vowelCount++;
      } else if (frase.charAt(i) == 'u'){
        uCount++;
        vowelCount++;
      }
    }

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nQuantidade de espaços em branco: %d\n", blankSpaceCount);
    System.out.printf("Quantidade de vogais: %d\n", vowelCount);
    System.out.printf("Quantidade de vogais A: %d\n", aCount);
    System.out.printf("Quantidade de vogais E: %d\n", eCount);
    System.out.printf("Quantidade de vogais I: %d\n", iCount);
    System.out.printf("Quantidade de vogais O: %d\n", oCount);
    System.out.printf("Quantidade de vogais U: %d\n", uCount);

    sc.close();
  }
}