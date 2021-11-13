package lista_exercicios_01.ex02;

import java.util.Scanner;

/*
02) João Papo-de-Pescador, homem de bem, comprou um microcomputador
para controlar o rendimento financeiro de seu trabalho. Toda vez que ele
traz um peso de peixes maior que o estabelecido pelo regulamento de
pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00
por quilo excedente. João precisa que você faça um programa que leia a
variável peso (peso de peixes) e calcule o excesso. Gravar na variável
excesso a quantidade de quilos além do limite e na variável multa o valor
da multa que João deverá pagar. Imprima os dados do programa com as
mensagens adequadas.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pega o input de peso do usuário
    String inputPeso = "";
    double peso = 0.0;
    do{
      System.out.printf("\nInsira o peso: ");
      inputPeso = sc.nextLine();

      // Transforma o input (string) para double
      peso = Double.parseDouble(inputPeso);

      // Mensagem de erro
      if(peso <= 0.0){
        System.out.printf("Peso inválido...\n");
      }
    } while(peso <= 0.0);

    // Cálculo do excesso de peso, caso exista
    double excesso = 0.0;
    if(peso > 50.0){
      excesso = peso - 50.0;
    }

    // Cálculo da multa (R$ 4,00 por quilo)
    double multa = excesso * 4.0;

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nPeso: %.2f\n", peso);
    System.out.printf("Peso em excesso: %.2f\n", excesso);
    System.out.printf("Multa: R$ %.2f\n", multa);

    sc.close();
  }
}