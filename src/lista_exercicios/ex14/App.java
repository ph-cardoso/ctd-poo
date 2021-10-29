package lista_exercicios.ex14;

import java.util.Scanner;

/*
Faça um programa que permita ao usuário digitar o seu nome e em
seguida mostre o nome do usuário de trás para frente utilizando somente
letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário
pode digitar letras maiúsculas ou minúsculas.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input
    System.out.printf("\nInsira o nome: ");
    String nome = sc.nextLine().trim().toUpperCase();

    char inversao[] = new char[nome.length()];

    for(int i = 0; i < nome.length(); i++) {
      inversao[i] = nome.charAt(nome.length() - (i+1));
    }

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nNome digitado: %s\n", nome);
    System.out.printf("Inversão: ");

    // Impressão dos caracteres do vetor de inversão
    for(int i = 0; i < inversao.length; i++){
      System.out.printf("%c", inversao[i]);
    }
    System.out.printf("\n");

    sc.close();
  }
}