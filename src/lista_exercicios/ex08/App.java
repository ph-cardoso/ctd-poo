package lista_exercicios.ex08;

import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem de
erro e voltando a pedir as informações.
*/

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input
    String username = "";
    String password = "";
    do{
      System.out.printf("\nInsira o username: ");
      username = sc.nextLine();

      System.out.printf("Insira a senha: ");
      password = sc.nextLine();

      // Mensagem de erro
      if(password.equals(username)){
        System.out.printf("A senha não pode ser igual ao username...\n");
      }
    } while(password.equals(username));

    // Impressão de sucesso
    System.out.printf("\nUsuário cadastrado com sucesso!!!");

    sc.close();
  }
}
