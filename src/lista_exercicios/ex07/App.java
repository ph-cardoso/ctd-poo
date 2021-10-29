package lista_exercicios.ex07;

import java.util.Scanner;

/*
As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contrataram para desenvolver o programa que
calculará os reajustes. Faça um programa que recebe o salário de um
colaborador e o reajuste segundo o seguinte critério, baseado no salário
atual:
- salários até R$ 280,00 (incluindo) : aumento de 20%
- salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
- salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
- salários de R$ 1500,00 em diante : aumento de 5%
Após o aumento ser realizado, informe na tela:
- o salário antes do reajuste;
- o percentual de aumento aplicado;
- o valor do aumento;
- o novo salário, após o aumento.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input do salário
    double salario = 0.0;
    String salarioInput = "";
    do{
      System.out.printf("\nInsira o salário atual: ");
      salarioInput = sc.nextLine();

      // Transforma o input (string) para double
      salario = Double.parseDouble(salarioInput);

      // Mensagem de erro
      if(salario <= 0.0){
        System.out.printf("Salário inválido...\n");
      }
    } while(salario <= 0.0);

    // Comparação
    double novoSalario = 0;
    double percentual = 0.0;
    if(salario <= 280.0){
      percentual = 0.2;
      novoSalario = salario * (1 + percentual);
    } else if(salario > 280.0 && salario <= 700.0){
      percentual = 0.15;
      novoSalario = salario * (1 + percentual);
    } else if(salario > 700.0 && salario <= 1500.0){
      percentual = 0.1;
      novoSalario = salario * (1 + percentual);
    } else {
      percentual = 0.05;
      novoSalario = salario * (1 + percentual);
    }

    // Impressão dos dados
    System.out.printf("\n------- Relatório -------\n");
    System.out.printf("\nSalário antigo: R$ %.2f\n", salario);
    System.out.printf("Percentual de aumento: %d%%\n", (int)(percentual * 100));
    System.out.printf("Valor de aumento: R$ %.2f\n", novoSalario - salario);
    System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

    sc.close();
  }
}