package aula03.mesa_de_trabalho;

import java.util.Scanner;

public class Desafio1 {
  public static void main(String[] args) {
    // Inicialização do Scanner
    Scanner sc = new Scanner(System.in);

    // Input do valor de "n" pelo usuário
    System.out.printf("Digite a quantidade de números primos a ser mostrada: ");
    int n = sc.nextInt();

    // Close do scanner
    sc.close();

    // Variáveis auxiliares
    int cont = 0;
    int aux = 1;

    // Seleçãpo e impressão dos números primos
    while(cont < n){
      if(isPrime(aux)){
        System.out.println(aux);
        cont++;
      }
      aux++;
    }
  }

  public static boolean isPrime(int n){
    // Variável de controle
    int qtdDivisores = 0;

    // Lógica para analisar quantos divisores tem o número
    for(int i = 1; i <=n; i++){
      if(n % i == 0){
        qtdDivisores++;
      }
    }

    // Análise da quantidade de divisores
    if(qtdDivisores > 2 || qtdDivisores == 1){
      return false;
    }else{
      return true;
    }
  }
}
