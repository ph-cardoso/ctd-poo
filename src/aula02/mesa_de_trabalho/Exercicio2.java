package aula02.mesa_de_trabalho;

import java.util.Scanner;

/*
Escreva uma função que receba três números e retorne o maior valor entre os três números. Em seguida,
faça um programa que permita a entrada de 3 valores pelo usuário, use a função e exiba o resultado.
*/

public class Exercicio2 {
  public static void main(String[] args) {
    // Inicialização do Scanner
    Scanner scanner = new Scanner(System.in);

    // Input do primeiro número
    System.out.println("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    // Input do segundo número
    System.out.println("Digite o segundo número: ");
    int num2 = scanner.nextInt();

    // Input do terceiro número
    System.out.println("Digite o terceiro número: ");
    int num3 = scanner.nextInt();

    System.out.printf ("o maior número é: %d", maiorNumero(num1, num2, num3));

  }

  public static int maiorNumero(int n1, int n2, int n3) {
    // Variável que armazena o maior número
    int maior = n1;

    // Comparações
    if (n2 > maior) {
        maior = n2;
    }

    if (n3 > maior) {
        maior = n3;
    }

    return maior;
  }
}