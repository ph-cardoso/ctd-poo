package lista_exercicios_01.ex05;

import java.util.Scanner;

/*
Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
a) Álcool:
- até 20 litros, desconto de 3% por litro
- acima de 20 litros, desconto de 5% por litro
b) Gasolina:
- até 20 litros, desconto de 4% por litro
- acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input do tipo
    char tipo;
    do{
      System.out.printf("\nInsira o tipo de combustível: ");
      // Pega o tipo de combustível: String => Transformação UpperCase => Primeiro Char
      tipo = sc.nextLine().toUpperCase().charAt(0);

      // Mensagem de erro
      if(tipo != 'A' && tipo != 'G'){
        System.out.printf("Tipo de combustível inválido...\n");
      }
    } while(tipo != 'A' && tipo != 'G');

    // Input dos litros abastecidos
    double litros = 0.0;
    String litrosInput = "";
    do{
      System.out.printf("\nInsira a quantidade de litros: ");
      litrosInput = sc.nextLine();

      // Transforma o input (string) para double
      litros = Double.parseDouble(litrosInput);

      // Mensagem de erro
      if(litros <= 0.0){
        System.out.printf("Quantidade de litros inválida...\n");
      }
    } while(litros <= 0.0);

    // Determinação do preço de acordo com o tipo
    double price = 0.0;
    double alcoholPrice = 1.90;
    double gasolinePrice = 2.50;
    if(tipo == 'A'){
      price = alcoholCalc(litros, alcoholPrice);
    } else {
      price = gasolineCalc(litros, gasolinePrice);
    }

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nPreco a ser pago: R$ %.2f\n", price);

    sc.close();
  }

  public static double alcoholCalc(double litros, double fuelPrice){
    // litro de álcool = R$ 1,90
    if(litros <= 20.0){
      return litros * (fuelPrice * 0.97);
    } else {
      return litros * (fuelPrice * 0.95);
    }
  }

  public static double gasolineCalc(double litros, double fuelPrice){
    // litro de gasolina = R$ 2,50
    if(litros <= 20.0){
      return litros * (fuelPrice * 0.96);
    } else {
      return litros * (fuelPrice * 0.94);
    }
  }
}