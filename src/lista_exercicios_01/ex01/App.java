package lista_exercicios_01.ex01;

import java.util.Scanner;

/*
01) Tendo como dados de entrada a altura do usuário, construa um algoritmo
que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 .
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pega o input de altura do usuário
    String inputAltura = "";
    double altura = 0.0;
    do{
      System.out.printf("\nInsira a sua altura: ");
      inputAltura = sc.nextLine();

      // Transforma o input (string) para double
      altura = Double.parseDouble(inputAltura);

      // Mensagem de erro
      if(altura <= 0.0){
        System.out.printf("Altura inválida...\n");
      }
    } while(altura <= 0.0);

    // Calcula o peso ideal
    double pesoIdeal = (72.7 * altura) - 58.0;

    // Imprime o peso ideal
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nO seu peso ideal é: %.2f kg", pesoIdeal);

    sc.close();
  }
}