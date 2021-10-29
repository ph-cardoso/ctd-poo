package lista_exercicios.ex10;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input
    String notaInput = "";
    double nota = 0.0;
    while(true) {
      System.out.printf("\nInsira uma nota: ");
      notaInput = sc.nextLine();

      // Transforma o input (string) para double
      nota = Double.parseDouble(notaInput);

      if((nota >= 0) && (nota <= 10)){
        break;
      } else {
        System.out.printf("Nota inválida...\n");
      }
    }

    System.out.printf("\nNota computada com sucesso!!!");

    sc.close();
  }
}