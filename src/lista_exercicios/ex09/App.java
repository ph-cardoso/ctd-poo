package lista_exercicios.ex09;

import java.util.ArrayList;
import java.util.Scanner;

/*
O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Declaração de um arraylist para armazenar temperaturas
    ArrayList<Double> temperaturas = new ArrayList<Double>();

    // Input
    String temperaturaInput = "";
    double temperatura = 0.0;
    int inputCount = 0;
    System.out.printf("\nPara sair da inserção de temperatura, insira \"exit\"\n");
    do {
      // Input de temperatura
      System.out.printf("\nInsira a temperatura %d: ", inputCount + 1);
      temperaturaInput = sc.nextLine().toLowerCase();
      inputCount++;

      if(temperaturaInput.equals("exit")){
        break;
      }
      // Transforma o input (string) para double
      temperatura = Double.parseDouble(temperaturaInput);

      temperaturas.add(temperatura);
    } while(true);

    // Determinação do maior, menor e média
    double maiorTemp = temperaturas.get(0);
    double menorTemp = temperaturas.get(0);
    double soma = 0.0;

    // Loop que percorre todos os elementos do ArrayList
    for(int i = 0; i < temperaturas.size(); i++){
      // Determinação do maior
      if(maiorTemp < temperaturas.get(i)){
        maiorTemp = temperaturas.get(i);
      }

      // Determinação do menor
      if(menorTemp > temperaturas.get(i)){
        menorTemp = temperaturas.get(i);
      }

      // Soma
      soma += temperaturas.get(i);
    }

    // Média
    double media = soma/temperaturas.size();

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nMaior temperatura: %.2f\n", maiorTemp);
    System.out.printf("Menor temperatura: %.2f\n", menorTemp);
    System.out.printf("Média: %.2f\n", media);

    sc.close();
  }
}