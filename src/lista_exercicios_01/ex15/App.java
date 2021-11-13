package lista_exercicios_01.ex15;

import java.util.Scanner;

/*
Faça um Programa que pergunte quanto você ganha por hora e o número
de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input do ganho por hora
    String ganhoHoraInput = "";
    double ganhoHora = 0.0;
    do{
      System.out.printf("\nInsira o quanto você ganha por hora: ");
      ganhoHoraInput = sc.nextLine();

      // Tranforam o input (string) em double
      ganhoHora = Double.parseDouble(ganhoHoraInput);

      // Mensagem de erro
      if(ganhoHora <= 0.0){
        System.out.printf("\nValor inválido...");
      }
    } while(ganhoHora <= 0.0);

    // Input do número de horas trabalhado no mês
    int horasMes = 0;
    do{
      System.out.printf("\nInsira quantas horas você trabalhou no mês: ");
      horasMes = sc.nextInt();

      // Mensagem de erro
      if(horasMes <= 0){
        System.out.printf("\nValor inválido...");
      }
    } while(horasMes <= 0);

    double salario = ganhoHora * horasMes;

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nSalário do mês: R$ %.2f\n", salario);

    sc.close();
  }
}