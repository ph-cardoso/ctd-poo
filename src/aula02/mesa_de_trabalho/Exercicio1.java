package aula02.mesa_de_trabalho;

import java.util.Scanner;

/*
Faça uma função que, dado um número, indica se é um número primo ou não. Um número primo é aquele que só pode ser dividido por 1 e ele mesmo.
Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25. 17 é primo porque só pode ser dividido por 1 e por 17.
Para usar esta função que iremos criar, podemos permitir a entrada de apenas um número do usuário para verificar se o número é primo ou não.
Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona, Boolean eDivisível (int n, int divisor).
*/

public class Exercicio1 {
  public static void main(String[] args) {
    // Inicialização do Scanner
    Scanner scanner = new Scanner(System.in);

    // Input do número pelo usuário
    System.out.println("Digite o número a ser analisado:");
    int n = scanner.nextInt();

    // Chamada da função
    isPrime(n);

    scanner.close();
  }

  public static void isPrime(int n){
    // Variável de controle
    int qtdDivisores = 0;

    // Lógica para analisar quantos divisores tem o número
    for(int i = 1; i<=n; i++){
      if(n%i == 0){
        qtdDivisores++;
      }
    }

    // Impressão do resultado
    if(qtdDivisores > 2){
      System.out.println("O número informado não é primo");
    } else {
      System.out.println("O número informado é primo");
    }
  }
}