package lista_exercicios.ex06;

import java.util.Scanner;

/*
Faça um programa que peça para n pessoas a sua idade, ao final o
programa deverá verificar se a média de idade da turma varia entre 0 e
25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou
idosa, conforme a média calculada.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input da quantidade pessoas que irão inserir a idade
    int qtdPessoas = 0;
    do{
      System.out.printf("\nInsira a quantidade de pessoas: ");
      qtdPessoas = sc.nextInt();

      // Mensagem de erro
      if(qtdPessoas <= 0){
        System.out.printf("Quantidade de pessoas inválida...\n");
      }
    } while(qtdPessoas <= 0);

    // Criação de um vetor de inteiros para armazenar as idades
    int idades[] = new int[qtdPessoas];

    // Loop para input de idades
    for(int i = 0; i < qtdPessoas; i++){
      do{
        System.out.printf("\nInsira a idade %d: ", i+1);
        idades[i] = sc.nextInt();

        // Mensagem de erro
        if(idades[i] <= 0){
          System.out.printf("Idade inválida...\n");
        }
      } while(idades[i] <= 0);
    }

    // Média das idades
    double media = mediaIdades(idades);

    // Classificação do grupo
    String classificacao = classificaGrupo(media);

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nMédia das idades: %.2f\n", media);
    System.out.printf("Classificação do grupo: %s\n", classificacao);

    sc.close();
  }

  public static double mediaIdades(int idades[]){
    // Soma das idades
    int soma = 0;
    for(int i = 0; i < idades.length; i++){
      soma += idades[i];
    }

    return (double)soma/idades.length;
  }

  public static String classificaGrupo(double media){
    if(media > 0.0 && media <= 25.0){
      return "Jovens";
    } else if(media >= 26.0 && media <= 60){
      return "Adultos";
    } else {
      return "Idosos";
    }
  }
}