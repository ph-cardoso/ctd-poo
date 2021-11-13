package lista_exercicios_01.ex03;

import java.util.Scanner;

/*
03) Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta
é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário
a quantidades de latas de tinta a serem compradas e o preço total.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pega o input de área do usuário
    String inputArea = "";
    double area = 0.0;
    do{
      System.out.printf("\nInsira a área a ser pintada: ");
      inputArea = sc.nextLine();

      // Transforma o input (string) para double
      area = Double.parseDouble(inputArea);

      // Mensagem de erro
      if(area <= 0.0){
        System.out.printf("Área inválida...\n");
      }
    } while(area <= 0.0);

    // Cálculo da quantidade de litros de tinta necessários
    double litros = area / 3.0;

    // Cálculo da quantidade de latas de tinta necessárias
    int latas = (int)(Math.ceil(litros/18.0));

    // Cálculo do preço total
    double preco = latas * 18.0;

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nQuantidade de latas: %d\n", latas);
    System.out.printf("Preço Total: R$ %.2f\n", preco);

    sc.close();
  }
}