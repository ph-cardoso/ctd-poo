package aula03.desafios_extras;

import java.util.Scanner;

// 40 horas semanais
// Extra => 50% a mais do que a jornada normal
// x horas na semana
// 875,00 por semana
// 875 / 40 = 21,875 por hora
// 21,875 * 1.5 = 32,8125

public class Desafio4 {
  public static void main(String[] args) {
    // Inicialização do Scanner
    Scanner sc = new Scanner(System.in);

    // Input da quantidade de horas trabalhadas
    System.out.printf("Quantas horas você trabalhou na semana?  ");
    int x = sc.nextInt();

    // Close do scanner
    sc.close();

    // Impressão do salário
    System.out.printf("\nO seu salário semanal é de R$ %.2f", weekSalary(x));
  }

  public static double weekSalary(int x){
    // Variáveis que armazenam as horas trabalhadas
    int horas = 0;
    int horasExtras = 0;

    // Variáveis que armazenam o preço por hora
    double precoHora = 875.0/40.0;
    double precoHoraExtra = precoHora * 1.5;

    // Definição das horas extras, caso existam
    if(x > 40){
      horasExtras = x - 40;
      horas = 40;
    } else {
      horas = x;
    }

    // Cálculo do salário
    double salario = horas * precoHora + horasExtras * precoHoraExtra;

    // Retorno do salário
    return salario;
  }
}
