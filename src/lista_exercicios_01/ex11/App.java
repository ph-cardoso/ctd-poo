package lista_exercicios_01.ex11;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
número ele deseja ver a tabuada. A saída deve ser conforme o exemplo
abaixo:
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input
    int number;
    while(true) {
      System.out.printf("\nInsira um número para gerar a tabuada: ");
      number = sc.nextInt();

      if((number > 0) && (number <= 10)){
        break;
      } else {
        System.out.printf("Número inválido...\n");
      }
    }

    // Header da impressão
    System.out.printf("\n------- Relatório -------\n\n");
    // Loop para impressão da tabuada
    for(int i = 1; i <= 10; i++){
      System.out.printf("%d x %d = %d\n", number, i, number * i);
    }

    sc.close();
  }
}